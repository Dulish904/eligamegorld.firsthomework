/**
 * Базовий клас фігур.
 * Містить назву фігури.
 */

public class Shape implements BaseMethodShape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public double shapeArea() {
        return -1.0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }
}
