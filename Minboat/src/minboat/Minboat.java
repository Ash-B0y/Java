
package minboat;
import java.util.*;


public class Minboat {

  
    public static void main(String[] args) {
       int n,c,count=0,temp,x=0,y=0,tp=0,min=0;
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the number of persons who need to travel:");
       n=s.nextInt();
       System.out.println("Enter the capacity of the boat:");
       c=s.nextInt();
       int a[]=new int [n];
       int h[]=new int [n];
       System.out.println("Enter the weights of each person:");
       for(int i=0;i<n;i++)
           a[i]=s.nextInt();
       for(int i=0;i<n;i++)
           h[i]=0;
       for(int j=0;j<n;j++)
       {
           for(int k=j+1;k<=n-1;k++)
           {
               temp=a[j]+a[k];
               if((temp<=c)&&(h[k]==0)&&(h[j]==0)&&(min==0))
               {
                   y=k;
                   count++;
                   h[y]=1;
                   h[j]=1;
                   tp=temp;
                   min++;
                   
               }
               if((temp)>(tp)&&(temp)<=(c)&&(h[k]==0))
                   {
                       tp=temp;
                      h[y]=0;
                      x=k;
                      h[x]=1;
                   }
               
           }
           tp=0;
           temp=0;
           min=0;
           }
       for(int l=0;l<n;l++)
       {
           if(h[l]==0)
           { 
               count++;
           }
       }
       System.out.println("The minimum number of boats required= "+count);
    }
    
}
