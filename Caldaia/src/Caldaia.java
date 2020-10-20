
public class Caldaia {

	//Attributi
	private int temperatura;
	private boolean stato;
	
	//Costruttori
	public Caldaia () {
		
		this.stato = false;
		temperatura = 25;
	}
	//2 Costruttore (input)
	public Caldaia(boolean stato, int temperatura) {
		
		this.temperatura = 25;
		this.stato = stato;
		
		if(stato == true) {
			System.out.println("Caldaglia Accesa!");
		}else {
			System.err.println("ATTENZIONE la Caldaia è Spenta!");
		}
	}
	//Creo un metodo di accenzione
	public void accesa () {
		
		this.stato = true;
	}
	//Metodo per spegnere la caldaia
	public void spenta () {
		
		this.stato = false;
	}
	//Metodo per get per vedere la temperatura
	public int getTemperatura() {
		
		return this.temperatura;
	}
	//Metodo per alzare la temperatura
	public void incrementoTemperatura() {
		
		this.temperatura++;
	}
	//Metodo Per alzare la temperatura di un certo valore
	public void incrementoTemperaturaDiUnCertoValore (int val) {
		
		this.temperatura += val;
	}
	//abbasso la temperatura di un certo valore
	public void decrementoTemperaturaDiUnCertoValore (int val) {
		
		this.temperatura -= val;
	}
	//abbasso la temperatura di un grado
	public void decremententoTemperatura() {
 
			temperatura--;
	}
	//controllo lo stato della caldaia
	public boolean statoCaldaia() {
	
		if(stato == true) {
			System.out.println("Caldaia Accesa!");
		}else {
			System.err.println("ATTENZIONE la Caldaia è Spenta!");
		}
		return stato;
	}
	//Stampo la temperatura attuale delle caldaglia
	public void stampaStatoAttuale () {
		
		//richiamo il metodo per verificare che lo stato della caldaia
		statoCaldaia();
		System.out.println("La Temperatura è: " + temperatura);
	}

}//Chiusura CLasse



