package exe_4.main;

public class ROT11 implements Algorithm{
    private static int move = 11;                               //a-z i A-Z te znaki są szyfrowane

    public String crypt(String wordToCrp){
        String crpWord = "";
        int rot11 = 11, albhbtLen = 26;
        for(int i = 0; i < wordToCrp.length(); i++) {
            char ch = wordToCrp.charAt(i);
            if(ch >= 'a' && ch <= 'o') ch += rot11;
                else if(ch >= 'A' && ch <= 'O') ch += rot11;
                else if(ch >= 'p' && ch <= 'z') ch -= albhbtLen - rot11;
                else if(ch >= 'P' && ch <= 'Z') ch -= albhbtLen - rot11;
            crpWord += ch;
        }
        return crpWord;
    }

    public String decrypt(String wordToDecrp){
        String decrpWord = "";
        int rot11 = 11, albhbtLen = 26;
        for(int i = 0; i < wordToDecrp.length(); i++){
            char ch = wordToDecrp.charAt(i);
            if(ch >= 'a' && ch < 'k') ch += albhbtLen - rot11;
                else if(ch >= 'A' && ch <= 'K') ch += albhbtLen - rot11;
                else if(ch >= 'l' && ch < 'z') ch -= rot11;
                else if(ch >= 'L' && ch <= 'Z') ch -= rot11;
            decrpWord += ch;
        }
        return decrpWord;
    }
}
