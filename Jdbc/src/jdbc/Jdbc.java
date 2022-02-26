
package jdbc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Set;

public class Jdbc extends JFrame implements ActionListener { 
 
    JLabel lab1, lab2, lab3, lab4;
    JTextField tf1, tf2,tf3;
    JButton  b,b1;
    String ts1,ts2,ts3,ts4,ts5,ts6;
    ResultSet rs;
     Jdbc()
     {
        setVisible(true);
        setSize(700, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("CGPA details");
        lab1 = new JLabel("Student Details Form :");
        lab1.setForeground(Color.blue);
        lab1.setFont(new Font("Serif", Font.BOLD, 20));
        lab2 = new JLabel("Rollno:");
        lab3 = new JLabel("Department");
        lab4 = new JLabel("CGPA");
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        
        b = new JButton("ADD");
       b.addActionListener(this);
       b1=new JButton("VIEW");
       b1.addActionListener(this);
        lab1.setBounds(100, 30, 400, 30);
        lab2.setBounds(80, 70, 200, 30);
        lab3.setBounds(80, 110, 200, 30);
        lab4.setBounds(80, 150, 200, 30);
        tf1.setBounds(300, 70, 200, 30);
        tf2.setBounds(300, 110, 200, 30);
        tf3.setBounds(300, 150, 200, 30);
         b.setBounds(50, 350, 100, 30);
        b1.setBounds(50, 400, 100, 30);
         
        add(lab1);
        add(lab2);
        add(tf1);
        add(lab3);
        add(tf2);
        add(lab4);
        add(tf3);
        add(b);
         add(b1);
         
        
           
        }
     
      public void actionPerformed(ActionEvent ae)
      {
        if(ae.getActionCommand().equals("VIEW"))
      {
            try{
             Class.forName("com.mysql.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","");
             Statement stmt=con.createStatement();
             rs=stmt.executeQuery("select * from stu");
             while(rs.next())
              {
             System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
             }}
             catch(Exception e)
            {
             System.out.println(e);
            }
            }
           if(ae.getActionCommand().equals("ADD"))
        {
            try{
             Class.forName("com.mysql.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","");
             Statement stmt=con.createStatement();
             stmt.execute("insert into stu values('"+tf1.getText()+"','"+tf2.getText()+"','"+tf3.getText()+"')");            
            }
                    
            catch(Exception e)
            {
             System.out.println(e);
            }
    
        }
      }
public static void main(String args[])
	{
		Jdbc jp =new Jdbc();
	}
}

