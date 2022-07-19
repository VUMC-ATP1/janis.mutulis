package objects;

public class Circle {
    double PI = 3.14;
    double radius;
    double area;

    public double getArea(double radius) {
        area = PI * Math.pow(radius, 2);
        return area;
    }

    public Circle(double radius) {
        this.radius = getArea(radius);
    }
    public Circle() {
    }
}
