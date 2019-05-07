package Model;

public abstract class Evaluation {
	private static int num=0;
    private int evaluationId ;
    private int feedback;
    private String comments;

    

    public Evaluation(int feedback, String comments) {
        this.feedback = feedback;
        this.comments = comments;
		evaluationId=num++;
    }
    
    public Evaluation(int feedback) {
    	this(feedback,"");
    }

    public int getEvaluationId() { return evaluationId; }

    public int getFeedback() { return feedback; }

    public void setFeedback(int feedback) { this.feedback = feedback; }

    public String getComments() { return comments; }

    public void setComments(String comments) { this.comments = comments; }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (evaluationId ^ (evaluationId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evaluation other = (Evaluation) obj;
		if (evaluationId != other.evaluationId)
			return false;
		return true;
	}
	
	public abstract void remove();
}
