package services;

import data.models.Resident;
import data.repositories.ResidentRepo;
import data.repositories.Residents;
import dtos.requests.OnboardResidentRequest;
import dtos.responses.OnboardResidentResponse;


import java.util.List;

import static utils.Mapper.map;

public class ResidentManagementService {
    private ResidentRepo residentRepo = new Residents();
    public OnboardResidentResponse onboardResidents(OnboardResidentRequest onboardResidentRequest) {
        validateResidentDuplicates(onboardResidentRequest.getEmail(),onboardResidentRequest.getPhoneNumber());
        Resident resident= map(onboardResidentRequest);
        residentRepo.save(resident);

        return  map(resident);
    }
//    public String disableResident(int residentId){
//        Resident existing = residentRepo.findById(residentId);
//        if(existing == null){
//            throw new exceptions.ResidentManagementService("Resident not found");
//        }
//        Resident resident = new  Resident();
//        resident
//
//    }
    public List<Resident> viewAllResidents() {
        return residentRepo.findAll();
    }
    public  String deleteResident(String phoneNumber) {
        validateResidentExists(phoneNumber);
        Resident resident = new Resident();
        residentRepo.delete(resident);
    }
    private void validateResidentExists(String phoneNumber {
        Resident existing = residentRepo.findByPhoneNumber(phoneNumber);
        if(existing == null){
            throw new exceptions.ResidentManagementService("Resident not found");
        }
    }
    private void validateResidentDuplicates(String phoneNumber,String email) {
        Resident existing = residentRepo.findByEmail(email);
        Resident exist = residentRepo.findByPhoneNumber(phoneNumber);
        if(existing != null || exist != null){
            throw new exceptions.ResidentManagementService("Resident already exists");
        }
    }

}
