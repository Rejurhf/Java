package exe_4.main;

import java.io.File;

public class CodeMaker{
    public static void main(String[] argv){
        Cryptographer crp = new Cryptographer();
        Algorithm rot11 = new ROT11();
        Algorithm polibiusz = new Polibiusz();
        crp.cryptFile("fileToCrypt.txt", "fileToSaveCrypt.txt",rot11);
        //File fileToDecrypt = new File("fileToDecrypt.txt");
        //File fileToSaveDecrypt = new File("fileToSaveDecrypt.txt");


    }
}
