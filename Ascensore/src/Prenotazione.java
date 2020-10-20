import java.util.ArrayList;
import java.util.List;

public class Prenotazione implements Comparable <Prenotazione> {
	
	int iD;
	List<Persone> list = new ArrayList<>();
	int piano;
	
	public Prenotazione(int iD,List<Persone> a, int piano) {
		
		this.iD = iD;
		this.list = a;
		this.piano = piano;
	}
	/**
	 * @return the iD
	 */
	public int getiD() {
		return iD;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setiD(int iD) {
		this.iD = iD;
	}
	/**
	 * @return the list
	 */
	public List<Persone> getList() {
		return list;
	}
	/**
	 * @param list the list to set
	 */
	public void setList(List<Persone> list) {
		this.list = list;
	}
	/**
	 * @return the piano
	 */
	public int getPiano() {
		return piano;
	}
	/**
	 * @param piano the piano to set
	 */
	public void setPiano(int piano) {
		this.piano = piano;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + iD;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Prenotazione))
			return false;
		Prenotazione other = (Prenotazione) obj;
		if (iD != other.iD)
			return false;
		return true;
	}
	@Override
	public int compareTo(Prenotazione o) {
		
		return Integer.compare(this.iD, o.iD);
	}
}
