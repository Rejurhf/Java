package exe_4.main;

import java.io.File;

public class CodeMaker{
    public static void main(String[] argv){
        String pathToResrc = "src/exe_4/resources/";
        File fileToCrypt = new File(pathToResrc + "fileToCript.txt");
        File fileToSaveCrypt = new File(pathToResrc + "fileToSaveCript.txt");
        File fileToDecrypt = new File(pathToResrc + "fileToDecript.txt");
        File fileToSaveDecrypt = new File(pathToResrc + "fileToSaveDecript.txt");

        String a = "abc";
        System.out.println(a);
        a = a.substring(0, 1) + "g" + a.substring(1 + 1);
        System.out.println(a);
    }
}
