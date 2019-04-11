import java.time.Period;

public class Lease {
    private static int numOfLeases;
    private int leaseId;
    private Period duration;
    private static String averageDuration;
    private Money cost;

    Lease(){}

    Lease(Period duration, Money cost){
        this.duration=duration;
        this.cost=cost;
    }

    public void setDuration(Period duration){
        this.duration=duration;
    }

    public Period getDuration(){
        return duration;
    }

    public void setCost(Money cost){
        this.cost=cost;
    }

    public Money getCost(){
        return cost;
    }
}