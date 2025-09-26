import java.util.Objects;

/**
 * Клас Прямокутника успадкований від класу Фігур.
 * Містить назву, та 4 сторони.
 */

public class Rectangle extends Shape {
    private int leftSide;
    private int rightSide;
    private int upperSide;
    private int bottomSide;

    public Rectangle(String name, int leftSide, int rightSide, int upperSide, int bottomSide) {
        super(name);
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        this.upperSide = upperSide;
        this.bottomSide = bottomSide;
    }

    @Override
    public double shapeArea() {
        return correctQuad() ? (double) leftSide * upperSide: -1;
    }

    public boolean correctQuad() {
        return leftSide == rightSide & upperSide == bottomSide;
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
        Rectangle rectangle = (Rectangle) o;
        return leftSide == rectangle.leftSide && rightSide == rectangle.rightSide && upperSide == rectangle.upperSide && bottomSide == rectangle.bottomSide;
    }

    @Override
    public int hashCode() {
        return Objects.hash(leftSide, rightSide, upperSide, bottomSide);
    }
}
