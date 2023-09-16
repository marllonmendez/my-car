import car.Car;
import car.Info;
import car.Display;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Questão 01 ---");
        Car myCar = new Car();
        Info.setCarInfo(myCar);
        Display.displayCarInfo(myCar);

        System.out.println("\n--- Questão 02 ---");
    }
}