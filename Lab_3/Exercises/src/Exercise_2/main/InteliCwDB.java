import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InteliCwDB extends CwDB{
    public InteliCwDB(String filename){
        super(filename);
    }

    public LinkedList<Entry> fileAll(String pattern){
        LinkedList<Entry> wordsSameAsPattern = new LinkedList<>();
        Pattern wordToFind = Pattern.compile(pattern);
        Matcher macher;
        for(Entry word:dict){
            macher = wordToFind.matcher(word.getWord());
            if(macher.find()){
                wordsSameAsPattern.add(word);
            }
        }

        return wordsSameAsPattern;
    }
/*
    public Entry getRandom(){

    }

    public Entry getRandom(int length){

    }

    public Entry getRandom(String pattern){

    }

    public void add(String word, String clue){

    }*/
}
