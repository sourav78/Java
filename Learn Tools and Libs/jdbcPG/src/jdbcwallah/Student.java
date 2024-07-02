package jdbcwallah;

import java.sql.*;

public class Student {

    private final String url = "jdbc:postgresql://localhost:5432/";
    private final String db = "student";
    private final String username = "postgres";
    private final String password = "7848";

    public void createDatabase(){

        //SQL query
        String query = "create database "+db;

        //Establish connection
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();
            boolean res = st.execute(query);

            System.out.println(res);
            System.out.println("Database created successfully.");
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createTable(){
        //SQL query
        String query = "create table student (sid int, name varchar (200), email varchar (50))";

        //Establish connection
        try {
            Connection con = DriverManager.getConnection(url+db, username, password);
            Statement st = con.createStatement();
            boolean res = st.execute(query);

            System.out.println(res);
            System.out.println("Table created successfully.");
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createData(int id, String name, String email) {
        //SQL query
//        String query = "insert into student values ("+id+", '"+name+"', '"+email+"')";

        //SQL query with prepare statement
        String query = "insert into student (sid, name, email) values (?, ?, ?)";

        //Establish connection
        try {
            Connection con = DriverManager.getConnection(url+db, username, password);

            //Normal statement
//            Statement st = con.createStatement();
//            st.execute(query);

            //Prepare Statement
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setString(3, email);

            pst.execute();
            System.out.println("Student Data inserted successfully.");
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void readData() {
        //SQL query
        String query = "select * from student";

        //Establish connection
        try {
            Connection con = DriverManager.getConnection(url+db, username, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()){
                System.out.println("id : "+rs.getInt(1));
                System.out.println("name : "+rs.getString(2));
                System.out.println("email : "+rs.getString(3));
                System.out.println();
            }

            System.out.println("Read Data from table");
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateData(String name, int id) {
        //SQL query
        String query = "update student set name = ? where sid = ?";

        try {
            Connection con = DriverManager.getConnection(url+db, username, password);
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, name);
            pst.setInt(2, id);

            pst.execute();

            System.out.println("Update the student data successfully");
            con.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteData(int id){
        //SQL query
        String query = "delete from student where sid = ?";

        try {
            Connection con = DriverManager.getConnection(url+db, username, password);
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, id);

            pst.execute();

            System.out.println("Delete the student data successfully");
            con.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
