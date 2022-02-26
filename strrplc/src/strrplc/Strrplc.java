
package strrplc;


public class Strrplc {

    public static void main(String[] args) {

        String s0= "He is a Teacher.";
        String s1="is";
        String s2=" was ";
        String s3="";
        for(int i=0;i<s0.length();i++)
        {
            
            if(s0.charAt(i)==' ')
            {
                
                if(s1.equals(s3))
                {   
                 s0=s0.replace("is",s2);
                } 
                s3="";
            } 
            else
            s3=s3+s0.charAt(i);
        }
        System.out.println(s0);
    }
    
}
