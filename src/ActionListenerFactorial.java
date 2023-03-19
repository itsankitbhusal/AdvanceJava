import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerFactorial implements ActionListener {
    //    adding frames and component variables globally to access from different methods
    JFrame frame;
    JTextField textField1;

    JTextField textField2;
    JButton button;
    FlowLayout flowLayout;

    ActionListenerFactorial() {

//        frame
        frame = new JFrame("Factorial");

//        input field
        textField1 = new JTextField();
        textField1.setPreferredSize(new Dimension(100, 30));

//        input field 2
        textField2 = new JTextField();
        textField2.setPreferredSize(new Dimension(100, 30));

//        button
        button = new JButton("Calculate");

//        using flow layout
        flowLayout = new FlowLayout(FlowLayout.CENTER, 20, 10);

//        adding components into frame
        frame.add(textField1);
        frame.add(textField2);
        frame.add(button);

//        setting frame attributes
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLayout(flowLayout);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        adding action listener to button
        button.addActionListener(this);
    }

    //    action listener handler
    public void actionPerformed(ActionEvent ae) {
        int num = Integer.parseInt(textField1.getText());

        if (num < 0) {
            textField2.setText("only +ve");
            return;
        }

        int result = factorial(num);

        textField2.setText(String.valueOf(result));
    }

    //    function to return factorial of +ve number (recursive)
    private int factorial(int num) {
        if (num < 0) {
            return -1;
        }
        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    //    main method
    public static void main(String[] args) {
//        calling constructor
        new ActionListenerFactorial();
    }
}
