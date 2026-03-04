package data.repositories;
import data.models.GatePass;
import java.util.ArrayList;
import java.util.List;

public class GatePasses implements GatePassRepo {
    private List<GatePass> gatePasses = new ArrayList<>();
    private int nextId = 1;

    @Override
    public List<GatePass> findAll() {
        return new ArrayList<>(gatePasses);
    }

    @Override
    public GatePass findById(int id) {
        for (GatePass gatePass : gatePasses) {
            if (gatePass.getId() == id) {
                return gatePass;
            }
        }
        return null;
    }

    @Override
    public void save(GatePass gatePass) {
        if (gatePass.getId() == 0) {
            gatePass.setId(nextId++);
        }

        GatePass existing = findById(gatePass.getId());
        if (existing == null) {
            gatePasses.add(gatePass);
        }
    }


    @Override
    public void delete(GatePass gatePass) {
        gatePasses.remove(gatePass);
    }

    @Override
    public void deleteById(int id) {
        GatePass gatePass = findById(id);
        if (gatePass != null) {
            gatePasses.remove(gatePass);
        }
    }

    @Override
    public void deleteByObject(GatePass gatePass) {
        delete(gatePass);
    }

    @Override
    public void deleteAll() {
        gatePasses.clear();
    }

    public int getTotal() {
        return gatePasses.size();
    }

}