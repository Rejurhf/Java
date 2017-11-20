package Exercise_4;

public class Point3D extends Point2D{
    private double z;

    public Point3D(double _x, double _y, double _z){
        super(_x, _y);
        z = _z;
    }

    public double getZ(){ return z; }

    public void setZ(double _z){ z = _z; }

    public double distance(Point3D _point){
        double dX = x - _point.getX();
        double dY = y - _point.getY();
        double dZ = z - _point.getZ();
        return Math.sqrt((dX * dX) + (dY * dY) + (dZ * dZ));
    }
}
