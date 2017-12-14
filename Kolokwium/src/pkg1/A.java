package pkg1;

public class A {
    protected int number;
    String name;

    public A(int number, String name){
        this.number = number;
        this.name = name;
    }

    public void callDec(){
        dec();
    }

    public void print(){
        System.out.println(number + ", " + name);
    }

    public void calCha(){cha();}

    public void callInc(){inc();}

    private void inc(){
        number++;
    }

    protected void dec(){
        number--;
    }

    void cha(){
        name += "A";
    }
}
