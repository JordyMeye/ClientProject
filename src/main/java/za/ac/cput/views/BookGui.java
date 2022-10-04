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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class BookGui extends JFrame implements ActionListener, ItemListener {
    
    
    private JFrame mainframe;
    private JPanel panelcenter, panelavail;
    
    private JLabel lblisbn, lblcat, lblauthor, lblvailableForLoan ;
    private JTextField txtisbn, txtauthor ;
   
    private JPasswordField password;
   
    
    
    
    private JRadioButton radYes;
    private JRadioButton radNo;
    
    private ButtonGroup EquipmentButtonGroup;
    private JButton btnadd, btnexit ;
    
    private JComboBox cboxcat;
    
    
    public BookGui (){
        
        
        mainframe = new JFrame ("Book");
        
        
        
        panelcenter = new JPanel();
        
        mainframe= new JFrame();
        
    lblisbn = new JLabel("ISBN:");
    txtisbn = new JTextField(20);
    
    lblcat = new JLabel("Category:");
    String cat[]={"fiction","adventure","comics","tantasy","romance"};
    cboxcat = new JComboBox(cat);
    
    lblauthor = new JLabel("Author:");
    txtauthor = new JPasswordField();
    
    lblvailableForLoan = new JLabel("Available?");
    panelavail =new JPanel();
    radYes=new JRadioButton("Yes");
      radNo=new JRadioButton("No");
      EquipmentButtonGroup=new ButtonGroup();
      EquipmentButtonGroup.add(radYes);
      EquipmentButtonGroup.add(radNo);
      radYes.setSelected(true);
      panelavail.setLayout(new GridLayout(1, 2));
      panelavail.add(radYes);
      panelavail.add(radNo);
    
    btnadd = new JButton("Add");
    btnexit = new JButton ("Exit");
    
           
    mainframe.setSize(500,250);
    mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainframe.setVisible(true);
    }
    
    
    public  void setBookGui (){
    
       panelcenter.setLayout( new GridLayout (6,2));
       
       
       
       panelcenter.add(lblisbn);
       panelcenter.add(txtisbn);
       
       panelcenter.add(lblcat);
       panelcenter.add(cboxcat);
       
       panelcenter.add(lblauthor);
       panelcenter.add(txtauthor);
       
       
       
       
       panelcenter.add(lblvailableForLoan);
       panelcenter.add(panelavail);
      
       
       panelcenter.add(btnadd);
       panelcenter.add(btnexit);
       
         mainframe.add(panelcenter, BorderLayout.CENTER);
   mainframe.add(panelcenter, BorderLayout.CENTER);

        
       btnadd.addActionListener(this);
         btnexit.addActionListener(this);
          
         cboxcat.addItemListener(this);
    }
    
   
    @Override
    public void actionPerformed (ActionEvent e) {
     
     if (e.getSource()== btnadd){
     
        
    
     
     }
     if (e.getSource() == btnexit){
     
         System.exit(0);
     }
    }
    
    
   
    public static void main(String[] args) {
        
    
        new BookGui().setBookGui();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 

    

   
}
