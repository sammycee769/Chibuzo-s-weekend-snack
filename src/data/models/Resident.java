package data.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Resident {
    private String name;
    private String id;
    private String phoneNumber;
    private String  houseAddress;
    private  String emailAddress;
    private LocalDateTime dateRegistered = LocalDateTime.now();


    public String getDateRegistered() {
        return dateRegistered.format(DateTimeFormatter.ofPattern("EEE dd MMM yyyy a"));
    }

    public void setDateRegistered(LocalDateTime dateRegistered) {
        this.dateRegistered = dateRegistered;
    }
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }
}