package com.danozzo.cardgame.games;

import com.danozzo.cardgame.controller.GameController;
import com.danozzo.cardgame.model.Deck;
import com.danozzo.cardgame.view.View;

public class Games {

	public static void main(String[] args) {
		GameController gc = new GameController(new Deck(), new View());
		gc.run();

	}

}
