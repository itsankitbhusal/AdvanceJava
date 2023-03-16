import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {
    FlowLayoutDemo(){
        JFrame f = new JFrame();
        JLabel userLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");

        JTextField userField = new JTextField();
        JPasswordField passwordField = new JPasswordField();

        JButton btn = new JButton("Submit");
        f.add(userLabel);
        f.add(userField);

        f.add(passwordLabel);
        f.add(passwordField);

        f.add(btn);

        FlowLayout fl = new FlowLayout(FlowLayout.CENTER, 20, 10);

        f.setLayout(fl);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
}
