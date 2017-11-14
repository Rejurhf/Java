import java.util.LinkedList;

public class Crossword{
    private LinkedList<CwEntry> entries;
    private Board board;
    private InteliCwDB cwDB;
    private final long ID = -1;

    public Iterable<CwEntry> getROEntryIter(){
        return null;
    }

    public Board getBoardCopy() {
        return board;
    }

    public InteliCwDB getCwDB() {
        return cwDB;
    }

    public void setCwDB(InteliCwDB inteliCwDB){
        this.cwDB = inteliCwDB;
    }

    public boolean contains(String word){
        return false;
    }

    public final void addCwEntry(CwEntry cwEntry, Strategy strat){
        entries.add(cwEntry);
        strat.updateBoard(board, cwEntry);
    }

    public final void generate(Strategy strat){
        CwEntry ent = null;
        while ((ent = strat.findEntry(this)) != null){
            addCwEntry(ent, strat);
        }
    }
}
