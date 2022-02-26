
package loan;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class Loan extends JFrame implements ActionListener  {
    JTextField tf1, tf2;
   JButton jb;
   JLabel l1;
    ResultSet rs;
  String am;
   String am1 = "loan cannot be provided";
   String am2 = "loan can be provided";
  
    Loan()
    {         
       
        setVisible(true);
        setSize(700, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Banking");
        l1 = new JLabel("Enter the Account Number:");
        jb = new JButton("Check");
        jb.addActionListener(this);
         jb.setBounds(50, 350, 100, 30);
          tf1 = new JTextField();
          tf2 = new JTextField();
          l1.setBounds(100, 150, 200, 30);
         tf1.setBounds(300, 150, 200, 30);
         tf2.setBounds(300, 270, 200, 30);
         add(l1);
         add(tf1);
         add(tf2);
         add(jb);
         try{
             Class.forName("com.mysql.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
             Statement stmt=con.createStatement();
             rs=stmt.executeQuery("select amount1 from account where account_id=234531");
              
             while(rs.next())
             {
       
          am = rs.getString(3);
     
         }
         }
          catch(ClassNotFoundException | SQLException e)
            {
             System.out.println(e);
            }
    
   
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      
    if(e.getActionCommand().equals("Check"))
        {
        
            if("50000".equals(am))
            {
                
                tf2.setText(am2);
            }
            else
            tf2.setText(am1);
             
        }
    
         }
    
    
    public static void main(String args[])
    {
        Loan l1 = new Loan();
        
    }
}
    
