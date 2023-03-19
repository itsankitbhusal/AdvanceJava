import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionListenerDemo implements ActionListener {
    JFrame f;
    JTextField t1, t2;
    JButton b;
    ActionListenerDemo(){
        f = new JFrame();
        t1= new JTextField();
        t1.setPreferredSize(new Dimension(200, 30));

        t2 = new JTextField();
        t2.setPreferredSize(new Dimension(200, 30));

        b = new JButton("Copy");

        FlowLayout fl = new FlowLayout(FlowLayout.CENTER, 20, 10);


        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(fl);


        f.add(t1);
        f.add(t2);
        f.add(b);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        String s = t1.getText();
        t2.setText(s);
    }

    public static void main(String[] args) {
        new ActionListenerDemo();
    }

}

