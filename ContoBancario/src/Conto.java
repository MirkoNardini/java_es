
public class Conto {

	//Attributi
	private double balance;
	
	//Costruttore
	public Conto(double balance) {
		
		this.balance = balance;
	}
	//Costruttore
	public Conto() {
		
		this.balance = 0;
	}
	public void adMoney(double versamento) {
		
		balance = versamento;
	}
	public double ritiraMoney(double ritira) {
		
		if(ritira <= balance) {
			balance -= ritira;
			return ritira;
		}else {
			System.err.println("SEI POVERO COME LA MERDA!");
		}
		return 0;
	}
	public double saldoMoney() {
	
		return balance;	
	}
}
