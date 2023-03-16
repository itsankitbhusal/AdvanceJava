import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo {
    GridLayoutDemo(){
        JFrame frame = new JFrame("Grid Layout Demo");

        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");
        JButton btn4 = new JButton("Button 4");
        JButton btn5 = new JButton("Button 5");
        JButton btn6 = new JButton("Button 6");
        JButton btn7 = new JButton("Button 7");
        JButton btn8 = new JButton("Button 8");
        JButton btn9 = new JButton("Button 9");

        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        frame.add(btn7);
        frame.add(btn8);
        frame.add(btn9);

        GridLayout gl = new GridLayout(3, 3);
        frame.setVisible(true);
        frame.setLayout(gl);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}
