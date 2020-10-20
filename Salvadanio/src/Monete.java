
public class Monete {

	//Attributi
	private int moneta;
	private boolean moneteNeAbbiamo = false;
	private int accumulatore = 0;
	
	//Costruttori
	public void Moneta (int moneta, boolean moneteNeAbbiamo, int accumulatore) {
		
		this.moneta = moneta;
		this.moneteNeAbbiamo = moneteNeAbbiamo;
		this.accumulatore = accumulatore;		
	}
	//Metodo set
	private void setMoneta(int moneta) {
		
		if(moneta != 0) {
			switch(moneta) {
			case 10:
			case 20:
			case 50:
			case 100:
			case 200:
			default: System.err.println("Errore il valore inserito non è calcolato come momenta");
			}
			
		}
	}
	//Metodo get
	public int getMonete() {
		
		return this.moneta;
	}
	//Metodo set
		public void setMoneteNeAbbiamo(boolean moneteNeAbbiamo) {
			
			if(moneteNeAbbiamo == true) {
			 this.moneteNeAbbiamo = true;
			}
			this.moneteNeAbbiamo = moneteNeAbbiamo;
			
	}
	//Metodo get
	public boolean getMoneteNeAbbiamo() {
			
		return this.moneteNeAbbiamo;
	}	
	//Metodo set
	public void setAccumulatore(int accumulatore) {
				
		this.accumulatore = accumulatore;		
	}
	//Metodo get
			public int getAccumulatore() {
				
				return this.accumulatore;
			}
		
}

