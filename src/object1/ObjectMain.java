package object1;


import org.w3c.dom.css.Rect;

class Point implements Cloneable{
    int xPos;
    int yPos;

    public Point(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public void showPosition(){
        System.out.printf("%d, %d", xPos, yPos);
        System.out.println();
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
class Rectangle implements Cloneable{
    Point leftPoint;
    Point rightPoint;

    public Rectangle(Point leftPoint, Point rightPoint) {
        this.leftPoint = leftPoint;
        this.rightPoint = rightPoint;
    }
    public void changePos(Point left, Point right){
        leftPoint = left;
        rightPoint =right;
    }
    public void showPosition() {
        System.out.print("좌측 상단: ");
        leftPoint.showPosition();

        System.out.print("우측 하단: ");
        rightPoint.showPosition();
        System.out.println();
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class ObjectMain {
    public static void main(String[] args) {
        Point org = new Point(3,4);
        Point cpy; // 3,4
        Point chg = new Point(1,2);
        Rectangle cpy2;

        try{
            cpy = (Point)org.clone();
            Rectangle rect = new Rectangle(org, cpy);
            cpy2 = (Rectangle)rect.clone();

            rect.changePos(chg, org);
            rect.showPosition();
            cpy2.showPosition();
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
