package Houmwork_26.ait.warehouse.dao;

import Houmwork_26.ait.warehouse.model.Detail;
import java.util.ArrayList;
import java.util.List;

public class StockImpl implements Stock {
    private Detail[] details;
    private int size;

    public StockImpl(int capacity) {
        this.details = new Detail[capacity];  // Массив фиксированной длины
        this.size = 0;  // Текущий размер
    }

    @Override
    public boolean addDetail(Detail detail) {
        if (size < details.length) {  // Проверяем, есть ли место в массиве
            details[size++] = detail;  // Добавляем деталь и увеличиваем размер
            return true;
        }
        return false;  // Если места нет, возвращаем false
    }

    @Override
    public Detail findDetailByBarCode(long barCode) {
        for (int i = 0; i < size; i++) {  // Идём по массиву до текущего размера
            if (details[i].getBarCode() == barCode) {
                return details[i];
            }
        }
        return null;  // Если деталь не найдена
    }

    @Override
    public boolean updateDetail(Detail detail) {
        for (int i = 0; i < size; i++) {
            if (details[i].getBarCode() == detail.getBarCode()) {
                details[i] = detail;  // Обновляем деталь
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeDetail(long barCode) {
        for (int i = 0; i < size; i++) {
            if (details[i].getBarCode() == barCode) {
                // Удаляем деталь, сдвигая оставшиеся элементы
                for (int j = i; j < size - 1; j++) {
                    details[j] = details[j + 1];
                }
                details[--size] = null;  // Уменьшаем размер и очищаем последний элемент
                return true;
            }
        }
        return false;
    }

    @Override
    public double totalWeight() {
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += details[i].getWeight();  // Суммируем вес всех деталей
        }
        return total;
    }

    @Override
    public double averageWeight() {
        return size == 0 ? 0 : totalWeight() / size;  // Средний вес
    }
}
