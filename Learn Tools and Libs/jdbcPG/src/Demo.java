import java.sql.*;

public class Demo {
    public static void main(String[] args) throws Exception {

        String query = "select * from emp_info";

        String url = "jdbc:postgresql://localhost:5432/employee";
        String username = "postgres";
        String password = "7848";

        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()){
            for (int i = 1; i < 5; i++) {
                System.out.print(rs.getString(i)+"\t");
            }
            System.out.println();
        }

//        // Get metadata to retrieve column information
//        ResultSetMetaData rsmd = rs.getMetaData();
//        int columnCount = rsmd.getColumnCount();
//
//        // Print column names
//        for (int i = 1; i <= columnCount; i++) {
//            System.out.print(rsmd.getColumnName(i) + "\t");
//        }
//        System.out.println();
//
//        // Iterate through the result set and print the data
//        while (rs.next()) {
//            for (int i = 1; i <= columnCount; i++) {
//                System.out.print(rs.getString(i) + "\t");
//            }
//            System.out.println();
//        }
//
//        // Close resources
//        rs.close();
//        st.close();
//        con.close();
    }
}
