package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetDemo {
    public static final String LOAD_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/test";
    public static final String PASSWORD = "";
    public static final String USERNAME = "root";
    public static void main(String[] args) {
        try {
            //Making connection
            Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            //Create statement
            Statement st = conn.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE
            );

            //Getting data from db
            String query = "SELECT * FROM student";
            ResultSet rs = st.executeQuery(query);

            rs.last();
            //Here we can update db using result set
            /*
	            It change the where the cursor is pointing.
	            It gives error if DB has no primary key
            */

            rs.updateString("name", "Shankar");
            rs.updateString("Course", "BBA");
            rs.updateRow();

            //Here we can insert a new Row using ResultSet
            rs.moveToInsertRow();
            rs.updateString("name", "Kalia");
            rs.updateString("course", "B.Com");
            rs.insertRow();

            rs.last();

            System.out.print(rs.getInt("Id")+" ");
            System.out.print(rs.getString("Name")+" ");
            System.out.println(rs.getString("Course"));

            //Close the connection
            rs.close();
            st.close();
            conn.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
