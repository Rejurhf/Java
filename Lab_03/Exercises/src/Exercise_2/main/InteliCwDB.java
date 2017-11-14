import java.util.LinkedList;
import java.util.Random;
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
            if(macher.find())
                wordsSameAsPattern.add(word);
        }

        return wordsSameAsPattern;
    }

    public Entry getRandom(){
        int sizeOfDict = dict.size();
        Random rand = new Random();
        int randNumInRange = rand.nextInt(sizeOfDict);
        return dict.get(randNumInRange);
    }

    public Entry getRandom(int length){
        LinkedList<Entry> wordsWithSameLength = new LinkedList<>();
        for (Entry word:dict){
            if(word.getWord().length() == length)
                wordsWithSameLength.add(word);
        }

        int sizeOfList = wordsWithSameLength.size();
        Random rand = new Random();
        int randNumInRange = rand.nextInt(sizeOfList);
        return wordsWithSameLength.get(randNumInRange);
    }

    public Entry getRandom(String pattern){
        LinkedList<Entry> wordsThatMatchesPattern = this.fileAll(pattern);
        int sizeOfList = wordsThatMatchesPattern.size();
        Random rand = new Random();
        int randNumInRange = rand.nextInt(sizeOfList);
        return wordsThatMatchesPattern.get(randNumInRange);
    }
/*
    public void add(String word, String clue){

    }*/
}
