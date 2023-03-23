import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class JdbcDemo {
    public static void main(String[] args) {
        // JDBC driver name and database URL
        String jdbcDriver = "com.mysql.cj.jdbc.Driver";
        // cj is optional here
        String dbUrl = "jdbc:mysql://localhost:3306/java";

        // Database credentials
        String user = "root";
        String password = System.getenv("DB_PASSWORD");

        try {
            // Register JDBC driver
            Class.forName(jdbcDriver);

            // Open a connection
            Connection conn = DriverManager.getConnection(dbUrl, user, password);

            // Execute a query
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            // Process the result set
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String address = rs.getString("address");
                System.out.println("ID: " + id + ", Name: " + name + ", Address:" + address);
            }

            // Close resources
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


/*

To use MySQL JDBC with IntelliJ IDEA , you can follow these steps:

Download the MySQL Connector/J driver from the MySQL website.
Extract the downloaded archive to a folder of your choice.
In IntelliJ IDEA, open your project and go to File -> Project Structure.
Click on "Modules" on the left-hand side and then click on the module that you want to add the MySQL JDBC driver to.
Click on the "Dependencies" tab and then click on the "+" button to add a new dependency.
In the "Add Library" dialog box, select "From File" and navigate to the location where you extracted the MySQL Connector/J driver.
Select the JAR file for the driver (usually named something like "mysql-connector-java-x.x.xx.jar") and click "OK" to add it to your project's dependencies.
Once you have added the MySQL JDBC driver as a dependency in your project, you can use it to connect to your MySQL database in your Java code.
 */