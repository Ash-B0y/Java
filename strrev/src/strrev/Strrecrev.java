
package strrev;
import java.util.Scanner;
public class Strrecrev {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
       String S1=scan.nextLine();
       int ctr = 0;
        strrev(S1.length()-1,"",S1,ctr);
         }
      public static void strrev(int g,String a,String b, int c)
    {
       
        for(int i=g;i>=0;i--)
        {
          if(b.charAt(i)==' ')
          {
              c++;
              strrev(i-1,"",b,c);
              if (c==1)
                  System.out.print(a);
              else
                  System.out.print(a+" ");
              break;
        
          }
          a=a+b.charAt(i); 
          if(i==0)
          {
            System.out.print(a+" ");
            break;
          
          }
          
        }
    }
}
                      
        

