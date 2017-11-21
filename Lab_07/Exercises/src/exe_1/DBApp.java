package exe_1;

public class DBApp{
    public static void main(String[] argv){
        DB data = new DB();
        data.connect();

        //data.listTitles();
        //data.showAll();
        //data.findByIsbn("Fiodor Dostojewski", 3);
        data.showAll();
        data.addBook("1234567899987", "Miecz Przeznaczenia",
         "Andrzej Sapkowski", 1994);
        data.showAll();

        data.delBook("Andrzej Sapkowski", 2);
        data.showAll();
        data.disconnect();
    }
}
