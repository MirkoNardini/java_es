package come.example.persone;

public class Corso {

	//Attributi
	private String nomeCorso;
	private int numeroCreidti;
	
	//Costruttore
	public Corso (String nomeCorso ,int numeroCrediti) {
		
		this.nomeCorso = nomeCorso;
		this.numeroCreidti = numeroCrediti;
	}
	//Metodo Set
	public void setNomeCorso(String nomeCorso) {
		
		this.nomeCorso = nomeCorso;
	}
	//Metodo Get
	public String nomeCorso() {
		
		return this.nomeCorso;
	}
	//Metodo Set
	public void setNumeroCrediti(int numeroCrediti) {
		
		this.numeroCreidti = numeroCrediti;
	}
	//Metodo Get
	public int getNumeroCrediti() {
		
		return this.numeroCreidti;
	}
}

