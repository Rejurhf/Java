package exe_1;

public class DBApp{
    public static void main(String[] argv){
        DB data = new DB();
        data.connect();
        data.listNames();
    }
}
