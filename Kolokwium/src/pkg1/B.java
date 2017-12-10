package pkg1;

public class B extends A{
    B(){
        prot = "B.prot";
        publ = "B.publ";
        pack = "B.pack";
    }

    public void print(){
        System.out.println(prot + publ + pack);
    }
}
