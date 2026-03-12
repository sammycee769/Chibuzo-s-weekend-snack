package data.repositories;

import data.models.Resident;
import java.util.ArrayList;
import java.util.List;

public class Residents implements ResidentRepo {
    private static List<Resident> residents = new ArrayList<>();
    private static int nextId = 1;

    @Override
    public List<Resident> findAll() {
        return new ArrayList<>(residents);
    }

    @Override
    public Resident findById(int id) {
        for (Resident resident : residents) {
            if (resident.getId() == id) {
                return resident;
            }
        }
        return null;
    }

    @Override
    public Resident findByPhoneNumber(String phoneNumber) {
        for (Resident resident : residents){
            if (resident.getPhoneNumber().equals(phoneNumber)){
                return resident;
            }
        }
        return null;
    }
    @Override
    public Resident findByEmail(String email){
        for (Resident resident : residents){
            if (resident.getEmailAddress().equals(email)){
                return resident;
            }
        }
        return null;
    }

    @Override
    public void save(Resident resident) {

        if (resident.getId() == 0) {
            resident.setId(nextId++);
            residents.add(resident);
            return;
        }

        for (Resident existing : residents) {
            if (existing.getId() == resident.getId()) {

                existing.setName(resident.getName());
                existing.setPhoneNumber(resident.getPhoneNumber());
                existing.setHouseAddress(resident.getHouseAddress());

                return;
            }
        }

        residents.add(resident);
    }

    @Override
    public void delete(Resident resident) {
        residents.remove(resident);
    }

    @Override
    public void deleteById(int id) {
        Resident resident = findById(id);
        if (resident != null) {
            residents.remove(resident);
        }
    }

    @Override
    public void deleteByObject(Resident resident) {
        delete(resident);
    }

    @Override
    public void deleteAll() {
        residents.clear();
    }

    @Override
    public int getTotal() {
        return residents.size();
    }


    public void clear(){
        residents.clear();
    }

}