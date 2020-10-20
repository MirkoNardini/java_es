
public class harrysChecking {

	public static void main (String args[]) {
		
		Conto uno = new Conto();
		
		uno.adMoney(1000);
		
		System.out.println(uno.saldoMoney());
		
		uno.ritiraMoney(500);
		
		System.out.println(uno.saldoMoney());
		
		uno.ritiraMoney(400);
		
		System.out.println(uno.saldoMoney());
		
		uno.ritiraMoney(200);
		
		System.out.println(uno.saldoMoney());
	}
}
