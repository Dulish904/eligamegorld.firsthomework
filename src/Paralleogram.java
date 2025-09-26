import java.util.Objects;

/**
 * Клас Паралелограм успадкований від класу Фігур.
 * Містить назву, та 4 сторони.
 */

public class Paralleogram extends Shape {
    private int leftSide;
    private int rightSide;
    private int angle;

    public Paralleogram(String name, int leftSide, int rightSide, int angle) {
        super(name);
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        this.angle = angle;
    }

    @Override
    public double shapeArea() {
        return leftSide * rightSide * Math.sin(Math.toRadians(angle));
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

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Paralleogram that = (Paralleogram) o;
        return leftSide == that.leftSide && rightSide == that.rightSide && angle == that.angle;
    }

    @Override
    public int hashCode() {
        return Objects.hash(leftSide, rightSide, angle);
    }
}
