import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
    public static void main(String[] argv){
        String text = null;
        try {
            InputStreamReader rd = new InputStreamReader(System.in);
            BufferedReader bfr = new BufferedReader(rd);
            System.out.print("Enter text: ");
            text = bfr.readLine();
        }catch(IOException e){e.printStackTrace();}
        System.out.print("Wpisałeś: " + text);
    }
}
