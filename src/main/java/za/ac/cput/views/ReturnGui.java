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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class ReturnGui extends JFrame implements ActionListener {
    
    private JFrame mainframe;
    
    private JPanel panelcenter;
    
    private JLabel lblisbnn, lblstudentN;
    
    private JTextField txtisbnn, txtstudentN;
    
    private JButton btnreturn, btne;
    
    
    public ReturnGui(){
    
    mainframe = new JFrame ("Return");
    panelcenter = new JPanel();
    lblisbnn = new JLabel("ISBN");
    lblstudentN = new JLabel("Sutdent Number");
    txtisbnn = new JTextField(20);
    txtstudentN = new JTextField(20);
    
    btnreturn = new JButton("Return");
    btne = new JButton("Exit");
    
    
     mainframe.setSize(500,250);
    mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainframe.setVisible(true);
    
    
    }
    
    public void setReturnGui(){
    
    panelcenter.setLayout( new GridLayout (5,2));
     
     
     panelcenter.add(lblisbnn);
     panelcenter.add(txtisbnn);
     
     panelcenter.add(lblstudentN);
     panelcenter.add(txtstudentN);
     
     panelcenter.add(btnreturn);
     panelcenter.add(btne);
     
     
      mainframe.add(panelcenter, BorderLayout.CENTER);
   mainframe.add(panelcenter, BorderLayout.CENTER);

        
       btnreturn.addActionListener(this);
         btne.addActionListener(this);
     mainframe.setVisible(true);
    
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        
         if (e.getSource()== btnreturn){
     
        
    
     
     }
     if (e.getSource() == btne){
     
         System.exit(0);
     }
    }
    
    
    public static void main(String[] args) {
        
        new ReturnGui().setReturnGui();
    }
}
