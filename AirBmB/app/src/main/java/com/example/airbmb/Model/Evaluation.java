package com.example.airbmb.Model;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.Objects;

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

    public int getEvaluationId() {
        return evaluationId;
    }

    public int getFeedback() {
        return feedback;
    }

    public void setFeedback(int feedback) {
        this.feedback = feedback;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Evaluation that = (Evaluation) o;
        return evaluationId == that.evaluationId;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {
        return Objects.hash(evaluationId);
    }

    public abstract void remove();

}
