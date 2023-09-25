package car;

public class Engine {

    private String type;
    private int power;
    private boolean start;

    public String getType() {
        return type;
    }

    public int getPower() {
        return power;
    }

    public boolean isStart() {
        return start;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    public void start() {
        if (!start) {
            System.out.println("Motor ligado");
            start = true;
        } else {
            System.out.println("Motor já está ligado");
        }
    }

    public void turnOff() {
        if (start) {
            System.out.println("Motor desligado");
            start = false;
        } else {
            System.out.println("Motor já está desligado");
        }
    }

    public String toString() {
        return "Motor: " + getType() + ", Potência: " + getPower() + " HP";
    }
}