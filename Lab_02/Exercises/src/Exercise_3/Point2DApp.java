package Exercise_3;

public class Point2DApp{
    public static void main(String[] argv){
        Point2D p1 = new Point2D(4, 4);
        Point2D p2 = new Point2D(1, 4);
        System.out.println("Distance between p1 and p2: " + p1.distance(p2));
    }
}
