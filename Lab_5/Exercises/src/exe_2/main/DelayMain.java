package exe_2.main;

public class DelayMain {
    public static void main(String[] argv){
        DelaySubtitles delayMach = new DelaySubtitles();
        delayMach.delay("gravity.txt", "delayedGravity.txt",
                10, 24);
    }
}
