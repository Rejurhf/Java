package exe_1;

public class Circle extends Shape{
    @Override
    public void draw() {
        for (int i = 0; i < 5; i++) {
            if(i == 0 || i == 4)
                System.out.println("  x");
            else if(i == 1 || i == 3)
                System.out.println(" x x");
            else
                System.out.println("x   x");
        }
    }
}
