package carpackage;

import java.util.Scanner;

public class Info {
    public static void setCarInfo(Car car) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a marca: ");
        String brand = scanner.nextLine();
        car.setBrand(brand);

        System.out.print("Digite o modelo: ");
        String model = scanner.nextLine();
        car.setModel(model);

        System.out.print("Digite o ano: ");
        int year = scanner.nextInt();
        car.setYear(year);
    }
}