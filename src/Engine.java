import java.util.Objects;

public class Engine {
    private float power;

    Engine(float power) {
        this.power = power;
    }

    void engage() {
        System.out.println("The car is on.");
    }

    public float getPower() {
        return power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Engine)) return false;
        Engine engine = (Engine) o;
        return Float.compare(engine.power, power) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(power);
    }
}