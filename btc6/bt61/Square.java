package bt61;
public class Square extends Rentangle{
    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide() {
        return getLength();
    }
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
