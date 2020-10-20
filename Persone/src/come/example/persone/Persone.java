package come.example.persone;

public class Persone {

	//Attributi
	private String nome;
	private String cognome;
	private int età;
	private String codiceFiscale;
	public boolean isValid = false;
	
	//Costrutti
	public Persone(String nome, String cognome, int età) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.età = età;
		setCF();
	} 
	//Metodo Set
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	//Metodo Get
	public String getNome() {
		
		return this.nome;
	}
	//Metodo Set
	public void setCognome(String cognome) {
		
		this.cognome = cognome;
	}
	//Metodo Get
	public String getCognome(String cognome) {
		
		return this.cognome = cognome;
	}
	//Metodo Set
	public void setCF () {
		
		if(isValid) {
			this.codiceFiscale = nome + cognome + età;
		}
	}

	//Metdo Get
	public String getCF () {
		
		return this.codiceFiscale;
	}
	//Metodo Set
	public void setEtà (int età) {
		
		if(età >= 18) {
			isValid = true;
			this.età = età;
		}else {
			System.err.println("Età non valida");
		}
	}
	//Metodo Get
	public int getEtà () {
		
		return this.età;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codiceFiscale == null) ? 0 : codiceFiscale.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Persone))
			return false;
		Persone other = (Persone) obj;
		if (codiceFiscale == null) {
			if (other.codiceFiscale != null)
				return false;
		} else if (!codiceFiscale.equals(other.codiceFiscale))
			return false;
		return true;
	}
	
	
}
