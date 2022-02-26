
package strfunc;
import java.util.Scanner;
public class Strfunc {


    public static void main(String[] args) {
        String S;
        int flag=0,count=0;
        System.out.println("Enter any String:");
        Scanner inp=new Scanner(System.in);
        S=inp.next();
        StringBuilder sb = new StringBuilder(S);
        for(int i=0;i<sb.length();i++ )
        {
        
            
            if(sb.charAt(i)!='.'&& flag==0)
            {    
            sb.deleteCharAt(i);
            i--;
            }
            else if(sb.charAt(i)=='.'&&count==0)
            {
                sb.deleteCharAt(i);
                i--;
                flag=1;
            }
            else if((sb.charAt(i)=='a'||sb.charAt(i)=='e'||sb.charAt(i)=='i'||sb.charAt(i)=='o'||(sb.charAt(i)=='u')||(sb.charAt(i)=='.'))&&(flag==1))
                
            {    
                if(sb.charAt(i)=='.')
                  {
                   flag=2; 
                   }
                else
                {
                 sb.deleteCharAt(i);
                 i--;
                 count++;
                }
            }
        }
        System.out.println(sb);

    }
    
}
