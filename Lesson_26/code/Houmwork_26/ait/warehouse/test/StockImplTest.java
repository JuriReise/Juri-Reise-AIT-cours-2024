package Houmwork_26.ait.warehouse.test;

import Houmwork_26.ait.warehouse.dao.Stock;
import Houmwork_26.ait.warehouse.dao.StockImpl;
import Houmwork_26.ait.warehouse.model.Gear;
import Houmwork_26.ait.warehouse.model.Lever;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StockImplTest {
    Stock stock;

    @BeforeEach
    void setUp() {
        stock = new StockImpl(5);  // Указываем максимальный размер массива
    }

    @Test
    void testAddDetail() {
        Gear gear = new Gear(123456, 5.0, "Steel", "Vendor1", 3.5, 2.5, 20);
        assertTrue(stock.addDetail(gear));  // Добавление проходит успешно

        Gear gear2 = new Gear(123457, 4.0, "Steel", "Vendor2", 2.5, 2.0, 15);
        assertTrue(stock.addDetail(gear2));  // Второе добавление тоже проходит успешно
    }

    @Test
    void testAddDetailExceedCapacity() {
        Stock stock = new StockImpl(1);  // Ограничиваем размер массива одним элементом
        Gear gear = new Gear(123456, 5.0, "Steel", "Vendor1", 3.5, 2.5, 20);
        assertTrue(stock.addDetail(gear));  // Первый элемент добавляется

        Gear gear2 = new Gear(123457, 4.0, "Steel", "Vendor2", 2.5, 2.0, 15);
        assertFalse(stock.addDetail(gear2));  // Второй элемент не добавляется, потому что массив переполнен
    }

    @Test
    void testTotalWeight() {
        Gear gear = new Gear(123456, 5.0, "Steel", "Vendor1", 3.5, 2.5, 20);
        Lever lever = new Lever(234567, 3.0, "Aluminum", "Vendor2", 2.0, 10.0);
        stock.addDetail(gear);
        stock.addDetail(lever);

        assertEquals(5.5, stock.totalWeight());  // Общий вес 3.5 + 2.0 = 5.5
    }

    @Test
    void testAverageWeight() {
        Gear gear = new Gear(123456, 5.0, "Steel", "Vendor1", 3.5, 2.5, 20);
        Lever lever = new Lever(234567, 3.0, "Aluminum", "Vendor2", 2.0, 10.0);
        stock.addDetail(gear);
        stock.addDetail(lever);

        assertEquals(2.75, stock.averageWeight());  // Средний вес 5.5 / 2 = 2.75
    }
}
