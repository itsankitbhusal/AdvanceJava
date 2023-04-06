import java.sql.*;

public class PreparedStCRUD {
    public static void main(String[] args) throws Exception {
        String jdbcDriver = "com.mysql.cj.jdbc.Driver";
        String dbUrl = "jdbc:mysql://localhost:3306/java";
        String user = "root";
        String password = "ankitbhusal20";
        try {
            Class.forName(jdbcDriver);
            Connection conn = DriverManager.getConnection(dbUrl, user, password);
            //        insert into database
//            InsertInDb(conn);

//            update
//            UpdateInDb(conn);

//            delete
//            DeleteInDb(conn);

//            select data
            SelectInDb(conn);

            SelectInDb(conn);
        } catch (Exception e) {
            System.out.println("Exception occurs: " + e);
        }


    }

    static void SelectInDb(Connection conn) throws Exception {
        String query = "SELECT * FROM users";
        PreparedStatement pst = conn.prepareStatement(query);

        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }

        pst.executeUpdate();
        pst.close();
        conn.close();

    }

    static void DeleteInDb(Connection conn) throws Exception {
        String query = "DELETE FROM users WHERE id=?";
        PreparedStatement pst = conn.prepareStatement(query);
        pst.setInt(1, 5);

        System.out.println("Data deleted in database");

        pst.executeUpdate();
        pst.close();
        conn.close();
    }

    static void InsertInDb(Connection conn) throws SQLException {
        String query = "INSERT INTO users(id, name, address) VALUES(?,?,?)";
        PreparedStatement pst = conn.prepareStatement(query);
        pst.setInt(1, 5);
        pst.setString(2, "hari");
        pst.setString(3, "gaindakot");

        System.out.println("Data Inserted into database");

        pst.executeUpdate();
        pst.close();
        conn.close();
    }

    static void UpdateInDb(Connection conn) throws SQLException {
        String query = "UPDATE users SET name=? WHERE id=?";
        PreparedStatement pst = conn.prepareStatement(query);
        pst.setString(1, "dipson");
        pst.setInt(2, 5);

        System.out.println("Data updated into database");

        pst.executeUpdate();
        pst.close();
        conn.close();
    }

}
