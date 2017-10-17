package Exercise_1;

import java.util.LinkedList;

public class TestFinal{
    public double takeFinalAsArgument(final double var){
        //var++;                                           nie można
        return var;
    }

    public void takeFinalListAsArgument(final LinkedList<Integer> obj){
        obj.add(23);
        obj.poll();
        obj.addFirst(20);
        //obj = new LinkedList<Integer>();                 nie można
        for(Integer o:obj ){
            System.out.println(o);
        }
    }
}
