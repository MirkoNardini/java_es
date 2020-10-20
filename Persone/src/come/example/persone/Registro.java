package come.example.persone;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;

public class Registro {

	public Set<Studente> listStudenti = new HashSet<Studente>();
	public Set<Corso> listCorso = new HashSet<Corso>();
	public Set<Esame> listEsame = new HashSet<Esame>();
	public List<Studente> listmedia27 = new ArrayList<Studente>();
	
	public float mediaVoti(Studente studente) {
		float mediaVoti;
		int totVoti = 0;
		int contatoreEsami = 0;
		for (Esame esame : listEsame) {
			if (esame.getStudent().equals(studente)) {
				totVoti += esame.getVoti();
				contatoreEsami++;
			}
		}
		mediaVoti = (totVoti / contatoreEsami);
		return mediaVoti;
	}
	//Metodo
	public void under25() {
		
		int totVoti= 0;
		int contatoreVoti= 0;
		for(Studente student : listStudenti) {
			if(student.getEtà() < 25) {
				for(Esame esami : listEsame ) {
					if(esami.getStudent().equals(student)) {
						
						totVoti += esami.getVoti();
						contatoreVoti++;
					}
				}	
			}
			System.out.println(student.getNome());
			System.out.println((float) totVoti/contatoreVoti);
			System.out.println(contatoreVoti);
		}
		
	}
	public void under27(){
		
		for(Studente studenti : listStudenti) {
			if(studenti.getEtà() > 23 && studenti.getEtà() < 27) {
				
				listStudenti.add(studenti);
			}
		}
	}
}
