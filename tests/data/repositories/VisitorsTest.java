package data.repositories;

import data.models.Visitor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VisitorsTest {
    private Visitors visitors;

    @BeforeEach
    void setUp() {
        visitors = new Visitors();
    }

    @Test
    void testRepositoryIsInitiallyEmpty_I_save_1_Repository_Becomes1() {
        int total = visitors.getTotal();
        assertEquals(0, total);

        Visitor visitor = new Visitor();
        visitors.save(visitor);

        total = visitors.getTotal();
        assertEquals(1, total);
    }

    @Test
    void testThatWhenVisitorIsSaved_AnID_IsAssignedToIt() {
        int total = visitors.getTotal();
        assertEquals(0, total);

        Visitor visitor = new Visitor();
        visitors.save(visitor);

        assertEquals(1, visitor.getId());
        total = visitors.getTotal();
        assertEquals(1, total);
    }

    @Test
    void testThatISaveMultipleVisitors_IDsAreIncremented() {
        int total = visitors.getTotal();
        assertEquals(0, total);

        Visitor visitor = new Visitor();
        visitors.save(visitor);

        Visitor visitor2 = new Visitor();
        visitors.save(visitor2);

        assertEquals(1, visitor.getId());
        assertEquals(2, visitor2.getId());
        total = visitors.getTotal();
        assertEquals(2, total);
    }

    @Test
    void testThatISaveAVisitor_ICanFindItWithTheID() {
        int total = visitors.getTotal();
        assertEquals(0, total);

        Visitor visitor = new Visitor();
        visitors.save(visitor);

        Visitor foundVisitor = visitors.findById(1);
        assertEquals(visitor, foundVisitor);
        assertEquals(1, foundVisitor.getId());
        total = visitors.getTotal();
        assertEquals(1, total);
    }

    @Test
    void testFindById_ReturnsNullIfNotFound() {
        int total = visitors.getTotal();
        assertEquals(0, total);

        Visitor foundVisitor = visitors.findById(100);
        assertNull(foundVisitor);
        total = visitors.getTotal();

        assertEquals(0, total);
    }

    @Test
    void testFindAll_ReturnsAllVisitors() {
        int total = visitors.getTotal();
        assertEquals(0, total);

        Visitor first = new Visitor();
        Visitor second = new Visitor();

        visitors.save(first);
        visitors.save(second);

        List<Visitor> all = visitors.findAll();
        assertEquals(2, all.size());

        total = visitors.getTotal();
        assertEquals(2, total);
    }

    @Test
    void testDelete_RemovesVisitor() {
        int total = visitors.getTotal();
        assertEquals(0, total);

        Visitor visitor = new Visitor();
        visitors.save(visitor);

        visitors.delete(visitor);
        total = visitors.getTotal();
        assertEquals(0, total);
    }

    @Test
    void testDeleteById_RemovesCorrectVisitor() {
        int total = visitors.getTotal();
        assertEquals(0, total);

        Visitor visitor = new Visitor();
        visitors.save(visitor);

        visitors.deleteById(1);

        total = visitors.getTotal();
        assertEquals(0, total);
        assertNull(visitors.findById(1));
    }

    @Test
    public void testDeleteByObject_RemovesVisitor() {
        int total = visitors.getTotal();
        assertEquals(0, total);

        Visitor visitor = new Visitor();
        visitors.save(visitor);

        visitors.deleteByObject(visitor);

        total = visitors.getTotal();
        assertEquals(0, total);
    }

    @Test
    public void testDeleteAll_ClearsRepository() {
        int total = visitors.getTotal();
        assertEquals(0, total);

        visitors.save(new Visitor());
        visitors.save(new Visitor());

        visitors.deleteAll();

        total = visitors.getTotal();
        assertEquals(0, total);
    }

    @Test
    public void testSave_DoesNotDuplicateExistingObject() {
        int total = visitors.getTotal();
        assertEquals(0, total);

        Visitor visitor = new Visitor();
        visitors.save(visitor);
        visitors.save(visitor);

        total = visitors.getTotal();
        assertEquals(1, total);
    }
}