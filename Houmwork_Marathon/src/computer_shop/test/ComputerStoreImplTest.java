
package computer_shop.test;

import computer_shop.dao.ComputerStore;
import computer_shop.dao.ComputerStoreImpl;
import computer_shop.model.Computer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComputerStoreImplTest {
    private ComputerStore store;

    @BeforeEach
    public void setUp() {
        store = new ComputerStoreImpl();
    }

    @Test
    public void testAddComputer() {
        Computer comp = new Computer("123", "Dell", "XPS 15", 1500);
        assertTrue(store.addComputer(comp));
        assertFalse(store.addComputer(comp)); // should not allow duplicate
    }

    @Test
    public void testGetComputerById() {
        Computer comp = new Computer("123", "Dell", "XPS 15", 1500);
        store.addComputer(comp);
        assertEquals(comp, store.getComputerById("123"));
    }

    @Test
    public void testUpdateComputer() {
        Computer comp = new Computer("123", "Dell", "XPS 15", 1500);
        store.addComputer(comp);
        Computer updatedComp = new Computer("123", "Dell", "XPS 17", 1700);
        assertTrue(store.updateComputer("123", updatedComp));
        assertEquals(updatedComp, store.getComputerById("123"));
    }

    @Test
    public void testDeleteComputer() {
        Computer comp = new Computer("123", "Dell", "XPS 15", 1500);
        store.addComputer(comp);
        assertTrue(store.deleteComputer("123"));
        assertNull(store.getComputerById("123"));
    }
}
