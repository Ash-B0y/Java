package ascii;
import java.util.*;
public class Ascii {

  
    public static void main(String[] args) {
       int a[]=new int[10],count=0,count1=0,count2=0,count3=0;
      String s="";
     Scanner aja=new Scanner(System.in);
      while(true)
     { 
         System.out.println("Enter a Strong Password:");
         s=aja.next();
                 
       StringBuilder sb=new StringBuilder(s);
      for(int i=0;i<sb.length();i++)
      {
          a[i]=sb.charAt(i);
          if(a[i]>=65 && a[i]<=90)
              count=1;
          if(a[i]>=97 && a[i]<=122)
              count1=1;  
          if(a[i]>=48 && a[i]<=57)
              count2=1;
          if(sb.length()>=7)
              count3=1;
            }
          if((count==1)&&(count1==1)&&(count2==1)&&(count3==1))
          {
              System.out.println("PASSWORD ACCEPTED");
              break;
            }
              else
          {
           System.out.println("INVALID PASSWORD");
              
          }
          count=0;
          count1=0;
          count2=0;
          count3=0;
          
     }
              
    }
    
}
