package Exercise_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JIn {
    public static Integer getNumber(){
        Integer number = null;
        System.out.print("Podaj liczbę: ");
        try{
            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader buffer = new BufferedReader(reader);
            number = Integer.parseInt(buffer.readLine());
        }catch (IOException e){e.printStackTrace();}
        return number;
    }
}
