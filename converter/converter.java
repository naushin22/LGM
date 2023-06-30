import javax.swing.*;                           
import java.awt.*;
import java.awt.event.*;

public class converter
 {
  
    // Function to convert from rupee
    // to the dollar and vice-versa
    // using Java Swing
    
    public static void convert()
    {
  
        // Creating a new frame using JFrame
        JFrame f = new JFrame("CONVERTER");
        JLabel l1, l2;
  
        // Creating two text fields.
        // One for rupee and one for
        // the dollar
        JTextField t1, t2;
  
        // Creating three buttons
        JButton b1, b2, b3;
  
        // Naming the labels and setting
        // the bounds for the labels
        l1 = new JLabel("Rupees:");
        l1.setBounds(30, 50, 70, 40);
        l2 = new JLabel("Dollars:");
        l2.setBounds(180, 50, 70, 40);
  
        // Initializing the text fields with
        // 0 by default and setting the
        // bounds for the text fields
        t1 = new JTextField("0");
        t1.setBounds(90, 50, 90, 40);
        t2 = new JTextField("0");
        t2.setBounds(250, 50, 90, 40);
        b1 = new JButton("INR");
        b1.setBounds(60, 90, 60, 25);
        b2 = new JButton("Dollar");
        b2.setBounds(200, 90, 80, 25);
        b3 = new JButton("close");
        b3.setBounds(160, 160, 60, 40);
  
        // Adding action listener
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                // Converting to double
                double d
                    = Double.parseDouble(t1.getText());
  
                // Converting rupees to dollars
                double d1 = (d / 82.04);
  
                // Getting the string value of the
                // calculated value
                String str1 = String.valueOf(d1);
  
                // Placing it in the text box
                t2.setText(str1);
            }
        });
  
        // Adding action listener
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                // Converting to double
                double d2
                    = Double.parseDouble(t2.getText());
  
                // converting Dollars to rupees
                double d3 = (d2 * 82.04);
  
                // Getting the string value of the
                // calculated value
                String str2 = String.valueOf(d3);
  
                // Placing it in the text box
                t1.setText(str2);
            }
        });
  
        // Action listener to close the form
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                f.dispose();
            }
        });
  
        // Default method for closing the frame
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
  
        // Adding the created objects
        // to the form
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(b3);
  
        f.setLayout(null);
        f.setSize(400, 300);
        f.setVisible(true);
    }
  
    // Driver code
    public static void main(String args[])
    {
        convert();
    }
}

  