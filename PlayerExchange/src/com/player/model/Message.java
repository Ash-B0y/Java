package com.player.model;

public class Message {
	
	private String message;
	
	private boolean lock = false;
	
	public synchronized String receive() {
		
		while (!lock) {
			
			try {
				
				wait();
				
			}
			
			catch(InterruptedException e) {
				
				e.printStackTrace();
                 
             }
			
           }
		 
		 lock = false;
		 
		 notifyAll();
           
         return message;
     }
	
	public synchronized void send(String Message) {
		
		while (lock) {
			
			try {
				
				wait();
				
			}
			
			catch (InterruptedException e){
				
				e.printStackTrace();
				
			}
			
           }
           
           Player.count+=1;
           
           message = "Actual Message Received from sender : "+Message +"\nTotal Messages received so far : "+Player.count.toString();
           
           lock = true;
           
           notifyAll();
     }
}
