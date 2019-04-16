import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Request {
    private long requestId = new Random().nextLong();
    private LocalDate submissionDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean accepted = false;
    private static int numOfAcceptedRequests = 0;
    private static ArrayList<Request> requestList ;

    Request() {
        requestList.add(this);
    }

    public Request(LocalDate submissionDate, LocalDate startDate, LocalDate endDate) {
        this.submissionDate = submissionDate;
        this.startDate = startDate;
        this.endDate = endDate;
        requestList.add(this);
    }

    public LocalDate getStartDate() { return startDate; }

    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

    public LocalDate getEndDate() { return endDate; }

    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }

    public long getRequestId() { return requestId; }

    public LocalDate getSubmissionDate() { return submissionDate; }

    public boolean isAccepted() { return accepted; }

    public void setAccepted() {
        accepted = true;
        numOfAcceptedRequests++;
    }

    public static int getNumOfRequests() { return requestList.size(); }

    public static int getNumOfAcceptedRequests() { return numOfAcceptedRequests; }
}
