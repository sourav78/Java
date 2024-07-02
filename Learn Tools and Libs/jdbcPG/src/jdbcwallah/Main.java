package jdbcwallah;


public class Main {
    public static void main(String[] args) {

        Student st = new Student();

        //Already execute with the database
//        st.createDatabase();
//        st.createTable();

        //CRUD

        //Create Data -> Insert
//        st.createData(103, "Pravat", "pravat@gmail.com");

        //Read Data -> Select
//        st.readData();

        //Update data -> Update
//        st.updateData("Prabhat", 103);

        //Delete Data -> Delete
        st.deleteData(103);
    }
}
