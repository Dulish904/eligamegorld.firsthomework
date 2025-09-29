/**
 * Базовий клас фігур.
 * Містить назву фігури.
 */

abstract  class Shape {
    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    abstract double shapeArea();

    abstract double shapePerimetr();

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }
}
