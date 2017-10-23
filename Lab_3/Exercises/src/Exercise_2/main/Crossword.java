import java.io.Console;
import java.util.LinkedList;

public class Crossword{
    public static void main(String[] argv){
        InteliCwDB crosswordPuzzle = new InteliCwDB("src/Exercise_2/resources/Crossword.txt");

        LinkedList<Entry> wordsThatMatches = new LinkedList<>();
        wordsThatMatches = crosswordPuzzle.fileAll("ata");
        for (Entry word:wordsThatMatches){
            System.out.println(word.getWord());
            //System.out.println(word.getClue());
        }

        System.out.println("\n" + crosswordPuzzle.getRandom().getWord());
        System.out.println("\n" + crosswordPuzzle.getRandom(5).getWord());
        System.out.println("\n" + crosswordPuzzle.getRandom("ata").getWord());
    }
}
