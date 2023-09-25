package car;

public class SportCar extends Car{

    private String speed;
    private int speedMax;
    private int currentSpeed;

    public String getSpeed() {
        return speed;
    }

    public int getSpeedMax() {
        return speedMax;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void setSpeedMax(int speedMax) {
        this.speedMax = speedMax;
    }

    public int setCurrentSpeed(int currentSpeed) {
        int validatedSpeed = radar(currentSpeed);
        if (validatedSpeed >= 0) {
            this.currentSpeed = validatedSpeed;
        } else {
            System.out.println("Não é possível adicionar quilômetros negativos");
        }
        return this.currentSpeed;
    }

    public String toString() {
        return "Marca: " + getBrand() + ", Modelo: " + getModel() + ", Ano: " + getYear() + ", Velociade Atual: " + getCurrentSpeed() + " Km/h"
                + "\nMarca: " + getBrand() + ", Modelo: " + getModel() + ", Ano: " + getYear() + ", Velociade Máxima: " + getSpeedMax() + " Km/h";
    }

}