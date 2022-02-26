package movie.app;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.Color;
import java.awt.Graphics;

public class MovieApp extends JFrame implements ActionListener { 
 
    JLabel lab1, lab2, lab3, lab4, lab5, lab6, lab7,lab8,lab9,lab10,lab11,lab12,lab13,lab14,lab15,lab16; 
    JButton  b;
    JRadioButton r1,r2;
    JTextField tf1;
    String ts1,ts2,ts3,ts4,ts5,ts6;
    ResultSet rs;
    static int count=0;
     MovieApp()
     {
         ++count;
         if(count==1)
         { 
          setVisible(true);
        setSize(700, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Tracking Application");
        lab14 = new JLabel("Enter Order No:");
        lab14.setForeground(Color.blue);
        lab14.setFont(new Font("Serif", Font.BOLD, 20));
        lab15 = new JLabel("Wanna Check out Details?");
        lab16=new JLabel("");
        tf1 = new JTextField(5);
        r1=new JRadioButton("Yes");
        r2=new JRadioButton("No");
         r1.addActionListener(this);
         r2.addActionListener(this);
        lab14.setBounds(100, 30, 400, 30);
        tf1.setBounds(80, 70, 200, 30);
        lab15.setBounds(80, 110, 200, 30);
        r1.setBounds(80, 150, 200, 30);
       r2.setBounds(80, 190, 200, 30); 
       lab16.setBounds(80, 230,200,30);
       add(lab14);
       add(tf1);
       add(lab15);
       add(r1);
       add(r2);    
       add(lab16);
         }
         else
         {
         setVisible(true);
        setSize(700, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Tracking Application");
        lab1 = new JLabel("PRODUCT TRACKING FORM :");
        lab1.setForeground(Color.blue);
        lab1.setFont(new Font("Serif", Font.BOLD, 20));
        lab2 = new JLabel("TRACKING ID:");
        lab3 = new JLabel("PRODUCT NAME:");
        lab4 = new JLabel("PRODUCT TYPE:");
        lab5 = new JLabel("SHIPPING DATE:");
        lab6 = new JLabel("DELIVERED DATE:");
        lab7 = new JLabel("CUSTOMER'S NAME:"); 
        lab8 = new JLabel("");
        lab9 = new JLabel("");
        lab10 = new JLabel("");
        lab11 = new JLabel("");
        lab12 = new JLabel("");
        lab13 = new JLabel(""); 
        
        b = new JButton("Display");
       b.addActionListener(this);
       
        lab1.setBounds(100, 30, 400, 30);
        lab2.setBounds(80, 70, 200, 30);
        lab3.setBounds(80, 110, 200, 30);
        lab4.setBounds(80, 150, 200, 30);
        lab5.setBounds(80, 190, 200, 30);
        lab6.setBounds(80, 230, 200, 30);
        lab7.setBounds(80, 270, 200, 30);
         lab8.setBounds(300, 70, 200, 30);
        lab9.setBounds(300, 110, 200, 30);
        lab10.setBounds(300, 150, 200, 30);
        lab11.setBounds(300, 190, 200, 30);
        lab12.setBounds(300, 230, 200, 30);
        lab13.setBounds(300, 270, 200, 30);
         b.setBounds(50, 350, 100, 30);
        
        add(lab1);
        add(lab2);
        add(lab8);
        add(lab3);
        add(lab9);
        add(lab4);
        add(lab10);
        add(lab5);
        add(lab11);
        add(lab6);
        add(lab12);
        add(lab7);
        add(lab13);
         add(b);
         
         }
         try{
             Class.forName("com.mysql.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/package","root","");
             Statement stmt=con.createStatement();
             rs=stmt.executeQuery("select * from det");
              
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
             lab8.setText("1897328738");
            lab9.setText("SAN DISK CRUZER BLADE");
            lab10.setText("ELECTRONICS");
            lab11.setText("18/10/15");
            lab12.setText("22/10/15");
            lab13.setText("ASHWIN");
            }
           if(ae.getActionCommand().equals("Yes"))
          
           {
             MovieApp jp1 =new MovieApp();   
              }
           if(ae.getActionCommand().equals("No"))
           {
               lab16.setText("Have a Great Day......");
           }
           
         
        }
      
public void paint(Graphics draw){
      
      getContentPane().setBackground(Color.GRAY);
    }

  
public static void main(String args[])
	{
		MovieApp jp =new MovieApp();
	}
}
