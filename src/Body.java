import java.util.Objects;

public class Body {

    private Colors color;
    private final BodyTypes type;

    Body(Colors color, BodyTypes bodyType) {
        this.color = color;
        this.type = bodyType;
    }

    public Colors getColor() {
        return color;
    }

    public BodyTypes getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Body)) return false;
        Body body = (Body) o;
        return color == body.color &&
                type == body.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, type);
    }

    void clean() {
        System.out.println("Your " + color.toString() + " car is washed");
    }
}