package exe_4;

public class Rectangle extends Shape{
    @Override
    public void draw() {
        for (int i = 0; i < 5; i++) {
            if(i == 0 || i == 4)
                System.out.println("xxxxxxxxxxxxxxx");
            else
                System.out.println("x             x");
        }
    }
}
