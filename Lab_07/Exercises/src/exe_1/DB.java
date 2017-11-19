package exe_1;

import java.sql.*;

public class DB{
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    public void connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://mysql.agh.edu.pl/mziomek",
                    "mziomek", "Z51LxKuE4ePnqyUM");
        }catch (SQLException e){
            System.out.println("SQLExeption: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }catch (Exception e){ e.printStackTrace(); }
    }

    public void disconnect(){
        if(conn != null){
            try {
                conn.close();
            }catch (SQLException e){ }
        }
        stmt = null;
        rs = null;
    }

    public void listTitles(){
        try{
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM books");

            while (rs.next()){
                String name = rs.getString(2);
                System.out.println("Tytuł: " + name);
            }
        }catch (SQLException e){
            System.out.println("SQLExeption: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }finally {
            if (rs != null){
                try{
                    rs.close();
                }catch (SQLException e){ }
            }
            stmt = null;
        }
    }

    public void showAll(){
        try{
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM books");

            while (rs.next()){
                String isbn = rs.getString(1);
                String title = rs.getString(2);
                String author = rs.getString(3);
                String year = rs.getString(4);
                int addSpace = 31 - title.length();
                System.out.println(isbn + " | " + title + "   |   " + author + "  |  " + year);
            }
            System.out.println();
        }catch (SQLException e){
            System.out.println("SQLExeption: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }finally {
            if (rs != null){
                try{
                    rs.close();
                }catch (SQLException e){ }
            }
            stmt = null;
        }
    }

    public void findByIsbn(String toFind, int index){
        try{
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM books");
            boolean flag = false;

            while (rs.next()){
                //System.out.println(rs.getString(index));
                if(toFind.equals(rs.getString(index))){
                    flag = true;
                    System.out.println(rs.getString(1) + " " + rs.getString(2) +
                            " " + rs.getString(3) + " " + rs.getString(4));
                }
            }
            if(!flag && index == 1)
                System.out.println("There is no such isbn (" + toFind + ").");
            else if (!flag && index == 3)
                System.out.println("There is no such author (" + toFind + ").");
        }catch (SQLException e){
            System.out.println("SQLExeption: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }finally {
            if (rs != null){
                try{
                    rs.close();
                }catch (SQLException e){ }
            }
            stmt = null;
        }
    }

    public void addBook(String newIsbn, String newTitle, String newAuthor, int newYear){
        try{
            stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO books(isbn, title, author, year) " +
                    "VALUE ('"+newIsbn+"','"+newTitle+"','"+newAuthor+"','"+newYear+"')");
        }catch (SQLException e){
            System.out.println("SQLExeption: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }finally {
            if (rs != null){
                try{
                    rs.close();
                }catch (SQLException e){ }
            }
            stmt = null;
        }
    }

    public void delBook(String itemToDel, int index){
        try{
            stmt = conn.createStatement();
            if(index == 1){
                stmt.executeUpdate("DELETE FROM books WHERE isbn = '"+itemToDel+"'");
                System.out.println("Book with isbn: " + itemToDel + " deleted.\n");
            }else if (index == 2){
                stmt.executeUpdate("DELETE FROM books WHERE author = '"+itemToDel+"'");
                System.out.println(itemToDel + " deleted.\n");
            }
        }catch (SQLException e){
            System.out.println("SQLExeption: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }finally {
            if (rs != null){
                try{
                    rs.close();
                }catch (SQLException e){ }
            }
            stmt = null;
        }
    }
}