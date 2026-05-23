package a3;

public class Circle implements Shape {
    double radius;

    public Circle(double r) {
        this.radius = r;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }
}
