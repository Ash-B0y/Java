
package nested.pkgtry;

public class NestedTry {
    public static void main(String[] args) {
  try    
{
     int a=1;
    if(a==1)
        a=a/(a-a);
   
    try{
        
    if(a==2)
    {
        int c[]={1};
        c[10]=33;    
    }
}
  catch(ArrayIndexOutOfBoundsException e)
  {
  System.out.println(e);
  }
   catch(ArithmeticException e)
   {
    System.out.println(e);   
   }
}
 
