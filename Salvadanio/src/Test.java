
public class Test {
	
	/*Esercizio salvadanaio virtuale
	• Creiamo un oggetto Salvadanaio virtuale e riempiamolo di moltemonete generate in maniera casuale (il tutto in maniera causale)
	• Apriamo il salvadanaio (ergo, prendiamo la lista di monete), dividiamo la lista in due parti e assegniamo la seconda parte di lista ad un
		thread.
	• Contiamo quindi l’importo totale delle monete sia nel thread principale che in quello secondario e stampiamo a schermo il risultato
	• Con le istruzioni per calcolare il tempo, guardiamo quanto tempo ci mette il nostro programma nell’eseguire l’operazione sia utilizzando la
		programmazione parallela che quella secondaria.
    */
	public static void main(String[] args) {
		
		Monete moneta = new Monete();
		
		moneta.getMonete();

	}

}
