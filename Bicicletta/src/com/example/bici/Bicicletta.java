package com.example.bici;

public class Bicicletta {
	
	//Attributi
	private int ruote;
	private int sellino;
	private int freni;
	
	//Costruttori
	public Bicicletta(int r, int s, int f) {
		
		this.ruote = r;
		this.sellino = s;
		this.freni = f;
	}
	//Facciamo un metodo get per richiamare le ruote
	public int getRuote () {
		
		return this.ruote;
	}
	//Facciamo un metodo get per richiamare il sellino
	public int getSellino () {
		
		return this.sellino;
	}
	//Facciamo un metodo get per richiamare i freni
	public int getFreni () {
		
		return this.freni;
	}
	

}
