import java.util.Objects;

/**
 * Клас Кола успадкований від класу Фігур.
 * Має радіус.
 */
public class Circle extends Shape {
    private double radius;
    private int centerX;
    private int centerY;

    public Circle(String name, double radius, int centerX, int centerY) {
        super(name);
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    @Override
    public double shapeArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double shapePerimetr() {
        return Math.PI * (radius * 2);
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getCenterX() {
        return centerX;
    }

    public void setCenterX(int centerX) {
        this.centerX = centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public void setCenterY(int centerY) {
        this.centerY = centerY;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, centerX, centerY);
    }
}
