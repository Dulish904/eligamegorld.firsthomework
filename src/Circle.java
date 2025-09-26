import java.util.Objects;

/**
 * Клас Кола успадкований від класу Фігур.
 * Має радіус.
 */
public class Circle extends Shape {
    private int radius;
    private int centerX;
    private int centerY;

    public Circle(String name, int radius, int centerX, int centerY) {
        super(name);
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    @Override
    public double shapeArea() {
        return Math.PI * radius * radius;
    }

    public int getDiameter() {
        return 2 * radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
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
        return radius == circle.radius && centerX == circle.centerX && centerY == circle.centerY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, centerX, centerY);
    }
}
