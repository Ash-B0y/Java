package com.player.application;

import com.player.model.Message;
import com.player.model.Player;

public class PlayerApplication {

	public static void main(String[] args) {
		
		Message message = new Message();
		
		Player p1 = new Player("Initiator", message);
		
		Player p2 = new Player("Reciprocator", message);
		
		
		p1.start();
		
		p2.start();
		
		

	}

}
