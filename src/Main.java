public class Main {
    public static void main(String[] args) {
        Quad quadOne = new Quad("Quad1", 2, 2);
        Quad quadTwo = new Quad("Quad2", 2, 2);
        Quad quadThree = new Quad("Quad3", 3, 3);

        Rectangle rectOne = new Rectangle("Rectangle1", 6, 2);
        Rectangle rectTwo = new Rectangle("Rectangle2", 6, 2);
        Rectangle rectThree = new Rectangle("Rectangle3", 12, 4);

        Paralleogram paralOne = new Paralleogram("Paralleogram1", 6, 6, 15);
        Paralleogram paralTwo = new Paralleogram("Paralleogram2", 6, 6, 15);
        Paralleogram paralThree = new Paralleogram("Paralleogram3", 12, 13, 30);

        Triangle trioOne = new Triangle("Triangle1", 3, 3, 4);
        Triangle trioTwo = new Triangle("Triangle2", 3, 3, 4);
        Triangle trioThree = new Triangle("Triangle3", 7, 7, 4);

        Circle circleOne = new Circle("Circle1", 5, 5,5);
        Circle circleTwo = new Circle("Circle2", 5, 5,5);
        Circle circleThree = new Circle("Circle3", 7, 8,8);

        TestsShapes.getNameShape(quadOne);
        // Quad перевірка equals
        System.out.println(TestsShapes.equalsShapes(quadOne, quadTwo));
        System.out.println(TestsShapes.equalsShapes(quadOne, quadThree));
        // Quad перевірка особистого методу
        System.out.println(quadOne.correctQuad());
        System.out.println(quadThree.correctQuad());
        // Quad спільні методи
        System.out.println(quadOne.shapeArea());
        System.out.println(quadTwo.shapePerimetr());

        TestsShapes.getNameShape(rectOne);
        // Rectangle перевірка equals
        System.out.println(TestsShapes.equalsShapes(rectOne, rectTwo));
        System.out.println(TestsShapes.equalsShapes(rectOne, rectThree));
        // Rectangle перевірка особистого методу
        TestsShapes.getNameShape(rectOne);
        System.out.println("Height: " + rectOne.getHeight());
        System.out.println("Width: " + rectOne.getWidth());
        rectOne.turnOver();
        System.out.println("Height: " + rectOne.getHeight());
        System.out.println("Width: " + rectOne.getWidth());
        // Rectangle спільні методи
        System.out.println(rectOne.shapeArea());
        System.out.println(rectOne.shapePerimetr());

        TestsShapes.getNameShape(paralOne);
        // Paralleogram перевірка equals
        System.out.println(TestsShapes.equalsShapes(paralOne, paralTwo));
        System.out.println(TestsShapes.equalsShapes(paralOne, paralThree));
        // Paralleogram спільні методи
        System.out.println(paralOne.shapeArea());
        System.out.println(paralOne.shapePerimetr());

        TestsShapes.getNameShape(trioOne);
        // Triangle перевірка equals
        System.out.println(TestsShapes.equalsShapes(trioOne, trioTwo));
        System.out.println(TestsShapes.equalsShapes(trioOne, trioThree));
        // Triangle спільні методи
        System.out.println(trioOne.shapeArea());
        System.out.println(trioOne.shapePerimetr());

        TestsShapes.getNameShape(circleOne);
        // Circle перевірка equals
        System.out.println(TestsShapes.equalsShapes(circleOne, circleTwo));
        System.out.println(TestsShapes.equalsShapes(circleOne, circleThree));
        // Circle перевірка особистого методу
        System.out.println(circleOne.getDiameter());
        // Circle спільні методи
        System.out.println(circleOne.shapeArea());
        System.out.println(circleOne.shapePerimetr());


    }
}