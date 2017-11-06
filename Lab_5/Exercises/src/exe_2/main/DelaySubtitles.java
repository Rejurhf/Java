package exe_2.main;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class DelaySubtitles{
    private static final String pathToRes = "src/exe_2/resources/";

    public void delay(final String in, final String out, int delay, int fps){
        LinkedList<String> subs = this.getSubs(in);
        int i = 0;

        for(String line:subs){
            String delayedFrames = this.getDelayedFrames(line);
            String sentence = this.getSentence(line);

            subs.set(i, delayedFrames + sentence);
            ++i;
        }

        this.saveDelayedSubs(out, subs);
    }

    private String getDelayedFrames(String line) {
        String newFrames;
        int startFrame, endFrame;
        int firstBracket = line.indexOf('}');
        int secondBracket = line.substring(firstBracket + 1).indexOf("}") + firstBracket + 1;

        startFrame = Integer.parseInt(line.substring(1, firstBracket));
        endFrame = Integer.parseInt(line.substring(firstBracket + 2, secondBracket));

        newFrames = "{" + Integer.toString(startFrame) + "}{" + Integer.toString(endFrame) + "}";

        return newFrames;
    }

    private String getSentence(String line){
        boolean flag = true;
        int i = 1;

        while(flag || line.charAt(i) == '}') {
            if (line.charAt(i) == '}')
                flag = false;
            ++i;
        }

        return line.substring(line.lastIndexOf('}') + 1);
    }

    private LinkedList<String> getSubs(final String in){
        LinkedList<String> subs = new LinkedList<>();
        String line;
        FileReader inFile = null;

        try{
            inFile = new FileReader(pathToRes + in);
        }catch (FileNotFoundException e){
            System.out.println("Can not find the file");
            e.printStackTrace();
        }

        BufferedReader reader = new BufferedReader(inFile);

        try{
            while((line = reader.readLine()) != null){
                subs.add(line);
            }

            System.out.println("File " + in + " has been read.");
        }catch (IOException e){
            System.out.println("Fail to read file");
            e.printStackTrace();
        }finally {
            try{
                inFile.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        return subs;
    }

    private void saveDelayedSubs(String out, LinkedList<String> subs){
        FileWriter fileWriter = null;

        try{
            fileWriter = new FileWriter(pathToRes + out);

            for (String line:subs) {
                fileWriter.write(line);
                fileWriter.write("\r\n");
            }
            fileWriter.write("Done by Rejurhf");

            System.out.println("Subs have been saved to " + out);
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            try{
                fileWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }

        }
    }
}
