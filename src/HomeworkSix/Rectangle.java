package HomeworkSix;

public class Rectangle {

    private Point pointUpperLeft;
    private Point pointLowerRight;

    public Rectangle(Point pointUpperLeft, Point pointLowerRight) {
        this.pointUpperLeft = pointUpperLeft;
        this.pointLowerRight = pointLowerRight;
    }

    public double diagonal() {
        return pointUpperLeft.distance(pointLowerRight);
    }

    public int area() {
        return (pointLowerRight.getX() - pointUpperLeft.getX()) * (pointUpperLeft.getY() - pointLowerRight.getY());
    }
}

