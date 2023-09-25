import car.Car;
import car.Engine;
import car.SportCar;
import car.Display;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Questão 01 ---");
        Car MyCar = new Car();
        Display.setCar(MyCar);

        System.out.println("\n--- Questão 02 ---");
        Display.setKilometers(MyCar);

        System.out.println("\n--- Questão 03 ---");
        SportCar MySportCar = new SportCar();
        Display.setSpeedSportCar(MySportCar);

        System.out.println("\n--- Questão 04 ---");
        Engine MyEngine = new Engine();
        Car MyCarEngine = new Car();
        Display.setEngine(MyEngine, MyCarEngine);
        Display.setStartEngine(MyCarEngine);
    }
}