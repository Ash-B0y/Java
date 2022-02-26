/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author Vel
 */
public class leastnumber {

    /**
     * @param args the command line arguments
     */
    
    void findleast(int[] a)
    {
        int min1=a[0],min2=a[1];
        for(int i=0;i<a.length;i++)
            if(a[i]<min1)
            {
                min2=min1;
                min1=a[i];
            }
            else if(a[i]<min2)
                min2=a[i];
        System.out.println("Second least number : "+min2);
    }
    
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int[] a={29,23,27,12,52,5,92,45};
        leastnumber x=new leastnumber();
        x.findleast(a);
    }
}
