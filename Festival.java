import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Festival {
	
	private String nazev;
	private String datum;
	
	private Set<Kinosal> kinosaly;
	
	public String getNazev() {
		return nazev;
	}
	public void setNazev(String nazev) {
		this.nazev = nazev;
	}
	public String getDatum() {
		return datum;
	}
	public void setDatum(String datum) {
		this.datum = datum;
	}
	public Festival(String nazev, String datum) {
		super();
		this.nazev = nazev;
		this.datum = datum;
		
		this.kinosaly = new HashSet <>();
	}
	
	public boolean pridatKinosal (Kinosal kinosal) {
		boolean povedlosepridatherce = kinosaly.add(kinosal);
		return povedlosepridatherce;
	}
	public Set<Kinosal> getKinosaly(){
		return kinosaly;
	}
	
	public void vypisKinosaly() {
		
		
		for(Kinosal kinosal : kinosaly) {
			System.out.println(kinosal);
			
		}
		
	}
	@Override
	public String toString() {
		return "Festival [nazev=" + nazev + ", datum=" + datum + ", kinosaly=" + kinosaly + "]";
	}
	
	
	
}
