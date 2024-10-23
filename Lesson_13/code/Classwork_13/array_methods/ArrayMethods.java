package Classwork_13.array_methods;


//  - заполнение массива случайными целыми числами из интервала от a до b
//  - печать массива целых чисел
// - поиск элемента

public class ArrayMethods {
    // бинарный поиск обозначается как (log(n))
    public static int binarySearch(int[] array, int n){
        int leftIndex = 0;
        int rightIndex = array.length -1;

        while (leftIndex <= rightIndex){
            int midIndex = (rightIndex + leftIndex) / 2;
            if(array[midIndex]==n){
                return midIndex;


            } else if (n < array[midIndex]) {
               rightIndex = midIndex -1; // правую половину массива отбрасываем
            } else {
                leftIndex = midIndex +1; // левую половину массива отбрасываем
            }
        }
        return -leftIndex -1;  //если ничего не нашлось

    }


    // Линейный поиск и взврат индекса
    // (if element absent / если элемент отсутствует то возвращаем значение -1')
    public static int linearCearch(int[] newArray, int n){
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i]==n){
                return i; // в этом месте выходим из метода и обащаться к нему бесполезно
            }

        }
        return -1;
    }

}
