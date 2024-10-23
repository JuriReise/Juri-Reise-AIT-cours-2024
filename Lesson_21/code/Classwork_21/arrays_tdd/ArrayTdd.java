package Classwork_21.arrays_tdd;

import java.util.Arrays;
import java.util.Objects;

public class ArrayTdd {

    private int[] array;

    public ArrayTdd(int[] array) { //  Конструктор: Он помогает нам создавать объект этого класса и сразу задавать массив, с которым будем работать. Например, если мы создадим новый объект класса ArrayTdd и передадим в него массив чисел, то этот массив сохранится в поле array.
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "ArrayTdd{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArrayTdd arrayTdd)) return false;
        return Objects.deepEquals(array, arrayTdd.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    // count positive numbers in array
    public int countPositive(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0){
                count++;
            }
        }
        return count;
    }
}
