package bt72;

import java.util.ArrayList;
import java.util.List;
public class PolyLine {
    private List<Point> points;
    public PolyLine() {
        points = new ArrayList<Point>();
    }
    public PolyLine(List<Point> points) {
        this.points=points;
    }

    public void appendPoint(int x, int y) {
        Point newPoint = new Point(x, y);
        points.add(newPoint);
    }

    public void appendPoint(Point point) {
        points.add(point);
    }
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (Point aPoint : points) {
            sb.append(aPoint.toString());
        }
        sb.append("}");
        return sb.toString();
    }
    public double getLength() {
        double Length = 0.0;
        for (int i = 1; i < points.size(); i++) {
            Point p1 = points.get(i - 1);
            Point p2 = points.get(i);
            Length += p1.distance(p2);
        }
        return Length;
    }
}
