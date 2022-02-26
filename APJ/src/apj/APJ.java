
package apj;
import java.util.*;

public class APJ {

    
    public static void main(String[] args) {
        int a,b,c,d,e,f,res1,res2,fs,ls;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the day,month and year of Birth:");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        System.out.println("Enter the day,month and year of Death:");
        d=s.nextInt();
        e=s.nextInt();
        f=s.nextInt();
        res1=(1931*365)+(10*30)+15;
        res2=(2015*365)+(7*30)+26;
        fs=(c*365)+(b*30)+a;
        ls=(f*365)+(e*30)+d;
        if((fs>res1)&&(fs<=res2)||(ls>res1)&&(ls<=res2))
        {
          if((ls-fs)>=1)  
          System.out.println("FORTUNATE");
        }
        else
            System.out.println("UNFORTUNATE");
    }
    
}
