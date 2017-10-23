import en.Enum.*;

public class CwEntry extends Entry{
    private int x;
    private int y;
    private Direction d;


    public CwEntry(String _word, String _clue, int x, int y){
        super(_word, _clue);
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public Direction getDir(){
        return this.d;
    }
}
