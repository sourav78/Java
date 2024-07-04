package EmployeeCrud;

import EmployeeCrud.DB.ConnectDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DAO {
    public static void createEmployee(Employee employee){
        try{
            Connection con = ConnectDB.dbConnect();
            String query = SQLQueries.insert;

            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, employee.getId());
            pst.setString(2, employee.getName());
            pst.setString(3, employee.getEmail());
            pst.setInt(4, employee.getSalary());

            pst.executeUpdate();
            con.close();
            System.out.println("\n\nEmployee record is created.\n\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateEmployee(Employee employee){
        try{
            Connection con = ConnectDB.dbConnect();
            String query = SQLQueries.update;

            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, employee.getName());
            pst.setString(2, employee.getEmail());
            pst.setInt(3, employee.getSalary());
            pst.setString(4, employee.getId());

            pst.executeUpdate();
            con.close();
            System.out.println("\n\nEmployee record is updated.\n\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Employee> readEmployee(){
        ArrayList<Employee> employees = new ArrayList<>();

        try{
            Connection con = ConnectDB.dbConnect();
            String query = SQLQueries.read;

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()){
                Employee emp = new Employee(rs.getString(1), rs.getString(2), rs.getString(4), rs.getInt(3));
                employees.add(emp);
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return employees;
    }

    public static void deleteEmployee(String id){
        try{
            Connection con = ConnectDB.dbConnect();
            String query = SQLQueries.delete;

            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, id);

            pst.executeUpdate();
            con.close();
            System.out.println("\n\nEmployee record is deleted.\n\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Employee singleEmployeeRecord(String id){
        Employee emp = null;
        try{
            Connection con = ConnectDB.dbConnect();
            String query = SQLQueries.readSingle;

            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, id);

            ResultSet rs = pst.executeQuery();

            while (rs.next()){
                emp = new Employee(rs.getString(1), rs.getString(2), rs.getString(4), rs.getInt(3));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return emp;
    }
}
