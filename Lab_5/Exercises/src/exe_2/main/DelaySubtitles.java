package exe_2.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class DelaySubtitles{
    private static final String pathToRes = "src/exe_2/resources/";

    public void delay(final String in, final String out, int delay, int fps){
        LinkedList<String> subs = this.getSubs(in);

        for(String line:subs){
            //String delayedFrames = this.getDelayedFrames(line);
            //String sentence = this.getSentence(line);
            //jakis sposób żeby zastąpić obiekt w LinkedList nowym, czy zmiana
            //line wystarczy czy trzeba zdobywac indeksy
        }

        this.saveDelayedSubs(out, subs);
    }

    private LinkedList<String> getSubs(final String in){
        LinkedList<String> subs = new LinkedList<>();

        try{
            File inFile = new File(pathToRes + in);
            Scanner inScanner = new Scanner(inFile);

            while(inScanner.hasNextLine())
                subs.add(inScanner.nextLine());
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        return subs;
    }

    private void saveDelayedSubs(String out, LinkedList<String> subs){
        try{
            File outFile = new File(pathToRes + out);
            FileWriter fileWriter = new FileWriter(outFile);

            for (String line:subs){
                fileWriter.write(line);
                fileWriter.write("\r\n");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
