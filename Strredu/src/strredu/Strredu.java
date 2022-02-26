
package strredu;
import java.util.Scanner;

public class Strredu {

    public static void main(String[] args) {
       String S;
        System.out.println("Enter any String:");
        Scanner inp=new Scanner(System.in);
        S=inp.next();
        StringBuilder sb = new StringBuilder(S);
       for(int i=0;i<sb.length()-1;i++)
       {
           if(sb.charAt(i)==sb.charAt(i+1))
           {
               sb.deleteCharAt(i);
               i--;
      
           }
       
       }
    
     System.out.println(sb);  
}
}
