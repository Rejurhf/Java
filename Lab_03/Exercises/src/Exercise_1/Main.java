package Exercise_1;

import java.util.LinkedList;

public class Main{
    public static void main(String[] argv){
        double pi = 3.1415;
        TestFinal changePi = new TestFinal();
        System.out.println(changePi.takeFinalAsArgument(pi));
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(21);
        list.add(22);
        changePi.takeFinalListAsArgument(list);
    }
}
