package pkg1;

public class B extends A{
    protected void dec(){
        number-=10;
    }

//    public void print(){
//        System.out.println(number + ", " + name);
//    }

    void cha(){
        name += "B";
    }

    private void inc(){
        number += 10;
    }

    public B(int num,String nam){
        super(num, nam);
    }
}
