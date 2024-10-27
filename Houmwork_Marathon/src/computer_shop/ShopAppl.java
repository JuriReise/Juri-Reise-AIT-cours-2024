
package computer_shop;

import computer_shop.dao.ComputerStore;
import computer_shop.dao.ComputerStoreImpl;
import computer_shop.model.Computer;

public class ShopAppl {
    public static void main(String[] args) {
        ComputerStore store = new ComputerStoreImpl();

        // Adding computers
        Computer comp1 = new Computer("101", "Apple", "MacBook Pro", 2000);
        Computer comp2 = new Computer("102", "HP", "Pavilion", 1200);
        
        System.out.println("Adding computers:");
        store.addComputer(comp1);
        store.addComputer(comp2);
        System.out.println(store.getComputerById("101"));
        System.out.println(store.getComputerById("102"));

        // Updating a computer
        Computer updatedComp = new Computer("101", "Apple", "MacBook Pro M1", 2500);
        store.updateComputer("101", updatedComp);
        System.out.println("After update:");
        System.out.println(store.getComputerById("101"));

        // Deleting a computer
        store.deleteComputer("102");
        System.out.println("After deletion:");
        System.out.println(store.getComputerById("102"));  // Should be null
    }
}
