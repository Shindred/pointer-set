import java.util.Objects;

public class SteeringWheel {

    private boolean isMuiltifunctioned;
    private float position = 180;

    SteeringWheel(boolean isMuiltifunctioned) {
        this.isMuiltifunctioned = isMuiltifunctioned;
    }

    public float getPosition() {
        return position;
    }

    public void setType(boolean isMuiltifunctioned) {
        this.isMuiltifunctioned = isMuiltifunctioned;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SteeringWheel)) return false;
        SteeringWheel that = (SteeringWheel) o;
        return isMuiltifunctioned == that.isMuiltifunctioned &&
                Float.compare(that.position, position) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isMuiltifunctioned, position);
    }

    public boolean isMuiltifunctioned() {
        return isMuiltifunctioned;
    }

    void turn(float angle) {
        this.position += angle;

        System.out.println("You're turning for " + angle + " angles" +
                "\nYour steering wheel's position is at " + position + " angles now");
    }
}
