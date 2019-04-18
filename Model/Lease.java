import java.time.Period;
import java.util.ArrayList;
import java.util.Random;

public class Lease {
    private long leaseId = new Random().nextLong();
    private Period duration;
    private double cost;
    private static ArrayList<Lease> leaseList = new ArrayList<Lease>();
    private static Period averageDuration = Period.ZERO;

    public Lease(Period duration, double cost){
    	duration = duration.normalized();
        this.duration=duration;
        this.cost=cost;
        leaseList.add(this);
        recalculateAverage();
    }

    public long getLeaseId() { return leaseId; }

    public void setDuration(Period duration) {
    	duration = duration.normalized();
    	this.duration=duration;
    }

    public Period getDuration() { return duration;}

    public void setCost(double cost) { this.cost=cost; }

    public double getCost() { return cost; }

    public static int getNumOfLeases() { return leaseList.size(); }

    public static Period getAverageDuration() { return averageDuration; }

    public void remove() {
        if(!leaseList.isEmpty()) {
            leaseList.remove(this);
            recalculateAverage();            
        }
    }

    private static void recalculateAverage() {
    	if(!leaseList.isEmpty()) {
	        Period sum = Period.ZERO;
	        int num = getNumOfLeases();
	        for (Lease l : leaseList) {
	            sum = sum.plusDays(l.getDuration().getDays());
	            sum = sum.plusMonths(l.getDuration().getMonths());
	            sum = sum.plusYears(l.getDuration().getYears());
	            sum = sum.normalized();
	        }
	        averageDuration = Period.of(sum.getYears()/num,sum.getMonths()/num,sum.getDays()/num);
	        averageDuration = averageDuration.normalized();
        }else {
        	averageDuration = Period.ZERO;
        }
    }
	
	public boolean similarWith(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lease other = (Lease) obj;
		if (cost != other.cost)
			return false;
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (!duration.equals(other.duration))
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (leaseId ^ (leaseId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lease other = (Lease) obj;
		if (leaseId != other.leaseId)
			return false;
		return true;
	}

	public static Lease findLeaseById(long id) {
		for(Lease l : leaseList) {
			if(l.getLeaseId()==id) return l;
		}
		return null;
	}
	
	public static ArrayList<Lease> findLeaseByDuration(Period duration){
		ArrayList<Lease> returnedLeases = new ArrayList<Lease>();
		duration = duration.normalized();
		for(Lease l : leaseList) {
			if(l.getDuration().equals(duration)) returnedLeases.add(l);
		}
		return returnedLeases;
	}
	
	public static ArrayList<Lease> findLeaseByCost(double cost){
		ArrayList<Lease> returnedLeases = new ArrayList<Lease>();
		for(Lease l : leaseList) {
			if(l.getCost()==cost) returnedLeases.add(l);
		}
		return returnedLeases;
	}
	
	public static void removeAll() {
		leaseList.clear();
	}
} 