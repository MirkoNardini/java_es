package come.example.persone;

public class Studente extends Persone {
	
	//Attributo
	private String universit�;
		
		
	//Costruttore
	public Studente(String nome, String cognome, int et�, String universit�) {
		
		super(nome, cognome, et�);
		this.universit� = universit�;
		
	}
	//Metodo Set
	public void setUniversit�(String universit�) {
		
		this.universit� = universit�;
	}
	//Metodo Get
	public String getUniversit� () {
		
		return this.universit�;
	}
}
