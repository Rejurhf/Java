import pkg1.A;
import pkg1.B;
import pkg2.C;

public class main {
    public static void main(String[] args) {
        A a = new A(4, "a");
        B b = new B(5, "b");
        C c = new C(6,"c");
        a.print();
        a.calCha();
        a.print();
        a.callDec();
        a.print();
        a.callInc();
        a.print();

        b.print();
        b.calCha();
        b.print();
        b.callDec();
        b.print();
        b.callInc();
        b.print();

        c.print();
    }
}
