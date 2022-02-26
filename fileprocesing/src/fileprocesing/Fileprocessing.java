/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileprocesing;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author 13bcs27
 */
public class Fileprocessing
{

    /**
     * @param args the command line arguments
     */
    static int c=0,d=0;
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner n=new Scanner(System.in);
        String p;
        System.out.print("Enter the path of the folder : ");
        p=n.nextLine();
        File x=new File(p);
        if(x.isDirectory())
           printFiles(x,5);
        else
        {
            System.out.println(x.getName()+"  -  File");
            c++;
        }
        System.out.println("\n\n\nNo. of files in the folder : "+c);
        System.out.println("No. of sub-folders in the folder : "+d);
    }
    
    static void printFiles(File x,int s)
    {
        File[] f=x.listFiles();
        for(int i=0;i<f.length;i++)
        {
            if(f[i].isDirectory())
            {
                for(int j=0;j<s;j++)
                    System.out.print(" ");
                System.out.println(f[i].getName()+"  -  Folder");
                d++;
                printFiles(f[i],s+5);
            }
            else if(f[i].isFile())
            {
                for(int j=0;j<s;j++)
                    System.out.print(" ");
                System.out.println(f[i].getName()+"  -  File");
                c++;
            }
        }
            
    }
}
