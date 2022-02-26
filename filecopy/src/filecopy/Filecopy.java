
package filecopy;
import java.io.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 

public class Filecopy {
     public static void main(String args[]) {
    FileReader fr = null;
    FileWriter fw = null;
   
         try
         {
           fr=new FileReader("C:\\Users\\Vel\\Desktop\\files\\bac.txt");
           fw=new FileWriter("C:\\Users\\Vel\\Desktop\\files\\ban.txt");
          int d=-1,c=fr.read();
          while(c!=-1) 
          {
              if(c!=d)
                 fw.write(c);
              d=c;
             c=fr.read();
    
          }
          fr.close();
          fw.close();
      } 
      catch(IOException e) 
      {
          System.out.println(e);
      }
    
    }}
