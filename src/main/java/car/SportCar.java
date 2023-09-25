package car;

public class SportCar extends Car{

    private String speed;
    private int speedMax;

    public String getSpeed() {
        return speed;
    }

    public int getSpeedMax() {
        return speedMax;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void setSpeedMax(int speedMax) {
        int validatedSpeedMax = radar(speedMax);
        if (validatedSpeedMax >= 0) {
            this.speedMax = validatedSpeedMax;
        } else {
            System.out.println("Não é possível adicionar quilômetros negativos");
        }
    }


    public String toString() {
        return "Marca: " + getBrand() + ", Modelo: " + getModel() + ", Ano: " + getYear() + ", Velociade Máxima: " + getSpeedMax() + " Km/h";
    }

}