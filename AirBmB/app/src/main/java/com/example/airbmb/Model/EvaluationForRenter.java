package com.example.airbmb.Model;

import java.util.*;

public class EvaluationForRenter extends Evaluation {

    private int repairsValue = 0;
    private static ArrayList<EvaluationForRenter> evaluationsForRentersList = new ArrayList<EvaluationForRenter>();
    private static double averageFeedbackForRenters = 0;

    public EvaluationForRenter(int feedback) {
        this(feedback,"",0);
    }

    public EvaluationForRenter(int feedback, String comments, int repairsValue) {
        super(feedback,comments);
        this.repairsValue = repairsValue;
        evaluationsForRentersList.add(this);
        recalculateAverage();
    }

    public void setRepairsValue(int repairsValue) {
        this.repairsValue = repairsValue;
    }

    public int getRepairsValue() {
        return repairsValue;
    }

    public static double getAverageFeedback() {
        return averageFeedbackForRenters;
    }

    public static int getNumOfEvaluations() {
        return evaluationsForRentersList.size();
    }

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
