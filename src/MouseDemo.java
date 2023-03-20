import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseDemo implements MouseListener {
    JFrame frame;
    JLabel label;

    MouseDemo() {
        frame = new JFrame("Mouse Demo");
        label = new JLabel();
        label.setBounds(100, 120, 80, 30);

        frame.add(label);

        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.addMouseListener(this);

    }

    public void mousePressed(MouseEvent me) {
        label.setText("Mouse Pressed!");

    }

    public void mouseClicked(MouseEvent me) {
        label.setText("Mouse Clicked!");
    }

    public void mouseReleased(MouseEvent me) {
        label.setText("Mouse Released!");
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        label.setText("Mouse Entered!");
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        label.setText("Mouse Exited!");
    }

    public static void main(String[] args) {

        new MouseDemo();
    }
}
