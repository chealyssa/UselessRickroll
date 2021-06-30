/*
Alyssa, INIT 2022
ps: programmming with a cat is hrder than i thought.
This is a JFrame thats asks for a name, with a return of something meaningful
 */
package uselessrickroll;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UselessRickroll extends JFrame implements ActionListener
{
    // background
    public static final Color COLOR = new Color(149, 90, 156);
    
    // declaring textfields, label, and panels for button
    private JPanel buttonPanel;
    private JTextField nameText;
    private JLabel nameLabel;
    private JButton uselessButton;
    
    public UselessRickroll()
    {
        super("Simply enter your name, nothing suspicious");
        // frame size
        this.setBounds(300,200,500,400);
        // what close do
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        /// background color
        this.getContentPane().setBackground(COLOR);
        
        this.setLayout(new BorderLayout());
        
        // construct textfield
        nameLabel = new JLabel("Name: ");
        nameText = new JTextField(10);
        
        // panel for textfield and button
        this.buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.setBackground(COLOR);
        buttonPanel.add(nameLabel);
        buttonPanel.add(nameText);
        
        // construct button
        uselessButton = new JButton("Give me the suprise");
        uselessButton.addActionListener(this);
        buttonPanel.add(uselessButton);
        
        // adds everything to frame
        this.add(buttonPanel, BorderLayout.CENTER);
        
        this.setVisible(true);
    }
    
    public static void main(String[] args) 
    {
        new UselessRickroll();
    }
    
    public void openWebPage(String url)
    {
        try
        {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        }
        catch (java.io.IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String command = e.getActionCommand();
        if(command.equals("Give me the suprise"))
        {           
            openWebPage("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
        }
    }
    
}
