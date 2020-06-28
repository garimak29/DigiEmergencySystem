/*
 * Use of singleton pattern 
 * for calling connection use:
 * Connection con = Database.getInstance().getConnection();
 * */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {

    private static Database dbIsntance;
    private static Connection con ;
    private static Statement stmt;


    private Database() {
      // private constructor //
    }

    public static Database getInstance(){
    if(dbIsntance==null){
        dbIsntance= new Database();
    }
    return dbIsntance;
    }

    public  Connection getConnection() throws SQLException{

        if(con==null || con.isClosed()){ // this condition will make sure to initialize db params even if the dbconnection is closed in case multiple people are using same dbconnection.
            try {
                String host = "jdbc:derby://localhost:1527/yourdatabasename";
                String username = "yourusername";
                String password = "yourpassword";
                con = DriverManager.getConnection( host, username, password );
            } catch (SQLException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return con;
    }
}