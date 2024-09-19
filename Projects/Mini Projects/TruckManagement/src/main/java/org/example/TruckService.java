package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TruckService {
    public void addTruck(Truck truck){
        String insertTruckQuery = "INSERT INTO truck (name, model, capacity, driver_name) VALUES (?, ?, ?, ?)";

        try {
            Connection con = ConnectionDB.connectDB();

            PreparedStatement ps = con.prepareStatement(insertTruckQuery);
            ps.setString(1, truck.getName());
            ps.setString(2, truck.getModel());
            ps.setInt(3, truck.getCapacity());
            ps.setString(4, truck.getDriverName());

            int rowUpdated = ps.executeUpdate();

            System.out.println("Add "+rowUpdated+" Truck!!!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Truck getTruckById(int id){
        String getTruckQuery = "SELECT * FROM truck WHERE id = ?";
        Truck truck = new Truck();
        try {
            Connection con = ConnectionDB.connectDB();

            PreparedStatement ps = con.prepareStatement(getTruckQuery);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                truck.setId(rs.getInt(1));
                truck.setName(rs.getString(2));
                truck.setModel(rs.getString(3));
                truck.setCapacity(rs.getInt(4));
                truck.setDriverName(rs.getString(5));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return truck;
    }

    public void updateTruck(Truck truck){
        String updateTruckQuery = "UPDATE truck SET name = ?, model = ?, capacity = ?, driver_name = ? WHERE id = ?";

        try {
            Connection con = ConnectionDB.connectDB();

            PreparedStatement ps = con.prepareStatement(updateTruckQuery);
            ps.setString(1, truck.getName());
            ps.setString(2, truck.getModel());
            ps.setInt(3, truck.getCapacity());
            ps.setString(4, truck.getDriverName());
            ps.setInt(5, truck.getId());

            int rowUpdated = ps.executeUpdate();

            System.out.println(truck.getName()+" truck Updated");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public List<Truck> getAllTrucks(){
        String getAllTruckQuery = "SELECT * FROM truck";
        List<Truck> trucks = new ArrayList<>();

        try {
            Connection con = ConnectionDB.connectDB();

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(getAllTruckQuery);

            while(rs.next()){
                Truck truck = new Truck();

                truck.setId(rs.getInt(1));
                truck.setName(rs.getString(2));
                truck.setModel(rs.getString(3));
                truck.setCapacity(rs.getInt(4));
                truck.setDriverName(rs.getString(5));

                trucks.add(truck);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return trucks;
    }

    public void deleteTruck(int id){
        String deleteTruckQuery = "DELETE FROM truck where id = ?";

        try{
            Connection con = ConnectionDB.connectDB();
            PreparedStatement ps = con.prepareStatement(deleteTruckQuery);
            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Truck is deleted.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
