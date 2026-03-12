package utils;

import data.models.Resident;
import dtos.requests.OnboardResidentRequest;
import dtos.responses.OnboardResidentResponse;

public class Mapper {
    public static Resident map(OnboardResidentRequest onboardResidentRequest) {
        Resident resident = new Resident();
        resident.setName(onboardResidentRequest.getName());
        resident.setEmailAddress(onboardResidentRequest.getEmail());
        resident.setPhoneNumber(onboardResidentRequest.getPhoneNumber());
        resident.setHouseAddress(onboardResidentRequest.getHouseAddress());
        return resident;
    }
    public static OnboardResidentResponse map(Resident resident) {
        OnboardResidentResponse response = new OnboardResidentResponse();

        response.setResidentName(resident.getName());
        response.setResidentId(resident.getId());
        response.setDateRegistered(resident.getDateRegistered());

        return response;
    }
}
