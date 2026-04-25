import java.sql.*;

public class BankManager {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","1234");
        Statement st = con.createStatement();

        st.executeUpdate("CREATE TABLE IF NOT EXISTS accounts(accNo INT, name VARCHAR(50), balance DOUBLE)");

        st.executeUpdate("INSERT INTO accounts VALUES (1,'Ravi',15000)");

        ResultSet rs = st.executeQuery("SELECT * FROM accounts WHERE balance>10000");
        while(rs.next())
            System.out.println(rs.getString(2));

        st.executeUpdate("UPDATE accounts SET balance=balance+5000 WHERE accNo=1");

        st.executeUpdate("DELETE FROM accounts WHERE accNo=1");

        con.close();
    }
}