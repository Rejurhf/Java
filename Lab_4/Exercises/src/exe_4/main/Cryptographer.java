package exe_4.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cryptographer{
    private static final String pathToResrc = "src/exe_4/resources/";

    public void cryptFile(String inFileName, String outFileName, Algorithm algo){
        String strToCrp = this.readFile(inFileName);
        System.out.println(strToCrp);
    }

    public void decryptFile(String inFileName, String outFileName, Algorithm algo){

    }

    protected String readFile(String inFileName){
        StringBuilder strBld = new StringBuilder();

        try{
            File inFile = new File(pathToResrc + inFileName);
            Scanner inScan = new Scanner(inFile);

            while(inScan.hasNextLine()){
                strBld.append(inScan.nextLine() + "\n");
            }
        }catch (FileNotFoundException e){e.printStackTrace();}

        return strBld.toString();
    }
}
