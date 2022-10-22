//Erkut Ter
//118202076

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
   //set required global buttons and labels
    private JLabel lblShowName, lblDate, lblPrice;
    private JButton btnSetName, btnSetDate, btnSetPrice;

    public Main() {
        //set names
        lblShowName = new JLabel("Show name: ");
        lblDate = new JLabel("Show date: ");
        lblPrice = new JLabel("Show price: ");
        btnSetName = new JButton("Set Show Name");
        btnSetDate = new JButton("Set Date");
        btnSetPrice = new JButton("Set Price");

        //add buttons in order
        add(lblShowName);
        add(btnSetName);
        add(lblDate);
        add(btnSetDate);
        add(lblPrice);
        add(btnSetPrice);

        //action listener to be able to buttons to click
        btnSetName.addActionListener(this);
        btnSetDate.addActionListener(this);
        btnSetPrice.addActionListener(this);

        //grid layout for easy location and other required properties to show layout
        setLayout(new GridLayout(3, 2));
        setSize(400, 600);
        setVisible(true);
        setTitle("Theater Ticket");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    //when action performed what methods will be executed defined here
    public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btnSetName) {
                String showName = JOptionPane.showInputDialog(this, "Set show name to: ");
                lblShowName.setText("Show name: " + showName);
            } else if (e.getSource() == btnSetDate) {
                String showDate = JOptionPane.showInputDialog(this, "Set show date to: ");
                lblDate.setText("Show date: " + showDate);
            } else if (e.getSource() == btnSetPrice) {
                    try {
                        String showPrice = JOptionPane.showInputDialog(this, "Set show price to: ");
                        int price = Integer.parseInt(showPrice);
                        lblPrice.setText("Show price: " + price);
                    }
                    catch (NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(this , "Please enter an integer next time","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
    }