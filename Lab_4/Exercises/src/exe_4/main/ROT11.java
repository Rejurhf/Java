package exe_4.main;

public class ROT11 implements Algorithm{
    private static final int move = 11;       //a-z i A-Z te znaki są szyfrowane
    private static final int albhbtLen = 26;

    public String crypt(String wordToCrp){
        StringBuilder crpWord = new StringBuilder();

        for(int i = 0; i < wordToCrp.length(); i++) {
            char ch = wordToCrp.charAt(i);
            if(ch >= 'a' && ch <= 'o') ch += move;
                else if(ch >= 'A' && ch <= 'O') ch += move;
                else if(ch >= 'p' && ch <= 'z') ch -= albhbtLen - move;
                else if(ch >= 'P' && ch <= 'Z') ch -= albhbtLen - move;
            crpWord.append(ch);
        }
        return crpWord.toString();
    }

    public String decrypt(String wordToDecrp){
        StringBuilder decrpWord = new StringBuilder();
        for(int i = 0; i < wordToDecrp.length(); i++){
            char ch = wordToDecrp.charAt(i);
            if(ch >= 'a' && ch < 'k') ch += albhbtLen - move;
                else if(ch >= 'A' && ch <= 'K') ch += albhbtLen - move;
                else if(ch >= 'l' && ch < 'z') ch -= move;
                else if(ch >= 'L' && ch <= 'Z') ch -= move;
            decrpWord.append(ch);
        }
        return decrpWord.toString();
    }
}
