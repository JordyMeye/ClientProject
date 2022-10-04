/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.views;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MenuGui extends JFrame implements ActionListener {
    
    private JFrame mainframe ;
   private BufferedImage img ;
    private JPanel panelnorth, panelsouth;
    private JButton btnaddstudent , btnaddnewbook, btnborrow, btnturn, btnlogout;
    
    private JLabel lblpic;
    
    
    public MenuGui(){
    
    
        mainframe = new JFrame("Menu");
        
            
         ImageIcon icon1 = new ImageIcon("student.png");   
         ImageIcon icon2 = new ImageIcon("book.png");
         ImageIcon icon3 = new ImageIcon("borrow.png");
         ImageIcon icon4 = new ImageIcon("return.png");
         ImageIcon icon5 = new ImageIcon("logout.png");
         
      //  img = new ImageIcon("lirary.jpg");
        
        panelnorth = new JPanel();
        
        
       
       
      
        
        btnaddstudent= new JButton(icon1);
        btnaddnewbook = new JButton(icon2);
        btnborrow = new JButton(icon3);
        btnturn = new JButton(icon4);
        btnlogout = new JButton(icon5);
        
        
         mainframe.setSize(700,300);
         mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         mainframe.setVisible(true);
        
    }
    
    
    public  void setMenu(){
        
        panelnorth.setLayout( new GridLayout (1,5));
        
        panelnorth.add(btnaddstudent);
        panelnorth.add(btnaddnewbook);
        panelnorth.add(btnborrow);
        panelnorth.add(btnturn);
        panelnorth.add(btnlogout);
        
        
        
         mainframe.add(panelnorth, BorderLayout.NORTH);
   

        
       btnaddstudent.addActionListener(this);
         btnaddnewbook.addActionListener(this);
         btnborrow.addActionListener(this);
         btnturn.addActionListener(this);
         btnlogout.addActionListener(this);
         
    }
    
    @Override
    public void actionPerformed (ActionEvent e) {
    
        if (e.getSource()== btnlogout){
            //setVisible(false);
           new LoguinGui().setLoguin();
        }
            
    if (e.getSource()== btnaddnewbook){
    
           setVisible(false);
           new BookGui().setBookGui();
    
    }
    if (e.getSource()== btnaddstudent){
    
    setVisible(false);
           new LearnerGui().setLearner();
    
    }
    
    if (e.getSource()== btnturn){
    
    setVisible(false);
           new ReturnGui().setReturnGui();
    
    }
    
    }
    
    
     public static void main(String[] args) {
        
    
        new MenuGui().setMenu();
    }
}
