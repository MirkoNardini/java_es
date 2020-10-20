package com.example.bici;

public class MountainByke extends Bicicletta {
	
	//Attributi
	private int ammortizatori;
	private int marce;
	private boolean luce;
	
	//Costruttori
	public MountainByke (int ammortizatori, int marce, boolean luce) {
		
		super(2,1,2);
		this.ammortizatori = ammortizatori;
		this.marce = marce;
		this.luce = true;
	}
	public int getAmmortizzatori() {
		
		return this.ammortizatori;
	}
	public int getMarce() {
		
		return this.marce;
	}
	public boolean getLuce() {
		
		return this.luce;
	}
	public boolean statoLuce() {
		
		if(luce == true) {
			
			return this.luce;
		}else {
			return false;
		}
		}
	public boolean luceAccesa () {
		
		return this.luce = true;
	}
	public boolean luceSpenta() {
		
		return this.luce = false;
	}
		
	
}
	