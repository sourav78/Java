package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    public static Connection connectDB() throws SQLException {
        //Here i connect prstgres DB
        Connection con  = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/test",
                "postgres",
                "7848"
        );

        return con;
    }
}
