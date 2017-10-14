package Exercise_3;

public class Point2D{
        private double x, y;

        Point2D(double _x, double _y){
            x = _x;
            y = _y;
        }

        public double getX(){ return x; }
        public double getY(){ return y; }

        public void setX(double _x){ x = _x; }
        public void setY(double _y){ y = _y; }

        double distance(Point2D _point){
            double dX = x - _point.getX();
            double dY = y - _point.getY();
            return Math.sqrt((dX * dX) + (dY * dY));
        }
}
