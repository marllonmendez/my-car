import car.Car;
import car.SportCar;
import car.Display;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Questão 01 ---");
        Car myCar = new Car();
        Display.setCar(myCar);

        System.out.println("\n--- Questão 02 ---");
        Display.setKilometers(myCar);

        System.out.println("\n--- Questão 03 ---");
        SportCar mySportCar = new SportCar();
        Display.setSpeedSportCar(mySportCar);
    }
}