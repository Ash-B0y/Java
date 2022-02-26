package sneh;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Sneh extends JFrame implements ActionListener { 
 
    JLabel lab1, lab2, lab3, lab4, lab5, lab6, lab7; 
    JTextField tf1, tf2,tf3,tf4 ,tf5, tf6;
    JButton  b;
    String ts1,ts2,ts3,ts4,ts5,ts6;
    ResultSet rs;
     Sneh()
     {
        setVisible(true);
        setSize(700, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Application");
        lab1 = new JLabel("Student Details Form :");
        lab1.setForeground(Color.blue);
        lab1.setFont(new Font("Serif", Font.BOLD, 20));
        lab2 = new JLabel("NAME:");
        lab3 = new JLabel("ROLL NO:");
        lab4 = new JLabel("AGE:");
        lab5 = new JLabel("SEX:");
        lab6 = new JLabel("MAJOR:");
        lab7 = new JLabel("CONTACT NO:"); 
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();
        tf5 = new JTextField();
        tf6 = new JTextField();
        
        b = new JButton("Display");
       b.addActionListener(this);
       
        lab1.setBounds(100, 30, 400, 30);
        lab2.setBounds(80, 70, 200, 30);
        lab3.setBounds(80, 110, 200, 30);
        lab4.setBounds(80, 150, 200, 30);
        lab5.setBounds(80, 190, 200, 30);
        lab6.setBounds(80, 230, 200, 30);
        lab7.setBounds(80, 270, 200, 30);
         tf1.setBounds(300, 70, 200, 30);
        tf2.setBounds(300, 110, 200, 30);
        tf3.setBounds(300, 150, 200, 30);
        tf4.setBounds(300, 190, 200, 30);
        tf5.setBounds(300, 230, 200, 30);
        tf6.setBounds(300, 270, 200, 30);
         b.setBounds(50, 350, 100, 30);
        
        add(lab1);
        add(lab2);
        
        add(lab3);
        add(tf1);
        add(tf2);
        add(lab4);
        add(tf3);
        add(lab5);
        add(tf4);
        add(lab6);
        add(tf5);
        add(lab7);
        add(tf6);
         add(b);
         try{
             Class.forName("com.mysql.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/snake","root","");
             Statement stmt=con.createStatement();
             rs=stmt.executeQuery("select * from sna");
              
             while(rs.next())
             {
                 
                 ts1=rs.getString(1);
                 ts2=rs.getString(2);
                 ts3=rs.getString(3);
                 ts4=rs.getString(4);
                 ts5=rs.getString(5);
                 ts6=rs.getString(6);
             }
              }    
         catch(Exception e)
            {
             System.out.println(e);
            }
         
        }
     
      public void actionPerformed(ActionEvent ae)
    {
        if(ae.getActionCommand().equals("Display"))
        {
             tf1.setText(ts1);
            tf2.setText(ts2);
            tf3.setText(ts3);
            tf4.setText(ts4);
            tf5.setText(ts5);
            tf6.setText(ts6);
            }
         }


  
public static void main(String args[])
	{
		Sneh jp =new Sneh();
	}
}
