public class Main {
    public static void main(String[] args) {
        Quad firstQuad = new Quad("Правильний квадрат", 2, 2, 2, 2);
        Quad nextQuad = new Quad("Не правильний квадрат", 3, 3, 2, 2);
        Quad goodQuad = new Quad("Правильний квадрат 2", 2, 2, 2, 2);

        TestsShapes.getNameShape(firstQuad);
        TestsShapes.getNameShape(nextQuad);
        TestsShapes.getNameShape(goodQuad);

        System.out.println(TestsShapes.equalsShapes(firstQuad, nextQuad));
        System.out.println(TestsShapes.equalsShapes(firstQuad, goodQuad));

        System.out.println(firstQuad.correctQuad());
        System.out.println(nextQuad.correctQuad());
    }
}