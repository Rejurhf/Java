package exe_4.main;

public class ROT11 implements Algorithm{
    private static int move = 11;                               //a-z i A-Z te znaki są szyfrowane

    public String crypt(String wordToCrypt){

        return wordToCrypt;
    }

    public String decrypt(String wordToDecrypt){
        return wordToDecrypt;
    }

    public static String replaceCharAt(String s, int pos, char c) {
        return s.substring(0, pos) + c + s.substring(pos + 1);
    }
}
