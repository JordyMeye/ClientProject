/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.views;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class LoguinGui extends JFrame implements ActionListener {
    
    
    private JFrame mainframe;
    private JPanel panelcenter;
    private ImageIcon image;
    private JLabel lblusername, lblpassword ;
    private JTextField txtusername ;
   
    private JPasswordField password;
   
    
    private JButton btnlog, btnexit ;
    
    
    
    public LoguinGui (){
        
        
        mainframe = new JFrame ("Login");
        
        
        
        panelcenter = new JPanel();
        
        mainframe= new JFrame();
    lblusername = new JLabel("USERNAME:");
    txtusername = new JTextField(20);
    
    lblpassword = new JLabel("PASSWORD:");
    password = new JPasswordField();
    
    btnlog = new JButton("Login");
    btnexit = new JButton ("Exit");
    
           
    mainframe.setSize(500,250);
    mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainframe.setVisible(true);
    }
    
    
    public  void setLoguin (){
    
       panelcenter.setLayout( new GridLayout (3,2));
       
       
       
       panelcenter.add(lblusername);
       panelcenter.add(txtusername);
       
       
       panelcenter.add(lblpassword);
       panelcenter.add(password);
       
       panelcenter.add(btnlog);
       panelcenter.add(btnexit);
      
       
       
         mainframe.add(panelcenter, BorderLayout.CENTER);
   mainframe.add(panelcenter, BorderLayout.CENTER);

        
       btnlog.addActionListener(this);
         btnexit.addActionListener(this);
          
    }
    
   
    @Override
    public void actionPerformed (ActionEvent e) {
     
     if (e.getSource()== btnlog){
     
         if (txtusername.getText().equals("admin") && password.getText().equals("admin"))
         {
            setVisible(false);
             new MenuGui().setVisible(true);
              }
    
     else {
         JOptionPane.showMessageDialog(null, "incorrrect username or password");
     }
     }
     if (e.getSource() == btnexit){
     
         System.exit(0);
     }
    }
    
    
   
    public static void main(String[] args) {
        
    
        new LoguinGui().setLoguin();
    }

 

    

   
}


