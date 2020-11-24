public class Circle extends Shape {
    public static final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    public final double radius;

    @Override
    public double getArea() {
        return radius * radius * PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }
}
