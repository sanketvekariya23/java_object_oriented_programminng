import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
    public static void main(String[] args) {
        try {
            // load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // make connections
            String url = "jdbc:mysql://localhost:3306/sanket_database";
            String username = "root";
            String passworg = "Sanket@2307";
            Connection con = DriverManager.getConnection(url, username, passworg);

            if (con.isClosed()) {
                System.out.println("conncetion closed");
            } else {
                System.out.println("conncetion created...");
            }

            // create query

            String q = "select* from customer";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(q);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name1");
                System.out.println(id);
                System.out.println(name);
            }

            // close connection
            con.close();
            stmt.close();
            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}