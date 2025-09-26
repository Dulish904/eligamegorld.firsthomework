import java.util.Objects;

/**
 * Клас Квадрату успадкований від класу Фігур.
 * Містить назву, та 4 сторони.
 */

public class Quad extends Shape {
    private int leftSide;
    private int rightSide;
    private int upperSide;
    private int bottomSide;

    public Quad(String name, int leftSide, int rightSide, int upperSide, int bottomSide) {
        super(name);
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        this.upperSide = upperSide;
        this.bottomSide = bottomSide;
    }

    @Override
    public double shapeArea() {
        return correctQuad() ? (double) leftSide * leftSide: -1;
    }

    public boolean correctQuad() {
        return leftSide == rightSide & leftSide == upperSide & leftSide == bottomSide;
    }

    public int getLeftSide() {
        return leftSide;
    }

    public void setLeftSide(int leftSide) {
        this.leftSide = leftSide;
    }

    public int getRightSide() {
        return rightSide;
    }

    public void setRightSide(int rightSide) {
        this.rightSide = rightSide;
    }

    public int getUpperSide() {
        return upperSide;
    }

    public void setUpperSide(int upperSide) {
        this.upperSide = upperSide;
    }

    public int getBottomSide() {
        return bottomSide;
    }

    public void setBottomSide(int bottomSide) {
        this.bottomSide = bottomSide;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Quad quad = (Quad) o;
        return leftSide == quad.leftSide && rightSide == quad.rightSide && upperSide == quad.upperSide && bottomSide == quad.bottomSide;
    }

    @Override
    public int hashCode() {
        return Objects.hash(leftSide, rightSide, upperSide, bottomSide);
    }
}
