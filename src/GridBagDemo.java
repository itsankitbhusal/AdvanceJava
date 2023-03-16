// fill(horizontal , vertical)
// grid x, grid y
// ipad x, ipad y


import javax.swing.*;
import java.awt.*;

public class GridBagDemo {
    GridBagDemo() {
        JFrame frame = new JFrame("GridBag Layout Demo");
        GridBagLayout grid = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        frame.setLayout(grid);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(new JButton("Button 1"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(new JButton("Button 2"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.ipadx = 40;
        gbc.ipady = 30;
        frame.add(new JButton("Button 3"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        frame.add(new JButton("Button 4"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        frame.add(new JButton("Button 5"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.ipadx = 60;
        gbc.gridwidth = 1;
        frame.add(new JButton("Button 6"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.ipadx = 60;
        gbc.gridwidth = 1;
        frame.add(new JButton("Button 7"), gbc);

        frame.setLayout(grid);
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        new GridBagDemo();
    }
}
