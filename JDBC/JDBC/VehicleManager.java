import java.sql.*;

public class VehicleManager {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","1234");
        Statement st = con.createStatement();

        st.executeUpdate("CREATE TABLE IF NOT EXISTS vehicles(regNo VARCHAR(20), owner VARCHAR(50), status VARCHAR(20))");

        st.executeUpdate("INSERT INTO vehicles VALUES ('UP15AB1234','Amit','Pending')");

        ResultSet rs = st.executeQuery("SELECT * FROM vehicles WHERE status='Pending'");
        while(rs.next())
            System.out.println(rs.getString(2));

        st.executeUpdate("UPDATE vehicles SET status='Completed' WHERE regNo='UP15AB1234'");

        st.executeUpdate("DELETE FROM vehicles WHERE regNo='UP15AB1234'");

        con.close();
    }
}