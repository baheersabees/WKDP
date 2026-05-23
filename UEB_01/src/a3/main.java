package a3;

public class main {
    public static Shape createShape(char type, double a, double b) {
        if (type == 'c') {
            return new Circle(a);
        } else if (type == 'r') {
            return new Rectangle(a, b);
        } else {
            return null;
        }
    }
    public static void main(String[] args) {
        Shape circle = createShape('c', 2.0, 0);
        System.out.println("Circle with radius 2.0 - Area: " + circle.getArea());
        
        Shape rectangle = createShape('r', 3.0, 4.0);
        System.out.println("Rectangle 3.0 x 4.0 - Area: " + rectangle.getArea());
        
        Shape circle2 = createShape('c', 5.0, 0);
        System.out.println("Circle with radius 5.0 - Area: " + circle2.getArea());
    }
}
