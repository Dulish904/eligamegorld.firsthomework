import java.util.Objects;

/**
 * Клас Прямокутника успадкований від класу Фігур.
 * Містить назву, та 4 сторони.
 */

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double shapeArea() {
        return width * height;
    }

    @Override
    public double shapePerimetr() {
        return width * 2 + height * 2;
    }

    public void turnOver() {
        double buff = getWidth();
        setWidth(getHeight());
        setHeight(buff);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(width, rectangle.width) == 0 && Double.compare(height, rectangle.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }
}
