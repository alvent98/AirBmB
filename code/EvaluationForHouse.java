import java.util.ArrayList;

public class EvaluationForHouse extends Evaluation {
        private static ArrayList<EvaluationForHouse> evaluationsForHousesList ;
        private static double averageFeedbackForHouses;

        public EvaluationForHouse() {
            evaluationsForHousesList.add(this);
            recalculateAverage();
        }

        public EvaluationForHouse(long evaluationId, int feedback, String comments, long repairsValue) {
            super(evaluationId,feedback,comments);
            evaluationsForHousesList.add(this);
            recalculateAverage();
        }

        public static double getAverageFeedbackForRenter() { return averageFeedbackForHouses; }

        public static int getNumOfEvaluationsForHouses() { return evaluationsForHousesList.size(); }

        private static void recalculateAverage() {
            averageFeedbackForHouses = 0;
            int num = getNumOfEvaluationsForHouses();
            for (EvaluationForHouse e : evaluationsForHousesList) averageFeedbackForHouses += e.getFeedback();
            averageFeedbackForHouses /= num;
        }
}
