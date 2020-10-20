
public class Persone {

	String nome;
	Sesso sesso;
	
	public Persone(String nome, Sesso sesso) {
		
		this.nome = nome;
		this.sesso = sesso;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the sesso
	 */
	public Sesso getSesso() {
		return sesso;
	}

	/**
	 * @param sesso the sesso to set
	 */
	public void setSesso(Sesso sesso) {
		this.sesso = sesso;
	}
	
}
