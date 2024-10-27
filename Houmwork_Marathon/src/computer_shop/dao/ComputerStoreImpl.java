
package computer_shop.dao;

import computer_shop.model.Computer;
import java.util.HashMap;
import java.util.Map;

public class ComputerStoreImpl implements ComputerStore {
    private Map<String, Computer> inventory = new HashMap<>();

    @Override
    public boolean addComputer(Computer computer) {
        if (inventory.containsKey(computer.getId())) return false;
        inventory.put(computer.getId(), computer);
        return true;
    }

    @Override
    public Computer getComputerById(String id) {
        return inventory.get(id);
    }

    @Override
    public boolean updateComputer(String id, Computer updatedComputer) {
        if (!inventory.containsKey(id)) return false;
        inventory.put(id, updatedComputer);
        return true;
    }

    @Override
    public boolean deleteComputer(String id) {
        return inventory.remove(id) != null;
    }
}
