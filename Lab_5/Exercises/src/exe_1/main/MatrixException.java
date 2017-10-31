package exe_1.main;

public class MatrixException extends Exception{
    public MatrixException(){ super(); }

    public void printException(){
        System.out.println("Wymiary macierzy są nieodpowiednie");
    }
}
