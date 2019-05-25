package com.example.airbmb.Model;

import java.util.Objects;

/**
 *
 * Main Class of an Evaluation
 */

public abstract class Evaluation {

    private static int num=0;
    private int evaluationId ;
    private int feedback;
    private String comments;


    /**
     * Constructor that initializes the characteristics of an evaluation
     * @param feedback user's rating
     * @param comments user's review
     */
    public Evaluation(int feedback, String comments) {
        this.feedback = feedback;
        this.comments = comments;
        evaluationId=num++;
    }

    /**
     * Constructor that initializes the rating
     * @param feedback
     */
    public Evaluation(int feedback) {
        this(feedback,"");
    }

    /**
     * Return the evaluation's id
     * Evaluation's ID is unique for each evaluation
     * @return evaluataionId
     */
    public int getEvaluationId() {
        return evaluationId;
    }

    /**
     * Returns user's rating
     * @return
     */
    public int getFeedback() {
        return feedback;
    }

    /**
     * Sets user's rating
     * @param feedback user's rating
     */
    public void setFeedback(int feedback) {
        this.feedback = feedback;
    }

    /**
     * Returns user's review
     * @return comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets user's review
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * This method tests if two objects are equal.
     * @param o the object to be tested
     * @return true if the objects are equal
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Evaluation that = (Evaluation) o;
        return evaluationId == that.evaluationId;
    }

    /**
     * This method generates a hash code for the id
     * @return the hash code
     */
    @Override
    public int hashCode() {

        return Objects.hash(evaluationId);
    }

    /**
     *This method removes an evaluation from the list
     */
    public abstract void remove();

}