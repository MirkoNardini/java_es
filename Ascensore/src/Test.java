import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		Persone mario = new Persone("mario", Sesso.UOMO);
		Persone giacomo = new Persone("giacomo", Sesso.UOMO);
		List<Persone> utenti1 = new ArrayList<>();
		utenti1.add(mario);
		utenti1.add(giacomo);
		Prenotazione p1 = new Prenotazione(1, utenti1, 2);
		 
		List<Persone> utenti2 = new ArrayList<>();
		Persone mattia = new Persone("mattia", Sesso.UOMO);
		utenti1.add(mattia);
		Prenotazione p2 = new Prenotazione(2, utenti2, 5);
		 
		Persone marco = new Persone("marco", Sesso.UOMO);
		Persone antonio = new Persone("antonio", Sesso.UOMO);
		Persone maria = new Persone("maria", Sesso.DONNA);
		List<Persone> utenti3 = new ArrayList<>();
		utenti3.add(marco);
		utenti3.add(antonio);
		utenti3.add(maria);
		Prenotazione p3 = new Prenotazione(3, utenti3, 10);
		 
		Ascensore ascensore = new Ascensore();
		ascensore.aggiungiPrenotazione(p1);
		ascensore.aggiungiPrenotazione(p2);
		ascensore.aggiungiPrenotazione(p3);
		Prenotazione prossima = ascensore.prossimaPrenotazione();
		System.out.println(prossima.getiD() == 3);
		 
		prossima = ascensore.prossimaPrenotazione();

	}

}
