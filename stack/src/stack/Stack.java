
package stack;
interface pap 
{
    void push(int a) throws overflowException ;
    int pop()throws underflowException;
}

class overflowException extends Exception
{
    @Override
    public String toString()
    {
        return"The stack is full and no more element can be inserted.....";
    }
}
class underflowException extends Exception
{
    @Override
    public String toString()
    {
        return"The stack is empty and no more element can be popped.....";
    }
}
   
public class Stack implements pap 
    {
       int sckar[],top=-1;
        Stack(int size)
        {
          sckar=new int[size];
     
        }

   
    @Override
        public void push(int a) throws overflowException 
       {    
           if(top==sckar.length-1) 
               throw new overflowException();
             else
             sckar[++top]=a;
            }  
      
    
      
       @Override
    public int pop()throws underflowException 
       {  
           if(top<0)
           throw new underflowException();
           else    
           return sckar[top--];
           
             }
   
    public static void main(String[] args){
    Stack s=new Stack(5);
    try
    {
     for(int i=0;i<=5;i++)
     s.push(i);   
    }
    catch(overflowException e)
            {       
     System.out.println(e);
            }
    try{
        for(int i=0;i<=5;i++)
     System.out.println(s.pop()); 
    }
    catch(underflowException e)
            {       
     System.out.println(e);
            }
    }
}

    