package services;

import data.repositories.ResidentRepo;
import data.repositories.Residents;
import dtos.requests.OnboardResidentRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResidentManagementServiceTest {
    private ResidentManagementService residentService;
    private ResidentRepo residentRepo;
    private OnboardResidentRequest onboardResidentRequest;

    @BeforeEach
    public void setUp(){
        residentService = new ResidentManagementService();
        residentRepo = new Residents();
        onboardResidentRequest = new OnboardResidentRequest();
    }
    @Test
    public void RegisterResident_ResidentsCountIsOne(){
        assertEquals(0, residentRepo.getTotal());
        onboardResidentRequest.setName("name");
        onboardResidentRequest.setEmail("email");
        onboardResidentRequest.setPhoneNumber("phoneNumber");
        onboardResidentRequest.setHouseAddress("houseAddress");
        String resident = residentService.onboardResidents(onboardResidentRequest);
        assertEquals("nameRegistered successfully!", resident);
        assertEquals(1, residentRepo.getTotal());
    }

    @Test
    public void RegisterTwoResidentsWithSamePhoneNumber_ExceptionIsThrown(){
        assertEquals(0, residentRepo.getTotal());
        onboardResidentRequest.setName("name");
        onboardResidentRequest.setEmail("email");
        onboardResidentRequest.setPhoneNumber("phoneNumber");
        onboardResidentRequest.setHouseAddress("houseAddress");
        String resident = residentService.onboardResidents(onboardResidentRequest);
        assertEquals("nameRegistered successfully!", resident);
        assertEquals(1, residentRepo.getTotal());

        OnboardResidentRequest onboardResidentRequest2 = new OnboardResidentRequest();
        onboardResidentRequest2.setName("name2");
        onboardResidentRequest2.setPhoneNumber("phoneNumber");
        onboardResidentRequest2.setHouseAddress("houseAddress");
        onboardResidentRequest2.setEmail("email2");
        assertThrows(exceptions.ResidentManagementService.class, ()-> residentService.onboardResidents(onboardResidentRequest2));
        assertEquals(1, residentRepo.getTotal());
    }

    @Test
    public void RegisterTwoResidentsWithSameEmail_ExceptionIsThrown(){
        assertEquals(0, residentRepo.getTotal());
        onboardResidentRequest.setName("name");
        onboardResidentRequest.setEmail("email");
        onboardResidentRequest.setPhoneNumber("phoneNumber");
        onboardResidentRequest.setHouseAddress("houseAddress");
        String resident = residentService.onboardResidents(onboardResidentRequest);
        assertEquals("nameRegistered successfully!", resident);
        assertEquals(1, residentRepo.getTotal());

        OnboardResidentRequest onboardResidentRequest2 = new OnboardResidentRequest();
        onboardResidentRequest2.setName("name2");
        onboardResidentRequest2.setPhoneNumber("phoneNumber2");
        onboardResidentRequest2.setHouseAddress("houseAddress");
        onboardResidentRequest2.setEmail("email");
        assertThrows(exceptions.ResidentManagementService.class, ()-> residentService.onboardResidents(onboardResidentRequest2));

        assertEquals(1, residentRepo.getTotal());
    }


    @Test
    void onboardResidents() {
    }
}