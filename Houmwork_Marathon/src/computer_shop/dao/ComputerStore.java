
package computer_shop.dao;

import computer_shop.model.Computer;

public interface ComputerStore {
    boolean addComputer(Computer computer);
    Computer getComputerById(String id);
    boolean updateComputer(String id, Computer updatedComputer);
    boolean deleteComputer(String id);
}
