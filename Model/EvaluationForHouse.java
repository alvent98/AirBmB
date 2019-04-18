import java.util.ArrayList;

public class EvaluationForHouse extends Evaluation {
        private static ArrayList<EvaluationForHouse> evaluationsForHousesList = new ArrayList<EvaluationForHouse>();
        private static double averageFeedbackForHouses = 0;

        public EvaluationForHouse() {
        	super();
            evaluationsForHousesList.add(this);
            recalculateAverage();
        }

        public EvaluationForHouse(int feedback, String comments) {
            super(feedback,comments);
            evaluationsForHousesList.add(this);
            recalculateAverage();
        }

        public static double getAverageFeedbackForRenter() { return averageFeedbackForHouses; }

        public static int getNumOfEvaluationsForHouses() { return evaluationsForHousesList.size(); }
        
		private static void recalculateAverage() {
            averageFeedbackForHouses = 0;
            int num = getNumOfEvaluationsForHouses();
            if(num!=0) {
            	for (EvaluationForHouse e : evaluationsForHousesList) averageFeedbackForHouses += e.getFeedback();
            	averageFeedbackForHouses /= num;
            }
        }
        
        public void remove() {
        	if(!evaluationsForHousesList.isEmpty()) evaluationsForHousesList.remove(this);
        	recalculateAverage();
        }
        
        public static void removeAll() {
        	evaluationsForHousesList.clear();
        	recalculateAverage();
        }
}
