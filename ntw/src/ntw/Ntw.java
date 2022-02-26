
package ntw;
import java.util.*;

public class Ntw {
   public static void main(String[] args) {
        String s1[]={"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
        String s2[]={"","ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFETEEN","SIXETEEN","SEVENTEEN","EIGHTEEN","NINETEEN"};
        String s3[]={"","TEN","TWENTY","THIRTY","FOURTY","FIFTY","SIXTY","SEVENTY","EIGHTY","NINETY"};
        String s4[]={"","ONE HUNDRED","TWO HUNDRED","THREE HUNDRED","FOUR HUNDRED","FIVE HUNDRED","SIX HUNDRED","SEVEN HUNDRED","EIGHT HUNDRED","NINE HUNDRED"};
        String s5[]={"","ONE THOUSAND","TWO THOUSAND","THREE THOUSAND","FOUR THOUSAND","FIVE THOUSAND","SIX THOUSAND","SEVEN THOUSAND","EIGHT THOUSAND","NINE THOUSAND"};
        String s6[]={"","TEN THOUSAND","TWENTY THOUSAND","THIRTY THOUSAND","FOURTY THOUSAND","FIFTY THOUSAND","SIXTY THOUSAND","SEVENTY THOUSAND","EIGHTY THOUSAND","NINETY THOUSAND"};
        String s7[]={"","ELEVEN THOUSAND","TWELVE THOUSAND","THIRTEEN THOUSAND","FOURTEEN THOUSAND","FIFETEEN THOUSAND","SIXETEEN THOUSAND","SEVENTEEN THOUSAND","EIGHTEEN THOUSAND","NINETEEN THOUSAND"};        
        String S="",S1="",S2="",S3="",S4="",sb="";
        int inp,q=9,r,ct=0,w=0,c=0,b=0,a=0,m=0;
    Scanner st=new Scanner(System.in);
    System.out.println("Enter any number whose digits are atleast five:");
    inp=st.nextInt();
     while(q!=0)
    {
         q=inp/10;
	 r=inp%10; 
         inp=q;
         ++ct;
         if(ct==1)
         {
             sb=String.valueOf(r);
             w=sb.charAt(0)-'0';
             c=w;
             S=s1[w];
             sb="";
             
         }
         if(ct==2)
         {
             sb=String.valueOf(r);
             w=sb.charAt(0)-'0';
             b=w;
             if(S!="ZERO")
             {
                 S1=s3[w];
               
             }
             if((S!="ZERO")&&(w==1))
             {
                 S=s2[c];
                 S1="";
                 
             }
             if(S.equals("ZERO"))
             {
                 S=s3[w];
                 
             }
             
             sb="";
         }
         if(ct==3)
         {
            sb=String.valueOf(r);
             w=sb.charAt(0)-'0';
            
               S2=s4[w];   
               sb="";
         }
         if(ct==4)
         {
             sb=String.valueOf(r);
             w=sb.charAt(0)-'0';
             a=w;
             S3=s5[w];
             sb="";
         }
         if(ct==5)
         {
             sb=String.valueOf(r);
             w=sb.charAt(0)-'0';
              if((w==1)&&(a!=0))
             {
                 ++m;
                
              S4=s7[a];
              S3="";
             }
             if(a==0)
             {
              S4=s6[w];   
             }  
            
             if((a!=0)&& (m==0))
             {    
             S4=s3[w];
             }
             sb="";
         }
         
}
     if(ct>5)
         System.out.println("Sorry!!!! Please Enter a Number with atleast 5 digits..... ");
     else
     System.out.println(S4 +" "+S3 +" "+S2 +" "+S1 +" "+S);
   }
}
