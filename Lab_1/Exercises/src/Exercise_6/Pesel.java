package Exercise_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pesel {
    public static void main(String[] argv){
        System.out.print("Podaj swój numer PESEL: ");
        String pesel = null;
        try{
            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader buffer = new BufferedReader(reader);
            pesel = buffer.readLine();
        }catch (IOException e){e.printStackTrace();}
        if(PeselCheck.check(pesel)) System.out.print("Twój Pesel jest OK");
    }
}
