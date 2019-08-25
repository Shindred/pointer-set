import java.util.Objects;

public class Tank {
    private float fuelVolume;

    Tank(float fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    public float getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(float fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tank)) return false;
        Tank tank = (Tank) o;
        return Float.compare(tank.fuelVolume, fuelVolume) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fuelVolume);
    }

    void reFuel(float fuelVolume) {
        if (hasFuel()) {
            System.out.println("Seems like you have to fill the car first");
        }
        this.fuelVolume += fuelVolume;
        System.out.println("Filling the car for " + fuelVolume + " litres of fuel" +
                "\nTotal fuel volume is " + this.fuelVolume + " litres now");
    }

    boolean hasFuel() {
        return fuelVolume != 0;
    }
}
