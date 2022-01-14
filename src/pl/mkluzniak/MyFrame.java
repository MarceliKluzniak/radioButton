package pl.mkluzniak;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {


    JRadioButton pizzaButton;//declare buttons outside constructor to be global and used in override method
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaButton = new JRadioButton("pizza");//creating buttons
        hamburgerButton = new JRadioButton("hamburger");
        hotdogButton = new JRadioButton("hotdog");

        ButtonGroup group = new ButtonGroup();//creating group to chose one from food
        group.add(pizzaButton);//adding buttons to group
        group.add(hamburgerButton);
        group.add(hotdogButton);

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        this.add(pizzaButton);//adding buttons to frame
        this.add(hamburgerButton);
        this.add(hotdogButton);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pizzaButton) {
            System.out.println("You ordered pizza!");//if statement to print on console what was choosen
        }
        else if(e.getSource()==hamburgerButton) {
            System.out.println("You ordered a hamburger!");
        }
        else if(e.getSource()==hotdogButton) {
            System.out.println("You ordered a hotdog!");
        }
    }
}
