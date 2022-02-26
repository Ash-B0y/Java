package filere;
import java.io.*;
import java.io.File;
import java.io.FileInputStream;

public class Filere {
    static File f1;
  public static void main(String[] args) throws Exception {
    String dname="C:\\Users\\Vel\\Desktop\\files\\";  
    boolean areFilesIdentical = true;
    f1=new File(dname);
    int i1,i2;
    System.out.println("Directory is "+ dname);
     String[] s=f1.list();      
     for(int i=0;i<s.length;i++)
     {      
         
         for(int j=i+1;j<s.length;j++)
         {
             areFilesIdentical = true;
              File fi1=new File(dname+s[i]);
          FileInputStream fis1 = new FileInputStream(dname +s[i]); 
         File fi2=new File(dname+s[j]);   
           FileInputStream fis2 = new FileInputStream(dname +s[j]);
          if(fi1.isFile())
                if(fi2.isFile())
                {   
                   
                  i1 = fis1.read();
                  i2 = fis2.read();
                  while ((i1 != -1)&&(i2 != -1))
                  {
                 if (i1 != i2)
                 {
                areFilesIdentical = false;
                break;
                }
                 
               i1 = fis1.read();
               i2 = fis2.read();
    
                  }
    if(areFilesIdentical)
    {    
    System.out.println(fi1.getName()+"<----->"+fi2.getName());
   }
                
}
            }
     }
  }
}

