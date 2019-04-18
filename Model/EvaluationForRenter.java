import java.util.ArrayList;

public class EvaluationForRenter extends Evaluation {
    private long repairsValue = 0;
    private static ArrayList<EvaluationForRenter> evaluationsForRentersList ;
    private static double averageFeedbackForRenters;

    public EvaluationForRenter() {
        evaluationsForRentersList.add(this);
        recalculateAverage();
    }

    public EvaluationForRenter(long evaluationId, int feedback, String comments, long repairsValue) {
        super(evaluationId,feedback,comments);
        this.repairsValue = repairsValue;
        evaluationsForRentersList.add(this);
        recalculateAverage();
    }

    public void setRepairsValue(long repairsValue) { this.repairsValue = repairsValue; }

    public long getRepairsValue() { return repairsValue; }

    public static double getAverageFeedbackForRenter() { return averageFeedbackForRenters; }

    public static int getNumOfEvaluationsForRenter() { return evaluationsForRentersList.size(); }

    public boolean damages() {return repairsValue!=0; }

    private static void recalculateAverage() {
        averageFeedbackForRenters = 0;
        int num = getNumOfEvaluationsForRenter();
        for (EvaluationForRenter e : evaluationsForRentersList) averageFeedbackForRenters += e.getFeedback();
        averageFeedbackForRenters /= num;
    }
}
