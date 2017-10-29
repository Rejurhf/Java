package exe_4.main;

import java.io.*;
import java.util.Scanner;

public class Cryptographer{
    private static final String pathToResrc = "src/exe_4/resources/";

    public void cryptFile(String inFileName, String outFileName, Algorithm algo){
        String strToCrp = this.readFile(inFileName);

        StringBuilder cryptedText = new StringBuilder();
        String[] textLineByLine = strToCrp.split("\n");
        for(String str:textLineByLine){
            String[] lineWordByWord = str.split(" ");
            for(String word:lineWordByWord){
                cryptedText.append(algo.crypt(word));
                cryptedText.append(" ");
            }
            cryptedText.append("\n");
        }

        this.saveToFile(outFileName, cryptedText.toString());
    }

    public void decryptFile(String inFileName, String outFileName, Algorithm algo){
        String strToDecrp = this.readFile(inFileName);

        StringBuilder decryptedText = new StringBuilder();
        String[] textLineByLine = strToDecrp.split("\n");
        for(String str:textLineByLine){
            String[] lineWordByWord = str.split(" ");
            for(String word:lineWordByWord){
                decryptedText.append(algo.decrypt(word));
                decryptedText.append(" ");
            }
            decryptedText.append("\n");
        }

        this.saveToFile(outFileName, decryptedText.toString());
    }

    private String readFile(String inFileName){
        StringBuilder strBld = new StringBuilder();

        try{
            File inFile = new File(pathToResrc + inFileName);
            Scanner inScan = new Scanner(inFile);

            while(inScan.hasNextLine()){
                strBld.append(inScan.nextLine());
                strBld.append("\n");
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
