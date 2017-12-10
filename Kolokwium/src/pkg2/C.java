package pkg2;

import pkg1.B;

public class C extends B {
    C(){
        super();
        prot = "C.prot";
        publ = "C.publ";
    }

    public void print(){
        System.out.println(prot + publ);
    }
}
