import java.util.Objects;

/**
 * Клас Трикутника успадкований від класу Фігур.
 * Містить назву, та 3 сторони.
 */

public class Triangle extends Shape {
    private int leftSide;
    private int rightSide;
    private int bottomSide;

    public Triangle(String name, int leftSide, int rightSide, int bottomSide) {
        super(name);
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        this.bottomSide = bottomSide;
    }

    @Override
    public double shapeArea() {
        double p = (leftSide + rightSide + bottomSide) / 2.0;
        return Math.sqrt(p * (p - leftSide) * (p - rightSide) * (p - bottomSide));
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

    public int getBottomSide() {
        return bottomSide;
    }

    public void setBottomSide(int bottomSide) {
        this.bottomSide = bottomSide;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return leftSide == triangle.leftSide && rightSide == triangle.rightSide && bottomSide == triangle.bottomSide;
    }

    @Override
    public int hashCode() {
        return Objects.hash(leftSide, rightSide, bottomSide);
    }
}
