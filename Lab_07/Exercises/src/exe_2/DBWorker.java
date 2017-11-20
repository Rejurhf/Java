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

    public void insertEmploye(String wrkPesel, double wrkWage, String wrkPositon){
        try{
            stmt = conn.createStatement();
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS workers (" +
                    "pesel CHAR(11) NOT NULL," +
                    "wage DOUBLE NOT NULL," +
                    "position VARCHAR(64) NOT NULL," +
                    "PRIMARY KEY (pesel))");

            stmt.executeUpdate("INSERT INTO workers VALUES (" +
                    "'"+wrkPesel+"','"+wrkWage+"','"+wrkPositon+"')");
        }catch (SQLException e){
            System.out.println("SQLExeption: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void delEmploye(String pesel){
        try{
            stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM workers WHERE pesel = '"+pesel+"'");
            System.out.println("Employe whit pesel: " + " was deleted.\n");
            System.out.println();
        }catch (SQLException e){
            System.out.println("SQLExeption: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }finally {
            if (rsltSet != null){
                try{
                    rsltSet.close();
                }catch (SQLException e){ }
            }
            stmt = null;
        }
    }

    public void showAll(){
        try{
            stmt = conn.createStatement();
            rsltSet = stmt.executeQuery("SELECT * FROM workers");

            while (rsltSet.next()){
                String pesel = rsltSet.getString(1);
                double wage = rsltSet.getDouble(2);
                String position = rsltSet.getString(3);

                System.out.println(pesel + " | " + wage + "   |   " + position);
            }
            System.out.println();
        }catch (SQLException e){
            System.out.println("SQLExeption: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }finally {
            if (rsltSet != null){
                try{
                    rsltSet.close();
                }catch (SQLException e){ }
            }
            stmt = null;
        }
    }
}
