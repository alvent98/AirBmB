package com.example.airbmb.Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Request {
	private static int num=0;
    private int requestId;
    private LocalDate submissionDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean accepted = false;
    private static int numOfAcceptedRequests = 0;
    private static ArrayList<Request> requestList = new ArrayList<Request>();

    public Request(LocalDate submissionDate, LocalDate startDate, LocalDate endDate) {
        this.submissionDate = submissionDate;
        this.startDate = startDate;
        this.endDate = endDate;
        requestId = num++;
        requestList.add(this);
    }

    public LocalDate getStartDate() { return startDate; }

    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

    public LocalDate getEndDate() { return endDate; }

    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }

    public long getRequestId() { return requestId; }

    public LocalDate getSubmissionDate() { return submissionDate; }

    public boolean isAccepted() { return accepted; }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (requestId ^ (requestId >>> 32));
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
		Request other = (Request) obj;
		if (requestId != other.requestId)
			return false;
		return true;
	}

	public void setAccepted() {
        accepted = true;
        numOfAcceptedRequests++;
    }
	
	public void remove() {
		if(!requestList.isEmpty()) requestList.remove(this);
		numOfAcceptedRequests=0;
		for(Request r : requestList) {
			if(r.isAccepted()) numOfAcceptedRequests++;
		}
	}
	
	public static void removeAll() {
		requestList.clear();
		numOfAcceptedRequests=0;
	}

    public static int getNumOfRequests() { return requestList.size(); }

    public static int getNumOfAcceptedRequests() { return numOfAcceptedRequests; } 
}