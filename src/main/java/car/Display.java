package car;

public class Display {

    public static void displayCarInfo(Car car) {
        System.out.println("Marca: " + car.getBrand());
        System.out.println("Modelo: " + car.getModel());
        System.out.println("Ano: " + car.getYear());

    }
}