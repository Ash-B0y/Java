package calc;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calc implements ActionListener {
       JTextField tf=new JTextField("0");
       String lab[]={"9","8","7","X","6","5","4","/","1","2","3","+","0","C","=","-"}; 
       String str1="";String str2="";String c ="";
        double a=0,f=0,d=0;
        JButton b[] = new JButton[16];
    Calc()
       {
         JFrame f=new JFrame("Calc");
          f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         JPanel p=new JPanel();
         p.setLayout(new GridLayout(4,4));
         for(int i=0;i<lab.length;i++)
         {
             b[i]= new JButton(lab[i]);
             p.add(b[i]);
             b[i].addActionListener(this);
          }
        
         tf.setHorizontalAlignment(JTextField.RIGHT); 
         JPanel content =new JPanel();
         content.setLayout( new BorderLayout() );
         content.add( "North",tf);
         content.add( "Center",p);
         f.add(content);
         f.pack();
         f.setVisible(true);
        
       }
       
        
    public static void main(String[] args) {
        Calc c=new Calc();
        
    }
 public void actionPerformed(ActionEvent e) {
            
          
                if(e.getActionCommand().equals("+")||e.getActionCommand().equals("-")||e.getActionCommand().equals("X")||e.getActionCommand().equals("/"))
                {
                    
                    a=Double.parseDouble(str1);
                    c=e.getActionCommand();
                    str1="";
                    tf.setText(c);
                 
                }
                else if(e.getActionCommand().equals("C"))
                {
                    a=0;
                    d=0;
                    f=0;
                     str1="0";
                    tf.setText(str1);
                                        
                }
                else if(e.getActionCommand().equals("="))
                {   
                    f=Double.parseDouble(str1);
                    System.out.println(f);
                    if("+".equals(c))
                    {
                            d=a+f;
                            System.out.println(d);
                            str1="";
                            str1=String.valueOf(d);
                                
                            
                    }
                    else if("-".equals(c))
                    {
                            d=a-f;
                            System.out.println(d);
                            str1="";
                            str1=String.valueOf(d);
                            
                            
                    }
                    else if("X".equals(c))
                    {
                            d=a*f;
                            System.out.println(d);
                            str1="";
                            str1=String.valueOf(d);
                            
                            
                    }
                    
                    
                    else
                    {
                            d=a/f;
                            System.out.println(d);
                            str1="";
                            str1=String.valueOf(d);
                            
                            
                    }
                    System.out.println(d);
                                              
                    tf.setText(""+d);
                    
                }
                else 
                {
                    str2="";
                    tf.setText(str2);
                    str1=str1+e.getActionCommand();
                    tf.setText(str1);
                    
                }
}
}


