package com.player.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Player extends Thread{
	
	public static Integer count = 0;
	
	public static ArrayList<String> messageQueue = new ArrayList<>(Arrays.asList("Hi","This is Alan", "Hope you remember me?", "I was your classmate during highschool","We were sitting together","I was at town","I thought we could catch up.","would you be free?","If so","we could meet this Saturday"));

	private String name;
	
	private Message message;

	public Player(String name, Message message) {
		
		super();
		
		this.name = name;
		
		this.message = message;
	}

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			
			if(this.name.equals("Initiator")) {
			
			message.send(Player.messageQueue.get(i));
              
			System.out.println("Message Sent from " + this.name);
			
			try {
				  sleep(5000);
                }
			
			catch (InterruptedException e) {
				
                    e.printStackTrace();
              }
        }
			
		    else {
		    	
		    	System.out.println("Receiver : "+this.name+"\n" +message .receive()); 
		    
		    }
		    	
		    }
  }
		
		
	}
