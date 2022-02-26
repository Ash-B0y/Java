
package longstr;
import java.util.Scanner;

public class Longstr {
    public static void main(String[] args) {

        String S,s3="",s4="";
        int x=0,y=0,count=0;
        System.out.println("Enter a Sentence:");
        Scanner inp=new Scanner(System.in);
        S=inp.nextLine();
        for(int i=0;i<S.length();i++)
        {
         if((S.charAt(i)==' ')||(S.charAt(i)=='.')||(S.charAt(i)==','))
            {
               y=s3.length();
               if(y>x)
               {
                   s4="";
                for(int j=0;j<y;j++)   
                {
                    s4=s4+s3.charAt(j);
                }
                count=y;
                x=y;
               }
               s3="";
               
             }
         else
             s3=s3+S.charAt(i);
        }
         
         
        System.out.println("The longest word in the sentence is: " +s4+" with a length of "+count);
        
    
}
}