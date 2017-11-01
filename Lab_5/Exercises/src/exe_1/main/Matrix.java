package exe_1.main;

import java.io.*;
import java.util.Scanner;

class Matrix {
    private int rows, cols;
    private int[][] matrix;
    private static final String pathToResrc = "src/exe_1/resources/";

    Matrix(int _rows, int _cols){
        rows = _rows;
        cols = _cols;
        matrix = new int[rows][cols];
        this.fill();
    }

    Matrix(int[][] _array){
        rows = _array.length;
        cols = _array[0].length;
        matrix = new int[rows][cols];
        this.copy(_array);
    }

    Matrix(String pathToMatrixFile){
        StringBuilder strBld = new StringBuilder();
        Scanner inScan = null;

        try{
            File inFile = new File(pathToResrc + pathToMatrixFile);
            inScan = new Scanner(inFile);

            while(inScan.hasNext()){
                strBld.append(inScan.nextLine());
                strBld.append("\n");
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            if(inScan != null){
                inScan.close();
                System.out.println("Zamknięte");
            }else
                System.out.println("Nie zamknięte");
        }
    }

    void copy(int[][] _array){
        for (int i = 0; i < rows; i++) {
            System.arraycopy(_array[i], 0, this.matrix[i], 0, cols);
        }
    }

    private void fill(){
        for (int i = 0; i < rows; ++i){
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = i + j;
            }
        }
    }

    void print(){
        for (int i = 0; i < rows; ++i){
            System.out.print("{");
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]);
                if (j != cols-1) System.out.print(", ");
            }
            System.out.println("}");
        }
    }

    int getRows(){
        return rows;
    }

    int getCols(){
        return rows;
    }

    int getValueOnPosition(int _row, int _col){
        return matrix[_row][_col];
    }

    void add(Matrix matrixToAdd){
        try{
            if(this.getRows() != matrixToAdd.getRows() || this.getCols() != matrixToAdd.getCols())
                throw new MatrixException();
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < cols; j++) {
                    matrix[i][j] += matrixToAdd.getValueOnPosition(i, j);
                }
            }
        }catch(MatrixException e){
            e.printException();
        }
    }

    void sub(Matrix matrixToSub){
        try{
            if(this.getRows() != matrixToSub.getRows() || this.getCols() != matrixToSub.getCols())
                throw new MatrixException();
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < cols; j++) {
                    matrix[i][j] -= matrixToSub.getValueOnPosition(i, j);
                }
            }
        }catch(MatrixException e) {
            e.printException();
        }
    }

    void mul(Matrix matrixToMul){
        try{
            if(this.getRows() != matrixToMul.getCols() || this.getCols() != matrixToMul.getRows())
                throw new MatrixException();
            int[][] tmpArray = new int[rows][cols];
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < cols; j++){
                    for(int k = 0; k < cols; k++){
                        tmpArray[i][j] += matrix[i][k] * matrixToMul.getValueOnPosition(k, j);
                    }
                }
            }
            this.copy(tmpArray);
        }catch(MatrixException e) {
            e.printException();
        }
    }
}
