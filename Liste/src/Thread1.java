
public class Thread1 extends Thread {

	
	@Override
	public void run() {
		
		Lista lista = new Lista();
		
		synchronized (lista) {
			lista.listAddElement();
		}
	}
}
