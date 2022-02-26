/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;
/**
 *
 * @author Vel
 */
public class fact 
{

    /**
     * @param args the command line arguments
     */
    int findfact(int a)
    {
        if(a==0||a==1)
            return 1;
        return a*findfact(a-1);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int n=6;
        fact f=new fact();
        System.out.println(n+"! = "+f.findfact(n));
    }
    
}
