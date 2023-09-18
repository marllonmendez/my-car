package car;

import java.util.Scanner;

public class Display {
    private static Scanner scanner = new Scanner(System.in);

    public static void setCar(Car car) {
        System.out.print("Marca: ");
        String brand = scanner.nextLine();
        car.setBrand(brand);

        System.out.print("Modelo: ");
        String model = scanner.nextLine();
        car.setModel(model);

        System.out.print("Ano: ");
        int year = scanner.nextInt();
        car.setYear(year);

        scanner.nextLine();
    }

    public static void setKilometers(Car car) {
        System.out.print("Quilometragem: ");
        int kilometers = scanner.nextInt();
        SpeedRadar radar = new SpeedRadar();
        radar.radar(car, kilometers);

        scanner.nextLine();
    }

    public static void setSpeedSportCar(SportCar sportCar) {
        System.out.println("Acelerando o carro esportivo!");

        System.out.print("Marca: ");
        String brand = scanner.nextLine();
        sportCar.setBrand(brand);

        System.out.print("Modelo: ");
        String model = scanner.nextLine();
        sportCar.setModel(model);

        System.out.print("Ano: ");
        int year = scanner.nextInt();
        sportCar.setYear(year);

        scanner.nextLine();

        String sportCarInfo = sportCar.toString();
        System.out.println(sportCarInfo);
    }
}
