package bt61;
public class Rentangle extends Shape{
    protected double width = 1.0;
    protected double length = 1.0;
    public Rentangle() {

    }
    public Rentangle(double width,double length) {
        this.width=width;
        this.length=length;
    }
    public Rentangle(double width,double length,String color,boolean filled) {
        super(color,filled);
        this.length=length;
        this.width=width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * ( this.width + this.length );
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
