package exe_4.main;

public class Polibiusz implements Algorithm{
    private static final char[] caseTab = {'a','b','c','d','e',
                                           'f','g','h','i','k',
                                           'l','m','n','o','p',
                                           'q','r','s','t','u',
                                           'v','w','x','y','z'};

    public String crypt(String wordToCrp){
        wordToCrp = wordToCrp.toLowerCase();
        StringBuilder crpWord = new StringBuilder();

        for(int i = 0; i < wordToCrp.length(); i++){
            char ch = wordToCrp.charAt(i);
            int pos = 0;
            if(ch >= 'a' && ch <= 'z'){
                if(ch == 'j') pos = 24;
                else{
                    int j = 0;
                    while(ch != caseTab[j]) ++j;
                    pos = ((j / 5 + 1) * 10) + (j % 5 + 1); //8 -> 23, 7/5+1=2 7%5+1=3
                }
            }
            crpWord.append(pos);
        }

        return crpWord.toString();
    }

    public String decrypt(String wordToDecrp){
        String number;
        StringBuilder decrpWord = new StringBuilder();
        int rowNum = 0, colNum = 0;

        for(int i = 0; i < wordToDecrp.length()/2; i++){ //"123451" those are i=2 letters -> i=len/2
            number = wordToDecrp.substring(i*2,(i*2)+2); //"123451" cycle every 2 characters
            rowNum = Integer.parseInt(number) / 10 - 1; //23 -> 7(2nd row), 23/10-1=1
            colNum = Integer.parseInt(number) % 10 - 1; //23 -> 7(3rd col), 23%10-1=2
            decrpWord.append(caseTab[(rowNum * 5) + colNum]); //*5 to go to next row
        }

        return decrpWord.toString();
    }
}
