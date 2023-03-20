import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyDemo extends JFrame implements KeyListener {
    JLabel label1, label2, label3;
    JTextField textField1, textField2, textField3;
    JButton button;

    KeyDemo() {
        label1 = new JLabel("First Number:");
        label2 = new JLabel("Second Number:");
        label3 = new JLabel("Result:");

        textField1 = new JTextField(20);
        textField2 = new JTextField(20);
        textField3 = new JTextField(20);

        button = new JButton("Press");

        add(label1);
        add(textField1);
        add(label2);
        add(textField2);
        add(label3);
        add(textField3);
        add(button);

        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER, 20, 10);

        setVisible(true);
        setLayout(flowLayout);
        setSize(300, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button.addKeyListener(this);
    }

    public void keyPressed(KeyEvent ke) {
        int num1 = Integer.parseInt(textField1.getText());
        int num2 = Integer.parseInt(textField2.getText());

        if (ke.getKeyChar() == 'a' || ke.getKeyChar() == 'A') {
            int additionResult = num1 + num2;
            textField3.setText(String.valueOf(additionResult));
        } else if (ke.getKeyChar() == 's' || ke.getKeyChar() == 'S') {
            int subResult = num1 - num2;
            textField3.setText(String.valueOf(subResult));
        } else {
            textField3.setText("Press valid key!");
        }

    }

    public void keyTyped(KeyEvent ke) {

    }

    public void keyReleased(KeyEvent ke) {

    }


    public static void main(String[] args) {
        new KeyDemo();
    }
}
