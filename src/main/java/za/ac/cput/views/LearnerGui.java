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
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class LearnerGui extends JFrame implements ActionListener{
    
    private JFrame mainframe ;
    
    private JLabel lblstudentnumber, lblfirstname, lblsurname, lblcourse;
    
    private JTextField txtstudentnumber, txtfirstname, txtsurname;
    
    private JButton btnadd, btnclose;
    
    private JComboBox cbox;
    
    private JPanel panelcenter;        
         
    
    
     public LearnerGui(){
     
     mainframe = new JFrame ("Learner");
     
     panelcenter= new JPanel();
     
     lblstudentnumber = new JLabel ("Student Number");
     txtstudentnumber = new JTextField(20);
     
     lblfirstname = new JLabel ("First Name");
     txtfirstname = new JTextField(20);
     
     lblsurname = new JLabel("Surname");
     txtsurname = new JTextField(20);
     
     
     lblcourse = new JLabel("Course");
     String[] stu = {"IT", "Finance", "Law", "Physic", "astrology"};
     cbox = new JComboBox(stu);
     
     btnadd = new JButton("Add");
     btnclose = new JButton("Close");
     
        
         mainframe.setSize(500,250);
    mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainframe.setVisible(true);
     
     
     }
    
     public  void setLearner(){
     
     panelcenter.setLayout( new GridLayout (5,2));
     
     
     panelcenter.add(lblstudentnumber);
     panelcenter.add(txtstudentnumber);
     
     panelcenter.add(lblfirstname);
     panelcenter.add(txtfirstname);
     
     panelcenter.add(lblsurname);
     panelcenter.add(txtsurname);
     
     panelcenter.add(lblcourse);
     panelcenter.add(cbox);
     
     panelcenter.add(btnadd);
     panelcenter.add(btnclose);
     
    
     mainframe.add(panelcenter, BorderLayout.CENTER);
   mainframe.add(panelcenter, BorderLayout.CENTER);

        
       btnadd.addActionListener(this);
         btnclose.addActionListener(this);
     mainframe.setVisible(true);
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        
         if (e.getSource()== btnadd){
     
        
    
     
     }
     if (e.getSource() == btnclose){
     
         System.exit(0);
     }
    }
    
    
    
    
    public static void main(String[] args) {
        new LearnerGui().setLearner();
    }
}
