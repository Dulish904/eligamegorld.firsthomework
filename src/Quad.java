import java.util.Objects;

/**
 * Клас Квадрату успадкований від класу Фігур.
 * Містить назву, та 4 сторони.
 */

public class Quad extends Shape {
    private double height;
    private double width;

    public Quad(String name, double height, double width) {
        super(name);
        this.height = height;
        this.width = width;
    }

    @Override
    public double shapeArea() {
        return correctQuad() ? height * height: -1;
    }

    @Override
    public double shapePerimetr() {
        return height * width;
    }

    public boolean correctQuad() {
        return height == width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Quad quad = (Quad) o;
        return width == quad.width && height == quad.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }
}
