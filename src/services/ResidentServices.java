package services;

import data.models.Resident;

import java.util.List;

public interface ResidentServices {
    String registerResident(String name, String phoneNumber, String houseAddress);
    String updateResident(String phoneNumber,String newPhoneNumber, String newName, String newAddress);
    Resident findByPhoneNumber(String phoneNumber);
    List<Resident> findAllResidents();
    void deleteResident(String phoneNumber);
    int getResidentsCount();
    void deletAllResidents();
}
