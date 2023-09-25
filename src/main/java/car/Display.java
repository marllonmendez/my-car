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

        System.out.println("A Quilometragem atual do carro é: " + car.getKilometers());

        scanner.nextLine();
    }

    public static void setSpeedSportCar(SportCar sportCar) {
        System.out.println("Acelerando o carro esportivo!\n");

        System.out.println("Qual a marca do carro esportivo:");
        String brand = scanner.nextLine();
        sportCar.setBrand(brand);

        System.out.println("Qual o modelo do carro esportivo:");
        String model = scanner.nextLine();
        sportCar.setModel(model);

        System.out.println("Qual o ano do carro esportivo:");
        int year = scanner.nextInt();
        sportCar.setYear(year);

        System.out.println("Qual a velociade atual do carro esportivo:");
        int currentSpeed = scanner.nextInt();
        sportCar.setCurrentSpeed(currentSpeed);

        System.out.println("Qual a velociade máxima do carro esportivo:");
        int speedMax = scanner.nextInt();
        sportCar.setSpeedMax(speedMax);

        System.out.println("\nInformações do carro esportivo:");
        String sportCarInfo = sportCar.toString();
        System.out.println(sportCarInfo);

        scanner.nextLine();
    }
    public static void setEngine(Engine engine, Car car) {
        System.out.println("Qual o motor do carro:");
        String type = scanner.nextLine();
        engine.setType(type);

        System.out.println("Qual a potência do motor:");
        int power = scanner.nextInt();
        engine.setPower(power);

        car.setEngine(engine);

        System.out.println("\nInformações do motor do carro:");
        System.out.println(engine.toString());

        scanner.nextLine();

        System.out.println("--------------------");
        System.out.println("Me informe agora esse novo carro:");
        Display.setCar(car);
    }

    public static void setStartEngine(Car car) {
        System.out.println("\nDeseja ligar o carro? (s/n)");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("s")) {
            System.out.println("--------------------");
            car.startCar();
            System.out.println(car.toString());
        } else {
            System.out.println("--------------------");
            car.turnOffCar();
        }
    }
}