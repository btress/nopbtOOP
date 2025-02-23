package bt65;
public class Circle implements GeometricObject{
    double radius;
    public Circle(double radius) {
        this.radius=radius;
    }

    @Override
    public String toString() {
        return "Circle[=" + radius + "]";
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
