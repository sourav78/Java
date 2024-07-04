package EmployeeCrud.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    public static Connection con = null;
    public static Connection dbConnect(){
        try {
            String URL = "jdbc:postgresql://localhost:5432/employee";
            String username = "postgres";
            String password = "7848";
            con = DriverManager.getConnection(URL, username, password);
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}
