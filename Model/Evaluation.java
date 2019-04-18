import java.util.Random;

public abstract class Evaluation {
    private long evaluationId = new Random().nextLong();
    private int feedback;
    private String comments;

    public Evaluation() {}

    public Evaluation(long evaluationId, int feedback, String comments) {
        this.evaluationId = evaluationId;
        this.feedback = feedback;
        this.comments = comments;
    }

    public long getEvaluationId() { return evaluationId; }

    public int getFeedback() { return feedback; }

    public void setFeedback(int feedback) { this.feedback = feedback; }

    public String getComments() { return comments; }

    public void setComments(String comments) { this.comments = comments; }
}
