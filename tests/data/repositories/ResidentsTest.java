package data.repositories;

import data.models.Resident;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ResidentsTest {
    private Residents residents;

    @BeforeEach
    void setUp() {
        residents = new Residents();
    }

    @Test
    void testRepositoryIsInitiallyEmpty_I_save_1_Repository_Becomes1() {
        int total = residents.getTotal();
        assertEquals(0, total);

        Resident resident = new Resident();
        residents.save(resident);

        total = residents.getTotal();
        assertEquals(1, total);
    }

    @Test
    void testThatWhenResidentIsSaved_AnID_IsAssignedToIt() {
        int total = residents.getTotal();
        assertEquals(0, total);

        Resident resident = new Resident();
        residents.save(resident);

        assertEquals(1, resident.getId());
        total = residents.getTotal();
        assertEquals(1, total);
    }

    @Test
    void testThatISaveMultipleResidents_IDsAreIncremented() {
        int total = residents.getTotal();
        assertEquals(0, total);

        Resident resident = new Resident();
        residents.save(resident);

        Resident resident2 = new Resident();
        residents.save(resident2);

        assertEquals(1, resident.getId());
        assertEquals(2, resident2.getId());
        total = residents.getTotal();
        assertEquals(2, total);
    }

    @Test
    void testThatISaveAResident_ICanFindItWithTheID() {
        int total = residents.getTotal();
        assertEquals(0, total);

        Resident resident = new Resident();
        residents.save(resident);

        Resident foundResident = residents.findById(1);
        assertEquals(resident, foundResident);
        assertEquals(1, foundResident.getId());
        total = residents.getTotal();
        assertEquals(1, total);
    }

    @Test
    void testFindById_ReturnsNullIfNotFound() {
        int total = residents.getTotal();
        assertEquals(0, total);

        Resident foundResident = residents.findById(100);
        assertNull(foundResident);
        total = residents.getTotal();

        assertEquals(0, total);
    }

    @Test
    void testFindAll_ReturnsAllResidents() {
        int total = residents.getTotal();
        assertEquals(0, total);

        Resident first = new Resident();
        Resident second = new Resident();

        residents.save(first);
        residents.save(second);

        List<Resident> all = residents.findAll();
        assertEquals(2, all.size());

        total = residents.getTotal();
        assertEquals(2, total);
    }

    @Test
    void testDelete_RemovesResident() {
        int total = residents.getTotal();
        assertEquals(0, total);

        Resident resident = new Resident();
        residents.save(resident);

        residents.delete(resident);
        total = residents.getTotal();
        assertEquals(0, total);
    }

    @Test
    void testDeleteById_RemovesCorrectResident() {
        int total = residents.getTotal();
        assertEquals(0, total);

        Resident resident = new Resident();
        residents.save(resident);

        residents.deleteById(1);

        total = residents.getTotal();
        assertEquals(0, total);
        assertNull(residents.findById(1));
    }

    @Test
    public void testDeleteByObject_RemovesResident() {
        int total = residents.getTotal();
        assertEquals(0, total);

        Resident resident = new Resident();
        residents.save(resident);

        residents.deleteByObject(resident);

        total = residents.getTotal();
        assertEquals(0, total);
    }

    @Test
    public void testDeleteAll_ClearsRepository() {
        int total = residents.getTotal();
        assertEquals(0, total);

        residents.save(new Resident());
        residents.save(new Resident());

        residents.deleteAll();

        total = residents.getTotal();
        assertEquals(0, total);
    }

    @Test
    public void testSave_DoesNotDuplicateExistingObject() {
        int total = residents.getTotal();
        assertEquals(0, total);

        Resident resident = new Resident();
        residents.save(resident);
        residents.save(resident);

        total = residents.getTotal();
        assertEquals(1, total);
    }
}