import java.time.Period;
import java.util.ArrayList;
import java.util.Random;

public class Lease {
    private long leaseId = new Random().nextLong();
    private Period duration;
    private long cost;
    private static ArrayList<Lease> leaseList ;
    private static Period averageDuration = Period.ZERO;

    Lease(Period duration, long cost){
        this.duration=duration;
        this.cost=cost;
        leaseList.add(this);
        recalculateAverage();
    }

    public long getLeaseId() { return leaseId; }

    public void setDuration(Period duration){
        this.duration=duration;
    }

    public Period getDuration(){
        return duration;
    }

    public void setCost(long cost){ this.cost=cost; }

    public long getCost(){
        return cost;
    }

    public static int getNumOfLeases() { return leaseList.size(); }

    public static Period getAverageDuration() { return averageDuration; }

    public void removeLease() {
        if(!leaseList.isEmpty()) {
            leaseList.remove(this);
            recalculateAverage();
        }
    }

    private static void recalculateAverage() {
        Period sum = Period.ZERO;
        int num = getNumOfLeases();
        for (Lease l : leaseList) {
            sum = sum.plusDays(l.getDuration().getDays());
            sum = sum.plusMonths(l.getDuration().getMonths());
            sum = sum.plusYears(l.getDuration().getYears());
            sum = sum.normalized();
        }
        averageDuration = averageDuration.of(sum.getYears()/num,sum.getMonths()/num,sum.getDays()/num);
    }
}