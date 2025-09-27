import java.util.Objects;

/**
 * Клас Трикутника успадкований від класу Фігур.
 * Містить назву, та 3 сторони.
 */

public class Triangle extends Shape {
    private double leftSide;
    private double rightSide;
    private double bottomSide;

    public Triangle(String name, double leftSide, double rightSide, double bottomSide) {
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

    @Override
    public double shapePerimetr() {
        return leftSide + rightSide + bottomSide;
    }

    public double getLeftSide() {
        return leftSide;
    }

    public void setLeftSide(double leftSide) {
        this.leftSide = leftSide;
    }

    public double getRightSide() {
        return rightSide;
    }

    public void setRightSide(double rightSide) {
        this.rightSide = rightSide;
    }

    public double getBottomSide() {
        return bottomSide;
    }

    public void setBottomSide(double bottomSide) {
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
