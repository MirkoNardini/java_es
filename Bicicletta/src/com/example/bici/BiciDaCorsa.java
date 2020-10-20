package com.example.bici;

public class BiciDaCorsa extends Bicicletta {
	
	//Attributi
	boolean manubrio;
	boolean telaio;
	
	//Costruttori
	public BiciDaCorsa (boolean manubrio, boolean telaio) {
		
		super(2,1,2);
		this.manubrio = manubrio;
		this.telaio = telaio;
	}
	//
	public boolean getManubrio() {
		
		return manubrio;
	}
	public boolean getTelaio() {
		
		return telaio;
	}
	
}
