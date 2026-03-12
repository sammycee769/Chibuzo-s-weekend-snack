package dtos.responses;

public class OnboardResidentResponse {
    private String residentName;
    private String residentId;
    private String dateRegistered;

    public String getResidentName() {
        return residentName;
    }

    public void setResidentName(String residentName) {
        this.residentName = residentName;
    }

    public String getResidentId() {
        return residentId;
    }

    public void setResidentId(String residentOd) {
        this.residentId = residentOd;
    }

    public String getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(String dateRegistered) {
        this.dateRegistered = dateRegistered;
    }
}
