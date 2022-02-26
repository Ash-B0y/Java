/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplayer;
import java.util.Scanner;
/**
 *
 * @author 13bcs27
 */
        
class player implements Runnable 
{
    int count,team,goal;
    Thread[] t;
    static int win=0,check=0;
    
    player(int p,int t_no,Thread x)
    {
        count=0;
        goal=1000*p;
        team=t_no;
        t=new Thread[p];
        for(int i=0;i<p;i++)
        {
            t[i]=new Thread(this,Integer.toString(i+1));
            t[i].start();
        }
       
    }
    
    synchronized public void run()
    {
        while(check==0);
        while(++count%1000!=0);
        System.out.println("Team "+team+" player "+Thread.currentThread().getName()+" reached "+count+" metres.");
        if(count==goal)
            result(team);         
    }
    
    
    synchronized static void result(int x)
    {
        if(win==0)
            win=x;
    }
}

    /**
     * @param args the command line arguments
     */
public class Multiplayer
{

    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner n=new Scanner(System.in);
        Thread m=Thread.currentThread();
        System.out.print("Enter the number of teams : ");
        int t=n.nextInt();
        System.out.print("Enter the number of players in each team : ");
        int p_no=n.nextInt();
        
        player[] p;
        p = new player[t];
        
        for(int i=0;i<t;i++)
            p[i]=new player(p_no,i+1,m);
        
        player.check=1;
        for(int i=0;i<t;i++)
            for(int j=0;j<p_no;j++)
                try
                {
                    p[i].t[j].join();
                }
                catch(InterruptedException | NullPointerException e)
                {
                }
        System.out.println("Team "+player.win+" won the game.");
    }
    
}