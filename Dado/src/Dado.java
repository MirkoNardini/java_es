import java.util.Random;

public class Dado {
	//Attributi
	private int dado;
	
	public Dado(int dado) {
		
		this.dado = dado;
	}
	public int getDado() {
		
		return dado;
	}
	public int lancio() {
		
		Random r1 = new Random();
		int lancio = r1.nextInt(dado - 1) + 1;
		return lancio;
	}
	
}
