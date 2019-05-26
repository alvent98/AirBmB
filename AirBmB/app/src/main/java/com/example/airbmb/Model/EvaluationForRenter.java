package com.example.airbmb.Model;

import java.util.*;

/**
 * Evaluation for Renter
 */
public class EvaluationForRenter extends Evaluation {

    private int repairsValue = 0;
    private static ArrayList<EvaluationForRenter> evaluationsForRentersList = new ArrayList<EvaluationForRenter>();
    private static double averageFeedbackForRenters = 0;

    /**
     * Constructor that initializes the rating
     * The Owner rates the Renter with a score from 1 to 5
     * @param lease lease
     * @param feedback Owner's rating
     */
    public EvaluationForRenter(Lease lease, int feedback) {
        this(lease, feedback,"",0);
    }

    /**
     * Constructor that initializes the characteristics of an evaluation for the Renter
     * @param lease lease
     * @param feedback Owner's rating
     * @param comments Owner's review
     * @param repairsValue the cost of damages, if they exist
     */
    public EvaluationForRenter(Lease lease, int feedback, String comments, int repairsValue) {
        super(lease, feedback,comments);
        this.repairsValue = repairsValue;
        evaluationsForRentersList.add(this);
        recalculateAverage();
    }

    /**
     * Sets the cost of the damages
     * @param repairsValue the cost of the damages, if they exist
     */
    public void setRepairsValue(int repairsValue) {
        this.repairsValue = repairsValue;
    }

    /**
     * Returns the cost of the damages
     * @return repairsValue
     */
    public int getRepairsValue() {
        return repairsValue;
    }

    public static double getAverageFeedback() {
        return averageFeedbackForRenters;
    }

    public static int getNumOfEvaluations() {
        return evaluationsForRentersList.size();
    }

    /**
     * @return true if damages exist, else returns false
     */
    public boolean damages() {
        return repairsValue!=0;
    }

    private static void recalculateAverage() {
        averageFeedbackForRenters = 0;
        int num = getNumOfEvaluations();
        if(num!=0) {
            for (EvaluationForRenter e : evaluationsForRentersList) averageFeedbackForRenters += e.getFeedback();
            averageFeedbackForRenters /= num;
        }
    }

    public void remove() {
        if(!evaluationsForRentersList.isEmpty()) evaluationsForRentersList.remove(this);
        recalculateAverage();
    }

    public static void removeAll() {
        evaluationsForRentersList.clear();
        recalculateAverage();
    }

}