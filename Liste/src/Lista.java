import java.util.ArrayList;
import java.util.List;

public class Lista {

	private List<Integer> listaThread = new ArrayList<Integer>();
	
	
	//Metodo list
	public void listAddElement() {
		
		//synchronized (this) {
		for(int i = 0; i < 100; i++) {
		
		listaThread.add(i);	
		System.out.print(i);
		}
	 //}
	}
	//Metodo togliLista
	public void removeElement(int index) {
		
		//synchronized (this) {
		listaThread.remove(index);
		for(int element : listaThread) {
		System.out.print(element + " ");
		}
		//}
	}
	// @return the listaThread
	public List<Integer> getListaThread() {
		return listaThread;
	}
	 // @param listaThread the listaThread to set

	public void setListaThread(List<Integer> listaThread) {
		this.listaThread = listaThread;
	}
	
}
