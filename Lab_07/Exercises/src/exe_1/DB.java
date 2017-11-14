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

    public void listNames(){
        try{
            connect();
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

    public void createTable(){
        stmt = conn.createStatement();
        stmt.executeUpdate(
                "CREATE TABLE tablea1(" + "priKey"
        )
    }
}
