package com.player.application;

import com.player.model.Message;
import com.player.model.Player;

public class PlayerApplication {

	public static void main(String[] args) {
		
		Message message = new Message();
		
		Player player1 = new Player("Initiator", message);
		
		Player player2 = new Player("Reciprocator", message);
		
		player1.start();
		
		player2.start();

	}

}
