import java.util.Objects;

/**
 * Клас Паралелограм успадкований від класу Фігур.
 * Містить назву, та 4 сторони.
 */

public class Paralleogram extends Shape {
    private double base;
    private double side;
    private double angle;

    public Paralleogram(String name, double base, double side, double angle) {
        super(name);
        this.base = base;
        this.side = side;
        this.angle = angle;
    }

    @Override
    public double shapeArea() {
        return base * side * Math.sin(Math.toRadians(angle));
    }

    @Override
    public double shapePerimetr() {
        return 2 * (base * side);
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public double getAngle() {
        return angle;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Paralleogram paralleogram = (Paralleogram) o;
        return base == paralleogram.base && side == paralleogram.side && angle == paralleogram.angle;
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, side, angle);
    }

}
