package exe_4.main;

import java.io.*;
import java.util.Scanner;

public class Cryptographer{
    private static final String pathToResrc = "src/exe_4/resources/";

    public void cryptFile(String inFileName, String outFileName, Algorithm algo){
        String strToCrp = this.readFile(inFileName);
        this.saveToFile(outFileName, strToCrp);
    }

    public void decryptFile(String inFileName, String outFileName, Algorithm algo){

    }

    private String readFile(String inFileName){
        StringBuilder strBld = new StringBuilder();

        try{
            File inFile = new File(pathToResrc + inFileName);
            Scanner inScan = new Scanner(inFile);

            while(inScan.hasNextLine()){
                strBld.append(inScan.nextLine()).append("\n");
            }
            inScan.close();
        }catch (FileNotFoundException e){e.printStackTrace();}

        return strBld.toString();
    }

    private void saveToFile(String outFileName, String textToSave){
        Scanner scanner = new Scanner(textToSave);
        try{
           File outFile = new File(pathToResrc + outFileName);
           FileWriter writeToFile = new FileWriter(outFile);

           writeToFile.flush();
           while(scanner.hasNextLine()){
               writeToFile.write(scanner.nextLine());
               writeToFile.write("\r\n");
           }
           writeToFile.close();
        }catch(IOException e){e.printStackTrace();}
    }
}
