package guessthenumber;
import java.util.Random;
import java.util.Scanner;
class TeamParticipation implements Runnable
{
     int random_number;
     static boolean allset=false; 
     static int winner=0;
     Thread[] t;
    TeamParticipation(int number,int no_of_teams)
    {
        random_number=number;
              
         t=new Thread[no_of_teams];
         //creating thread instance based upon number of teams
        for(int i=0;i<no_of_teams;i++)
        {
            t[i]=new Thread(this,"team"+Integer.toString(i+1));
            t[i].start();
        }
       }
    synchronized public void run() {
        //waiting for all the teams to get ready to participate in the event
        while(!allset)
        {
            try{
                wait();
               }
            catch(InterruptedException e)
            {
               System.out.println(e);
            }
        }
        if(allset)
            notify();
        
         System.out.println("\nType your Guess");
         Scanner s=new Scanner(System.in);
         int guess=s.nextInt();
         if(guess>random_number)
          {
           System.out.println(Thread.currentThread().getName()+ " participated - "+ "  Actual Number is lower than your guess");
          }
        else if(guess<random_number)
         {
           System.out.println(Thread.currentThread().getName()+ " participated - "+" Actual Number is greater than your guess");
          }
        else
         {
           System.out.println(Thread.currentThread().getName()+ " participated - "+"  You won the game.Your guess is correct!!!!!");
           winner=1;
          
         }  
         }
}

public class Guessthenumber {
public static void main(String[] args) {
        // Random Number Generation 
        Random r= new Random();
        int n=r.nextInt(100);
        Scanner s1=new Scanner(System.in);
        System.out.println("\nEnter number of teams to participate");
        int no_of_teams=s1.nextInt();
        System.out.println("\nGuess the number between 0 to 100: Your Count starts now");
        TeamParticipation teams=new TeamParticipation(n,no_of_teams);
        TeamParticipation.allset=true;
        //Waiting for all the teams to take their turns
        for(int j=0;j<no_of_teams;j++)
        {
            try
            {
            teams.t[j].join();
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
           
        }
        if(TeamParticipation.winner==0)
        {
            System.out.println("\n\nSorry...None of the teams have given correct guess\n "+" Actual number is "+n);
        }     
        
       
    }
}

