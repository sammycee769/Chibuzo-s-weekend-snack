package services;

import data.models.Resident;
import data.repositories.ResidentRepo;
import data.repositories.Residents;

import java.util.List;

public class ResidentServiceImpl implements ResidentServices{
    private ResidentRepo residentRepo = new Residents();
    @Override
    public String registerResident(String name, String phoneNumber, String houseAddress) {
        Resident existing = residentRepo.findByPhoneNumber(phoneNumber);
        if(existing != null){
            throw new IllegalArgumentException("Resident already exists");
        }
        Resident resident = new Resident();
        resident.setName(name);
        resident.setPhoneNumber(phoneNumber);
        resident.setHouseAddress(houseAddress);
        residentRepo.save(resident);
        return name + "Registered successfully!";
    }

    @Override
    public String updateResident(String phoneNumber,String newPhoneNumber, String newName, String newAddress) {
        Resident resident = residentRepo.findByPhoneNumber(phoneNumber);
        if(resident == null){
            return "Resident not found";
        }

        resident.setName(newName);
        resident.setPhoneNumber(newPhoneNumber);
        resident.setHouseAddress(newAddress);
        residentRepo.save(resident);
        return newName + "Updated successfully!";
    }

    @Override
    public Resident findByPhoneNumber(String phoneNumber) {
        return residentRepo.findByPhoneNumber(phoneNumber);
    }

    @Override
    public List<Resident> findAllResidents() {
        return residentRepo.findAll();
    }

    @Override
    public void deleteResident(String phoneNumber) {
        Resident resident = findByPhoneNumber(phoneNumber);
        if(resident == null){
            throw new IllegalArgumentException("Resident Not Found");
        }
        residentRepo.delete(resident);
    }

    @Override
    public int getResidentsCount() {
        return residentRepo.getTotal();
    }

    @Override
    public void deletAllResidents() {
        residentRepo.deleteAll();
    }


}
