package come.example.persone;

public class Studente extends Persone {
	
	//Attributo
	private String universitÓ;
		
		
	//Costruttore
	public Studente(String nome, String cognome, int etÓ, String universitÓ) {
		
		super(nome, cognome, etÓ);
		this.universitÓ = universitÓ;
		
	}
	//Metodo Set
	public void setUniversitÓ(String universitÓ) {
		
		this.universitÓ = universitÓ;
	}
	//Metodo Get
	public String getUniversitÓ () {
		
		return this.universitÓ;
	}
}
