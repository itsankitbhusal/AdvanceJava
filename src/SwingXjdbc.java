import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class SwingXjdbc {
    JFrame frame;
    JTextField nameField, genreField, lengthField;
    JButton btn;
    JLabel result;

    SwingXjdbc() {
        frame = new JFrame("SwingXjdbc form");
        JLabel nameLabel = new JLabel("Name: ");
        JLabel genreLabel = new JLabel("Genre: ");
        JLabel lengthLabel = new JLabel("Length: ");
        result = new JLabel("= ");

        nameField = new JTextField();
        genreField = new JTextField();
        lengthField = new JTextField();

        btn = new JButton("Submit");
        btn.addMouseListener(new ClickAdapter());

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(genreLabel);
        frame.add(genreField);
        frame.add(lengthLabel);
        frame.add(lengthField);
        frame.add(btn);
        frame.add(result);


        frame.setLayout(new GridLayout(4, 2));
        frame.setSize(800, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }


    public static void main(String[] args) {
        new SwingXjdbc();
    }

    private class ClickAdapter extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
            String name = nameField.getText();
            String genre = genreField.getText();
            int length = Integer.parseInt(lengthField.getText());

            String resultReturned = InsertInDatabase(name, genre, length);

            result.setText(resultReturned);

        }

        private String InsertInDatabase(String name, String genre, int length) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "ankitbhusal20");

                String query = "INSERT INTO movies(name, genre, length) VALUES(?, ?, ?)";
                PreparedStatement pst = conn.prepareStatement(query);
                pst.setString(1, name);
                pst.setString(2, genre);
                pst.setInt(3, length);


                pst.executeUpdate();


                pst.close();
                return "Data Inserted";


            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
            return "";
        }
    }
}


