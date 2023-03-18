import javax.swing.*;
import java.awt.*;

public class CalculatorDemo {
    CalculatorDemo(){
        JFrame frame = new JFrame();

        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        frame.setLayout(gbl);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx=0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        frame.add(new JTextField(""), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth=1;
        frame.add(new JButton("c"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        frame.add(new JButton("%"), gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        frame.add(new JButton("+/-"), gbc);

        gbc.gridx = 3;
        gbc.gridy = 1;
        frame.add(new JButton("/"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        frame.add(new JButton("7"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        frame.add(new JButton("8"), gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        frame.add(new JButton("9"), gbc);

        gbc.gridx = 3;
        gbc.gridy = 2;
        frame.add(new JButton("*"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        frame.add(new JButton("4"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        frame.add(new JButton("5"), gbc);

        gbc.gridx = 2;
        gbc.gridy = 3;
        frame.add(new JButton("6"), gbc);

        gbc.gridx = 3;
        gbc.gridy = 3;
        frame.add(new JButton("-"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        frame.add(new JButton("1"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        frame.add(new JButton("2"), gbc);

        gbc.gridx = 2;
        gbc.gridy = 4;
        frame.add(new JButton("3"), gbc);

        gbc.gridx = 3;
        gbc.gridy = 4;
        frame.add(new JButton("="), gbc);




        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        new CalculatorDemo();
    }
}
