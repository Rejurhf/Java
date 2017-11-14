package exe_1;

public class Square extends Shape{
    @Override
    public void draw(){
        for (int i = 0; i < 5; i++) {
            if(i == 0 || i == 4)
                System.out.println("xxxxxxxxxx");
            else
                System.out.println("x        x");
        }
    }
}
