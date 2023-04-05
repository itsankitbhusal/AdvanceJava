import java.sql.*;

public class InsertingDataInDb {
    public static void main(String[] args) {

        String jdbcDriver = "com.mysql.cj.jdbc.Driver";
        String dbUrl = "jdbc:mysql://localhost:3306/java";
        String user = "root";
        String password = "ankitbhusal20";

        try {
            Class.forName(jdbcDriver);
            Connection conn = DriverManager.getConnection(dbUrl, user, password);
            Statement st = conn.createStatement();

            st.executeUpdate("INSERT INTO users(name, address) VALUES('Ankit','Kawasoti' )");
            System.out.println("Inserted into database!!");

            st.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("Error occur: " + e);
        }
    }
}
