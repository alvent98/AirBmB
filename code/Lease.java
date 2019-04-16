import java.time.Period;
import java.util.ArrayList;

public class Lease {
    private int leaseId;
    private Period duration;
    private static Period averageDuration = Period.ZERO;
    private long cost;
    private static ArrayList<Lease> leaseList ;
    private long repairsValue = 0;

    public long getRepairsValue() {
        return repairsValue;
    }

    public void setRepairsValue(long repairsValue) {
        this.repairsValue = repairsValue;
    }

    Lease(){}

    Lease(Period duration, long cost){
        this.duration=duration;
        this.cost=cost;
        leaseList.add(this);
        recalculateAverage();
    }

    public void setDuration(Period duration){
        this.duration=duration;
    }

    public Period getDuration(){
        return duration;
    }

    public void setCost(long cost){
        this.cost=cost;
    }

    public long getCost(){
        return cost;
    }

    public int getNumOfLeases() { return leaseList.size(); }

    private void recalculateAverage() {
        Period sum = Period.ZERO;
        int num = getNumOfLeases();
        for (Lease l : leaseList) {
            sum = sum.plusDays(l.getDuration().getDays());
            sum = sum.plusMonths(l.getDuration().getMonths());
            sum = sum.plusYears(l.getDuration().getYears());
            sum = sum.normalized();
        }
        averageDuration.of(sum.getYears()/num,sum.getMonths()/num,sum.getDays()/num);
    }
}