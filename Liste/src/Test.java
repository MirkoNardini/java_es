
public class Test {
	
	/*
	 * • Due thread condividono una lista
	   • Se questi thread operano sulla lista sia aggiungendo che togliendo
			elementi si rischiano diversi bug che possono mandare in errore uno
	   o entrambi i thread
	   • Vogliamo quindi poter gestire la concorrenza utilizzando gli strumenti
			che abbiamo a disposizione.
	   • Ci sono diversi modi per risolvere questo problema, scegliete quello che vi ispira di più!

	 */

	public static void main(String[] args) {

		Lista lista3 = new Lista();
		
		Thread1 th1 = new Thread1();
		Thread2 th2 = new Thread2();
		
		lista3.listAddElement();
		System.out.println("\n");
		lista3.removeElement(0);
		th1.run();
		try {
			th1.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	    
		th2.run();
		
	}

}
