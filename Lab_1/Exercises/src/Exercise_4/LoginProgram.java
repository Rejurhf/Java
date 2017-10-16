package Exercise_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoginProgram {
    public static void main(String[] argv){
        Login log = new Login ("ala", "makota");
        String login = null, haslo = null;
        try{
            InputStreamReader rd = new InputStreamReader(System.in);
            BufferedReader bfr = new BufferedReader(rd);

            System.out.print("Podaj login: ");
            login = bfr.readLine();
            System.out.print("Podaj hasło: ");
            haslo = bfr.readLine();
        }catch(IOException e){e.printStackTrace();}
        if(log.check(login, haslo)) System.out.print("OK");
            else System.out.print("Złe hasło lub login");
    }
}
