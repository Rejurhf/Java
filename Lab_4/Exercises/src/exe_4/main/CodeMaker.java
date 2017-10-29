package exe_4.main;

public class CodeMaker{
    public static void main(String[] argv){
        Cryptographer crp = new Cryptographer();
        Algorithm rot11 = new ROT11();
        Algorithm polibiusz = new Polibiusz();
        crp.cryptFile("fileToCryptROT11.txt", "fileToSaveCryptROT11.txt",rot11);
        crp.cryptFile("fileToCryptPolibiusz.txt", "fileToSaveCryptPolibiusz.txt",polibiusz);
        crp.decryptFile("fileToSaveCryptROT11.txt", "fileToSaveDecryptROT11.txt",rot11);
        crp.decryptFile("fileToSaveCryptPolibiusz.txt", "fileToSaveDecryptPolibiusz.txt",polibiusz);
    }
}
