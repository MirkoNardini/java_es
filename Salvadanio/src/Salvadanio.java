import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Salvadanio {

	//Attributi
	private List<Monete> salvadanaio;
	private Random randomMoneta = new Random();
	private final int SIZE;
	
	//Costruttori
	public Salvadanio() {
		
		SIZE = 10;
		
		salvadanaio = new ArrayList<Monete>(SIZE);
		
	}
	
	
	
}
