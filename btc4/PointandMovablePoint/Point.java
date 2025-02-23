package PointandMovablePoint;

public class Point {
    private float x = 0.0f, y = 0.0f;
    public Point() {

    }
    public Point(float x,float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        float[] result = new float[2];  // construct an array of 2 elements
        result[0] = 4;
        result[1] = 5;
        return result;
    }

    @Override
    public String toString() {
        return "(" +
                x +
                ", " + y +
                ')';
    }
}
