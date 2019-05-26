package com.example.airbmb.Model;

/**
 * Evaluation for a House
 */
public class EvaluationForHouse extends Evaluation {

	/**
     * Constructor that initializes the rating
     * The Renter rates the House with a score from 1 to 5
     * @param lease lease
     * @param feedback Renter's review
     */
    public EvaluationForHouse(Lease lease, int feedback) {
        this(lease,feedback,"");
    }

    /**
     * Constructor that initializes the characteristics of an evaluation for a house
     * @param feedback Renter's rating for the House
     * @param comments Renter's review for the House
     */
    public EvaluationForHouse(Lease lease, int feedback, String comments) {
        super(lease, feedback,comments);
    }

//    public static double getAverageFeedbackForHouse() {
//        return averageFeedbackForHouses;
//    }

//    private static void recalculateAverage() {
//        averageFeedbackForHouses = 0;
//        int num = getNumOfEvaluations();
//        if(num!=0) {
//            for (EvaluationForHouse e : evaluationsForHousesList) averageFeedbackForHouses += e.getFeedback();
//            averageFeedbackForHouses /= num;
//        }
//    }
}
