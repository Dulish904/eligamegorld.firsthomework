/**
 * Клас Тестування Фігур.
 * Базова перевірка правильного виконання методів.
 */

class TestsShapes {
    public static void getNameShape(Shape shape) {
        System.out.println(shape);
    }

    public static boolean equalsShapes(Shape firstShape, Shape nextShape) {
        return firstShape.equals(nextShape);
    }

    public static void shapeArea(Shape shape) {
        if (shape.shapeArea() < 0) {
            System.out.println("Виникла ПРОБЛЕМА при обчислені площі!");
        } else {
            System.out.println("Ok");
        }
    }
}
