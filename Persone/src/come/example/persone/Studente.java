package come.example.persone;

public class Studente extends Persone {
	
	//Attributo
	private String università;
		
		
	//Costruttore
	public Studente(String nome, String cognome, int età, String università) {
		
		super(nome, cognome, età);
		this.università = università;
		
	}
	//Metodo Set
	public void setUniversità(String università) {
		
		this.università = università;
	}
	//Metodo Get
	public String getUniversità () {
		
		return this.università;
	}
}
