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
        Point3D p3 = new Point3D(7,8,9);
        points.add(p1);
        points.add(p2);
        points.add(p3);

        while(true){
            System.out.print("--------------------\n" +
                    "1. Wczytaj punkt 3D\n" +
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
                System.out.print("Podaj współrzędne punktu: ");
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
                int i = 0;
                for(Point3D point:points){
                    System.out.println("Punkt " + i + ". X: " + point.getX() + " Y: " +
                            point.getY() + " Z: " + point.getZ());
                    ++i;
                }
            }else if(in.equals("3")){
                System.out.print("Wybierz punkt od którego chcesz liczyć odległości: ");
                int pos = 0;
                try{
                    InputStreamReader rd1 = new InputStreamReader(System.in);
                    BufferedReader bfr1 = new BufferedReader(rd1);

                    pos = Integer.parseInt(bfr1.readLine());
                }catch (IOException e){e.printStackTrace();}

                int i = 0;
                for(Point3D point:points){
                    if(!(pos == points.indexOf(point))) {
                        System.out.println("Odległosć między punktem " + pos + " a punktem " + i +
                                " wynosi: " + points.get(pos).distance(point));
                        ++i;
                    }else
                        ++i;
                }
            }else{
                break;
            }
        }
    }
}
