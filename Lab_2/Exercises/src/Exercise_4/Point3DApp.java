package Exercise_4;

public class Point3DApp{
    public static void main(String[] argv){
        Point2D p1 = new Point2D(4, 1);
        Point2D p2 = new Point2D(1, 4);
        System.out.println("Distance between p1 and p2: " + p1.distance(p2));
        Point3D p3 = new Point3D(0, 3, 0);
        Point3D p4 = new Point3D(4, 0, 1);
        System.out.println("Distance between p3 and p4: " + p3.distance(p4));
    }
}
