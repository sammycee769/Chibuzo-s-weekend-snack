package services;

import data.models.GatePass;

import java.time.LocalDateTime;
import java.util.List;

public interface GatePassService {
    String createGatePass(String residentPhoneNumber, String visitorName, LocalDateTime expirationTime);
    GatePass findGatePassById(int id);
    List<GatePass> findAllGatePasses();
    String updateGatePass(String residentPhoneNumber, String visitorName, LocalDateTime expirationTime);
    void deleteGatePass(int id);



}
