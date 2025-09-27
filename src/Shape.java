/**
 * Базовий клас фігур.
 * Містить назву фігури.
 */

abstract  class Shape {
    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public double shapeArea() {
        return -1.0;
    }

    public double shapePerimetr() {
        return -1.0;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }
}
