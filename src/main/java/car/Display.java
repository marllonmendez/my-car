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

        System.out.print("Qual a marca do carro esportivo? \n");
        String brand = scanner.nextLine();
        sportCar.setBrand(brand);

        System.out.print("Qual o modelo do carro esportivo? \n");
        String model = scanner.nextLine();
        sportCar.setModel(model);

        System.out.print("Qual o ano do carro esportivo? \n");
        int year = scanner.nextInt();
        sportCar.setYear(year);

        System.out.print("Qual a velociade do carro esportivo? \n");
        int speedMax = scanner.nextInt();
        sportCar.setSpeedMax(speedMax);

        System.out.println("\nInformações do carro esportivo:");
        String sportCarInfo = sportCar.toString();
        System.out.println(sportCarInfo);

        scanner.nextLine();
    }

//    public static void setCarEngine(Car car) {
//        System.out.print("Qual o tipo do motor? \n");
//        String type = scanner.nextLine();
//        car.type(type);
//
//        System.out.print("Qual a potência do motor? \n");
//        int power = scanner.nextInt();
//        car.power(power);
//
//        System.out.print("Ligar o motor do carro? (true/false) \n");
//        boolean start = Boolean.parseBoolean(scanner.nextLine());
//
//        Engine engine = new Engine(type, power, start);
//        car.setEngine(engine);
//
//        car.startCar();
//    }

    public static void setCarEngine(Car car) {

        System.out.print("Qual o tipo do motor? ");
        String type = scanner.nextLine();
        car.getEngine(type);

        System.out.print("Qual a potência do motor? ");
        int power = scanner.nextInt();
        car.getEngine(power);

        scanner.nextLine(); // Consuma a nova linha pendente

        System.out.print("Ligar o motor do carro? (true/false) ");
        boolean start = Boolean.parseBoolean(scanner.nextLine());
        car.getEngine(start);

        car.startCar();
    }


}
