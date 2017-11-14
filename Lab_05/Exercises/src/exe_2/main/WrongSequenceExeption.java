package exe_2.main;

public class WrongSequenceExeption extends Exception{
    public WrongSequenceExeption(){ super(); }

    public void printExeption(int startFrame, int endFrame){
        System.out.println("Wrong sequence, start frame (" + startFrame +
                ") grater than end frame (" + endFrame + ").");
    }
}
