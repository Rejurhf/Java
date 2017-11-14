package Exercise_7;

public class MatrixCalc {
    public static void main(String[] argv){
        Matrix m1 = new Matrix(4, 4);
        m1.print();
        System.out.println();
        int[][] array2d = {{1,2,3,4}, {2,3,4,5}, {3,4,5,6}, {4,5,6,7}};
        Matrix m2 = new Matrix(array2d);
        m2.print();
        System.out.println();
        m1.add(m2);
        m1.print();
        System.out.println();
        m1.sub(m2);
        m1.print();
        System.out.println();
        m1.mul(m2);
        m1.print();
        System.out.println();
    }
}
