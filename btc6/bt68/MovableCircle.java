package bt68;

public class MovableCircle implements Movable{
    MovablePoint topLeft;
    MovablePoint bottomRight;
    public MovableCircle(int x1,int y1,int xSpeed ,int ySpeed ,int x2,int y2) {
        this.topLeft=new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight=new MovablePoint(x2, y2, xSpeed, ySpeed);

    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public String toString() {
        return  topLeft + " " + bottomRight ;
    }
}
