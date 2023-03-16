import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {
    BorderLayoutDemo() {
        JFrame f = new JFrame("Border Layout Example");

        JButton b1 = new JButton("btn 1");
        JButton b2 = new JButton("btn 2");
        JButton b3 = new JButton("btn 3");
        JButton b4 = new JButton("btn 4");
        JButton b5 = new JButton("btn 5");


        f.add(b1, BorderLayout.NORTH);
        f.add(b2, BorderLayout.SOUTH);
        f.add(b3, BorderLayout.WEST);
        f.add(b4, BorderLayout.EAST);
        f.add(b5, BorderLayout.CENTER);

        f.setVisible(true);
        f.setSize(1920, 1080);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
