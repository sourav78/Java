package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PrepareStatementDemo {
    public static void main(String[] args) {

        try {

            //Load driver
//            Class.forName("com.postgres.cj.jdbc.Driver");

            //Here i connect prstgres DB
            Connection con  = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/student",
                    "postgres",
                    "7848"
            );

            String selectQuery = "SELECT * FROM student WHERE sid = ?";
            PreparedStatement ps = con.prepareStatement(selectQuery);
            ps.setInt(1, 102);

            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                System.out.println("Id" + rs.getInt(1));
                System.out.println("Name" + rs.getString(2));
                System.out.println("Email" + rs.getString(3));
            }

            ps.close();
            //Insert Query
            String insertQuery = "INSERT INTO student (sid, name, email) VALUES (?, ?, ?)";
            PreparedStatement psi = con.prepareStatement(insertQuery);
            psi.setInt(1, 103);
            psi.setString(2, "New One");
            psi.setString(3, "newOne@gmail.xom");

            int i = psi.executeUpdate();
            System.out.println("Update"+ i);
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
