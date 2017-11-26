import java.util.LinkedList;

public class CrosswordMain {
    public static void main(String[] argv){
        String pathToResrc = "src/Exercise_2/resources/";
        InteliCwDB crosswordPuzzle = new InteliCwDB(pathToResrc + "Crossword.txt");

        LinkedList<Entry> wordsThatMatches = new LinkedList<>();
        wordsThatMatches = crosswordPuzzle.fileAll("ata");
        System.out.println(">: Słowa pasujące do wzorca \"ata\":");
        for (Entry word:wordsThatMatches){
            System.out.println(word.getWord());
            //System.out.println(word.getClue());
        }

        System.out.println(">: Losowe słowo:\n" + crosswordPuzzle.getRandom().getWord());
        System.out.println(">: Losowe słowo o długości 5:\n" +
                crosswordPuzzle.getRandom(5).getWord());
        System.out.println(">: Losowe słowo pasujące do wzorca \"ata\"\n" +
                crosswordPuzzle.getRandom("ata").getWord());
    }
}
