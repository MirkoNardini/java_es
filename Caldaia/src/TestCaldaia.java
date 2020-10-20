
public class TestCaldaia {

	/*Scrivi una classe per modellare una caldaia: la caldaglia può essere accesa/spenta;
	 * salva la temperatura dell'acqua.
	 * 
	 * lo stato iniziale è spenta (25°)
	 * Crea metodi per:
	 * 
	 * accendere e spegnere la caldaia
	 * aumentare e diminuire la caldaia (definire più metodi).
	 */
	public static void main(String[] args) {

		//Creo una nuova Caldaia
		Caldaia caldaia1 = new Caldaia();
		
		//Accensione caldaia
		caldaia1.accesa();
		
		//Stato della caldaglia
		caldaia1.statoCaldaia();
		
		//Alzo la temperatura di un grado
		caldaia1.incrementoTemperatura();
		System.out.println(caldaia1.getTemperatura());

		//Provo ad aumentare un dato valore
		caldaia1.incrementoTemperaturaDiUnCertoValore(5);
		System.out.println(caldaia1.getTemperatura());
		
		//Abbasso la temperatura di un grado
		caldaia1.decremententoTemperatura();
		System.out.println(caldaia1.getTemperatura());
		
		//Provo ad abbassare la temperatura di un dato valore
		caldaia1.decrementoTemperaturaDiUnCertoValore(5);
		System.out.println(caldaia1.getTemperatura());
		
		//Spengimento caldaia
		caldaia1.spenta();
		//vediamo se la caldaia si è spenta
		caldaia1.statoCaldaia();
		
		/*Dato il codice dell'esercizio Caldaia A, aggiungere un metodo stampa
			• non restituisce nulla: void
			• stampa lo stato della caldaia e la temperatura
			Stato: accesa. Temperatura: 37.
		*/
		
		//Creiamo una nuova caldaglia
		Caldaia caldaia2 = new Caldaia();
		//Accendiamo la caldaia 
		caldaia2.accesa();
		//Vediamo se si è accesa
		caldaia2.statoCaldaia();
		
		//Incrementiamo la temperatura di valore x
		caldaia2.incrementoTemperaturaDiUnCertoValore(2);
		
		//vediamo a che grado si trova la nostra caldaia
		caldaia2.stampaStatoAttuale();
	}//Chiusura Main

}//Chiusura Classe
