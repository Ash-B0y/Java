package strrev;
import java.util.*;
public class Strrev {
    public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         int ctr = 0;
         String S1=scan.nextLine();
        strrev(0,"",S1,ctr);
         }
      public static void strrev(int g,String a,String b, int c)
    {
       
        for(int i=g;i<b.length();i++)
        {
          
          if(b.charAt(i)==' ')
          {
              c++;   
              strrev(i+1,"",b,c);
              if (c==1)
                  System.out.print(a);
              else
                  System.out.print(a+" ");
              break;
        
          }
          a=a+b.charAt(i);
          if(i==b.length()-1)
          {
            System.out.print(a+" ");
            break;
          
          }
        }              
        
        
    }
    }
    
   
