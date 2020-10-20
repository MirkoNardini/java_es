package come.example.persone;

public class Esame {

	//Attributi
	private Studente student;
	private Corso corse;
	private int voto;
	private boolean votoRegistrato = false;

	//Costruttori
	public Esame (Studente student, Corso corse) {
		
		this.student = student;
		this.corse = corse;
	}
	//Metodo Set
	public void setStudent(Studente student) {
		
		this.student = student;
	}
	//Metodo Get
	public Studente getStudent() {
		
		return this.student;
	}
	//Metodo Set
	public void setCorso(Corso corse) {
		
		this.corse = corse;
	}
	//Metodo Get
	public Corso getCorso() {
		
		return this.corse;
	}
	public void setVoto ( int voto) {
		
		this.voto = voto;
	}
	//Metodo Get
	public int getVoti () {
		
		return this.voto;
	}
	//Metodo Sostieni
	public void sostieni (int voto) {
		
		if(votoRegistrato == false) {
			
			setVoto(voto);
			System.out.println("il voto è stato registrato " + voto);
		}else {
			System.out.println("Il voto non è stato registrato");
		}
	}
	//Metodo set
	public void setRegistra (boolean votoRegistrato) {
		
		this.votoRegistrato = votoRegistrato;
	}
	//Metodo Get
	public boolean getRegistra () {
		
		return this.votoRegistrato;
	}
	//Metodo Regista
	public void registra () {
		
		if(voto >= 18) {
			votoRegistrato = true;
			System.out.println("Punteggio voto sufficente");
		}else {
			System.err.println("Punteggio voto non sufficente");
		}
	}
		
	
}
