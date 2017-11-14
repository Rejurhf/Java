import en.Enum.*;

import java.util.LinkedList;

public class Board {
    private int width;
    private int heigth;
    private BoardCell[][] board;

    public int getWidth(){
        return this.width;
    }

    public int getHeigth(){
        return this.heigth;
    }

    public BoardCell getCell(int x, int y) {
        return this.board[x][y];
    }

    public void setCell(int x, int y, BoardCell c){
        this.board[x][y] = c;
    }

    public LinkedList<BoardCell> getStartCells(){
        LinkedList<BoardCell> startCells = new LinkedList<>();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < heigth; j++) {
                if(this.board[width][heigth].equals(Place.START))
                    startCells.add(this.board[width][heigth]);
            }
        }

        return startCells;
    }
}
