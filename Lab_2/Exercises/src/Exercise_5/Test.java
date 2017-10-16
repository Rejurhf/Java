package Exercise_5;

import Exercise_4.Point3D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Test {
    public static void main(String[] argv){
        LinkedList<Point3D> points = new LinkedList<Point3D>();
        String in = null;

        Point3D p1 = new Point3D(1,2,3);
        Point3D p2 = new Point3D(4,5,6);
        points.add(p1);
        points.add(p2);

        while(true){
            System.out.print("1. Wczytaj punkt 3D\n" +
                    "2. Wyświetl wszystkie punkty\n" +
                    "3. Oblicz odległość\n" +
                    "4. Zakończ\n" +
                    ">: ");
            try{
                InputStreamReader rd = new InputStreamReader(System.in);
                BufferedReader bfr = new BufferedReader(rd);

                in = bfr.readLine();
            }catch (IOException e){e.printStackTrace();}
            if(in.equals("1")){
                double[] tab = new double[3];
                try{
                    InputStreamReader rd1 = new InputStreamReader(System.in);
                    BufferedReader bfr1 = new BufferedReader(rd1);

                    tab[0] = Double.parseDouble(bfr1.readLine());
                    tab[1] = Double.parseDouble(bfr1.readLine());
                    tab[2] = Double.parseDouble(bfr1.readLine());
                }catch (IOException e){e.printStackTrace();}
                Point3D p = new Point3D(tab[0],tab[1],tab[2]);
                points.add(p);
            }else if(in.equals("2")){
                for(Point3D point:points){
                    System.out.println("X: " + point.getX() + " Y: " + point.getY() + " Z: " + point.getZ());
                }
            }else if(in.equals("3")){
                for(Point3D point:points){
                    System.out.println("Cos: " + point.distance(p1));
                }
            }else{
                break;
            }
        }
    }
}
