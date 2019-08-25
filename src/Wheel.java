import java.util.Objects;

public class Wheel {

    private float pressure;
    private int diameter;
    private WheelTypes type = WheelTypes.COMMON;

    Wheel() {
        this.pressure = 2.34f;
        this.diameter = 15;
    }

    Wheel(int diameter) {
        this.diameter = diameter;
        this.pressure = 2.34f;
    }

    Wheel(int diameter, WheelTypes type) {
        this.diameter = diameter;
        this.pressure = 2.34f;
        this.type = type;
    }

    public float getPressure() {
        return pressure;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setType(WheelTypes type) {
        this.type = type;
    }

    public WheelTypes getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wheel)) return false;
        Wheel wheel = (Wheel) o;
        return Float.compare(wheel.pressure, pressure) == 0 &&
                diameter == wheel.diameter &&
                type == wheel.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pressure, diameter, type);
    }

    void pump(float pressure) {
        this.pressure += pressure;
        System.out.println("Pumping your wheels for " + pressure +
                "\nNow pressure is " + this.pressure);
    }
}
