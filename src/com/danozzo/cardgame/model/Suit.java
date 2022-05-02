package com.danozzo.cardgame.model;

public enum Suit {
	DIAMONDS(1), HEARTS(2), SPADES(3), CLUB(4);
	
	int suit;
	/**
	 * faccio corrispondere un intero ad un seme e inversamente
	 * @param value
	 */
	private Suit(int value) {
		suit = value;
	}
	
	public int value() {
		return suit;
	}
	
}
