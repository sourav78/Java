package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FirstProject {

    public static final String LOAD_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/test";
    public static final String PASSWORD = "";
    public static final String USERNAME = "root";

    public static void main(String[] args) {
        try {

            //Load class
//            Class.forName(LOAD_DRIVER);

            //Making connection
            Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            //Create statement
            Statement st = conn.createStatement();

            //Getting data from db
            String query = "SELECT * FROM student";
            ResultSet rs = st.executeQuery(query);

            while (rs.next()){
                System.out.print(rs.getInt("Id")+" ");
                System.out.print(rs.getString("Name")+" ");
                System.out.println(rs.getString("Course"));
            }

            //Close the connection
            rs.close();
            st.close();
            conn.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
