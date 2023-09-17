package car;

public class Car {

    private String brand;
    private String model;
    private int year;

    private int kilometers;

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
}