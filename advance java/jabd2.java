import java.sql.*;

public class jabd2 {
    public static void main(String[] args) {
        try{
            // load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // create connection
            String url = "jdbc:mysql://localhost:3306/sanket_database";
            String username = "root";
            String password = "Sanket@2307";
           Connection con= DriverManager.getConnection(url,username,password);

           if(con.isClosed()){
            System.out.println("connection closed");
           }
           else{
            System.out.println("connected...");
           }

           // create query & statement 
            String q = "create table table1(Tid integer(20) primary key auto_increment, Tname varchar(200) not null , Tcity varchar(100) )";
            Statement stmt = con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("table created successfully...");

            con.close();
            stmt.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
