import java.lang.Math;

public class Point2D {

    private double x;
    private double y;

    public Point2D(double initialX, double initialY) {
        this.x = initialX;
        this.y = initialY;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void moveBy(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public void moveTo(double newX, double newY) {
        this.x = newX;
        this.y = newY;
    }

    public double distance(Point2D otherPoint) {
        double deltaX = otherPoint.getX() - this.x;
        double deltaY = otherPoint.getY() - this.y;
        double distanceSquared = (deltaX * deltaX) + (deltaY * deltaY);
        double distance = Math.sqrt(distanceSquared);
        return distance;
    }

    public String toString() {
        return String.format("(%.1f,%.1f)", this.x, this.y);
    }

}