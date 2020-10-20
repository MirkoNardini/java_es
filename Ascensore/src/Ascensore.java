import java.util.TreeSet;

public class Ascensore {

	Prenotazione prenotazione;
	TreeSet<Prenotazione> prenotazioni = new TreeSet<>();
	

	public void aggiungiPrenotazione(Prenotazione p1) {
		
		prenotazioni.add(p1);
		
	}
	public Prenotazione prossimaPrenotazione() {
		
		Prenotazione p1;
		for(Prenotazione p : prenotazioni) {
			
		}
		return null;
	}
	public void rimuoviPrenotazioni( Prenotazione p1) {
		
		prenotazioni.remove(p1);
	}
}
