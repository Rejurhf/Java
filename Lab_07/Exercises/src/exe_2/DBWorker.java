package exe_2;

import java.sql.*;

public class DBWorker {
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rsltSet = null;

    public void connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://mysql.agh.edu.pl/mziomek",
                    "mziomek", "Z51LxKuE4ePnqyUM");

            stmt = conn.createStatement();
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS workers (" +
                    "pesel CHAR(11) NOT NULL," +
                    "wage DOUBLE NOT NULL," +
                    "position VARCHAR(64) NOT NULL," +
                    "PRIMARY KEY (pesel))");
        }catch (SQLException e){
            System.out.println("SQL Exeption: " + e.getMessage());
            System.out.println("SQL State: " + e.getSQLState());
            System.out.println("Vendor Error: " + e.getErrorCode());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void disconnect(){
        if(conn != null){
            try {
                conn.close();
            }catch (SQLException e){ }
        }
        stmt = null;
        rsltSet = null;
    }
}
