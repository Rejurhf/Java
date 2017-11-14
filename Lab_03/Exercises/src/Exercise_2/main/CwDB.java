import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class CwDB {
    protected LinkedList<Entry> dict = new LinkedList<>();

    public CwDB(String filename){
        this.createDB(filename);
    }

    protected void createDB(String filename){
        try{
            File fileWithWords = new File(filename);
            Scanner in = new Scanner(fileWithWords);

            String word, clue;
            while (in.hasNextLine()){
                word = in.nextLine();
                clue = in.nextLine();
                this.add(word, clue);
            }
            System.out.println("Plik został wczytany");
        }catch (FileNotFoundException e){e.printStackTrace();}
    }

    public void add(String word, String clue){
        Entry entryObject = new Entry(word, clue);
        dict.add(entryObject);
    }
/*
    public Entry get(String word){

    }

    public void remove(String word){

    }

    public void saveDB(String filename){

    }

    public int getSize(){

    }*/
}
