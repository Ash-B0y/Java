package multithreaddemo;
 class NewThread implements Runnable {
    String name,winner;
    Thread t;
     static int count=0;
    NewThread(String thrnme)
    {
        name=thrnme;
        t=new Thread(this,name);
        System.out.println("New thread:" +t);
        t.start();
    }   
synchronized public void run()
    {
        try
        {
            for(int i=5;i>0;i--)
            {
              System.out.println("New thread:" +t);
              Thread.sleep(1000);
            }
    }
    
        catch(InterruptedException e)
        {   
        System.out.println(name +" exiting.");
    }       
           System.out.println(name +" Reaches the Finish line");
           if(count==0)
           {
            count++;   
           winner=name;
           System.out.println(winner+" is the winner");
            }
           
 }
    
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread("Player One");
        new NewThread("Player Two");
        new NewThread("Player Three");
        new NewThread("Player Four");
        new NewThread("Player Five");
        try{
            Thread.sleep(1000);
            
        }
          catch(InterruptedException e)
        {
            System.out.println("Main thread Interrupted");
        }
        
        System.out.println("Main thread exiting.");
      
    }
    }
    


    
    

