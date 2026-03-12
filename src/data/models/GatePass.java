package data.models;

import java.time.LocalDateTime;

public class GatePass {
    private int id;
    private int residentId;
    private String visitorName;
    private LocalDateTime createdAt =  LocalDateTime.now();
    private LocalDateTime expirationDate;
    private boolean isValid = true;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getResidentId() {
        return residentId;
    }

    public void setResidentId(int residentId) {
        this.residentId = residentId;
    }

    public String getVisitorsName() {
        return visitorName;
    }

    public void setVisitorsName(String visitorsName) {
        this.visitorName = visitorsName;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }


}