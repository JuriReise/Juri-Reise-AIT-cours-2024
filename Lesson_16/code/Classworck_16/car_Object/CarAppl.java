package Classworck_16.car_Object;

import Classworck_16.car_Object.model.Car;

public class CarAppl {
    public static void main(String[] args) {
        // Создаем объект Car с использованием конструктора с параметрами
        Car myCar = new Car("VW", 2014, 15000, "silver", false);

        // Выводим объект, используя toString() (вызывается автоматически)
        System.out.println(myCar);

        // Можно явно вызвать toString(), но это не обязательно
        System.out.println(myCar.toString());
        myCar.move();
        myCar.stop();


    } // end of main
} // end of class
