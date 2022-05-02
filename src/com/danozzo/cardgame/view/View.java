package com.danozzo.cardgame.view;

import java.util.Scanner;

import com.danozzo.cardgame.controller.GameController;

public class View {
	
	GameController controller;
	
	Scanner keyboard = new Scanner(System.in);

	public void setController(GameController gc) {
		this.controller = gc;
	};

	public void promptForPlayerName() {
		System.out.println("Enter Player Name:");
		String name = keyboard.nextLine();
		if(name.isEmpty()) {
			controller.startGame();
		}else {
			controller.addPlayer(name);
		}
	}

	public void promptForFlip() {
	}

	public void promptForNewGame() {
	}
	
	public void showWinner(String name) {
			}

	public void showPlayerName(int size, String playerName) {
	}

	public void showFaceDownCardPlayer(int i, String name) {
	}

	public void showCardForPlayer(int i, String name, String string, String string2) {
	}
}
