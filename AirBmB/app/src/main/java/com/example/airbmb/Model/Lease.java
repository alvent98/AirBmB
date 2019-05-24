package com.example.airbmb.Model;

import java.time.Period;
import java.util.*;

public class Lease {
	private static int num=0; 
	private Renter renter;
	private Owner owner;
	private int leaseId;
    private Period duration;
    private double cost;
    private static Period averageDuration = Period.ZERO;
	private static ArrayList<Lease> leaseList = new ArrayList<Lease>();

    public Lease(Period duration, double cost, Renter renter, Owner owner) {
        duration = duration.normalized();
        this.duration = duration;
        this.cost = cost;
        this.renter = renter;
        this.owner = owner;
        leaseId = num++;
        recalculateAverage();
    }

    public int getLeaseId() {
        return leaseId;
    }

    public void setDuration(Period duration) {
        duration = duration.normalized();
        this.duration = duration;
    }

    public Period getDuration() {
        return duration;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public static int getNumOfLeases() {
        return leaseList .size();
    }

    public static Period getAverageDuration() {
        return averageDuration;
    }

    /**
	 * @return the renter
	 */
	public Renter getRenter() {
		return renter;
	}

	/**
	 * @param renter the renter to set
	 */
	public void setRenter(Renter renter) {
		this.renter = renter;
	}

	/**
	 * @return the owner
	 */
	public Owner getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	private static void recalculateAverage() {
        if (!leaseList.isEmpty()) {
            Period sum = Period.ZERO;
            int num = getNumOfLeases();
            for (Lease l : leaseList) {
                sum = sum.plusDays(l.getDuration().getDays());
                sum = sum.plusMonths(l.getDuration().getMonths());
                sum = sum.plusYears(l.getDuration().getYears());
                sum = sum.normalized();
            }
            averageDuration = Period.of(sum.getYears() / num, sum.getMonths() / num, sum.getDays() / num);
            averageDuration = averageDuration.normalized();
        } else {
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


    public static Lease findLeaseById(long id) {
        for (Lease l : leaseList) {
            if (l.getLeaseId() == id) return l;
        }
        return null;
    }

    public static ArrayList<Lease> findLeaseByDuration(Period duration) {
        ArrayList<Lease> returnedLeases = new ArrayList<Lease>();
        duration = duration.normalized();
        for (Lease l : leaseList) {
            if (l.getDuration().equals(duration)) returnedLeases.add(l);
        }
        return returnedLeases;
    }

    public static ArrayList<Lease> findLeaseByCost(double cost) {
        ArrayList<Lease> returnedLeases = new ArrayList<Lease>();
        for (Lease l : leaseList) {
            if (l.getCost() == cost) returnedLeases.add(l);
        }
        return returnedLeases;
    }
    
    public void remove() {
    	leaseList.remove(this);
    }

    public static void removeAll() {
        leaseList.clear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lease lease = (Lease) o;
        return leaseId == lease.leaseId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(leaseId);
    }

	public long getId() {
		return leaseId;
	}
}