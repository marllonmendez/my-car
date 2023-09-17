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
        car.setKilometers(kilometers);

        scanner.nextLine();
    }
}
