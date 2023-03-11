import javax.swing.*;
import java.awt.*;

public class LoginUI {
    LoginUI() {
        JFrame frame = new JFrame("Java Swing Application");
        frame.setSize(1280, 740);
        frame.setVisible(true);

        JLabel heading = new JLabel("Login");
        heading.setBounds(450, 150, 400, 100);
        heading.setFont(new Font("sans-serif", Font.BOLD, 50));

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(300, 300, 200, 40);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(300, 400, 200, 40);


        JTextField userField = new JTextField();
        userField.setBounds(500, 300, 200, 40);


        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(500, 400, 200, 40);

        JButton btn = new JButton("Click");
        btn.setBounds(500, 500, 200, 40);

        frame.add(heading);

        frame.add(userLabel);
        frame.add(passwordLabel);

        frame.add(userField);
        frame.add(passwordField);

        frame.add(btn);


        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
