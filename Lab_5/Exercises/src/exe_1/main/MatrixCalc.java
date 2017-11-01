package exe_1.main;

import exe_1.main.Matrix;

public class MatrixCalc {
    public static void main(String[] argv){
        Matrix m1 = new Matrix(4, 4);
        m1.print();
        int[][] array2d = {{1,2,3,4}, {2,3,4,5}, {3,4,5,6}, {4,5,6,7}};
        Matrix m2 = new Matrix(array2d);
        Matrix m3 = new Matrix(3,2);
        Matrix m4 = new Matrix("matrix.txt");

        //m1.add(m3);
        //m1.print();


        /*
        m2.print();
        m1.add(m2);
        m1.print();
        m1.sub(m2);
        m1.print();
        m1.mul(m2);
        m1.print();*/
    }
}
