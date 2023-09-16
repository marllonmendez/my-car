package mainpackage;

import carpackage.Car;
import carpackage.Info;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Questão 01 ---");
        Car myCar = new Car();
        Info.setCarInfo(myCar);
        myCar.showCarInfo();

        System.out.println("\n--- Questão 02 ---");
    }
}