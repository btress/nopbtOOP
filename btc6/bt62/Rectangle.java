package bt62;

public class Rectangle implements GeometricObject{
    double width;
    double length;
    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "Rectangle[width=" + width + ",length=" + length + "]";
    }
    public Rectangle(double width,double length) {
        this.width=width;
        this.length=length;
    }
}
