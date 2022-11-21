package bridge.domain;

public class RoundResult {

    private String location;
    private String status;


    public RoundResult(String location, String status) {
        this.location = location;
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public String getStatus() {
        return status;
    }
}
