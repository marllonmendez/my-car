package car;

import car.Engine;


public class Car {

    private String brand;
    private String model;
    private int year;
    private int kilometers;
    private  Engine engine;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getKilometers() {
        return kilometers;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int radar(int kilometersAdd) {
        if (kilometersAdd >= 0) {
            this.kilometers += kilometersAdd;
        } else {
            System.out.println("Não é possível adicionar quilômetros negativos");
        }
        return this.kilometers;
    }

    public void startCar() {
        System.out.println("Ligando o carro...");
        engine.start();
    }

    public void turnOffCar() {
        System.out.println("Desligando o carro...");
        engine.turnOff();
    }


    public String toString() {
        return "Marca: " + getBrand() + ", Modelo: " + getModel() + ", Ano: " + getYear() + ", Motor: " + engine.getType() + ", Potência: " + engine.getPower() + " HP";
    }

}