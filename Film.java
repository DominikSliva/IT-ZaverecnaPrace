import java.util.HashSet;
import java.util.Set;

public class Film {

	private String zanr;
	private String nazev;
	private Set<Herec> herci;
	
	//doba filmù
	private int zacatekHodiny;
	private int zacetekMinuty;
	private int dobaMinuty;
	
	
	public Film(String zanr, String nazev, int zacatekHodiny, int zacatekMinuty, int dobaMinuty) {
		super();
		this.zanr = zanr;
		this.nazev = nazev;
		
		this.dobaMinuty = dobaMinuty;
		this.zacatekHodiny = zacatekHodiny;
		this.zacetekMinuty = zacatekMinuty;
		
		this.herci = new HashSet <>(); 
	}
	
	

	public int getZacatekHodiny() {
		return zacatekHodiny;
	}



	public void setZacatekHodiny(int zacatekHodiny) {
		this.zacatekHodiny = zacatekHodiny;
	}



	public int getZacetekMinuty() {
		return zacetekMinuty;
	}



	public void setZacetekMinuty(int zacetekMinuty) {
		this.zacetekMinuty = zacetekMinuty;
	}



	public int getDobaMinuty() {
		return dobaMinuty;
	}



	public void setDobaMinuty(int dobaMinuty) {
		this.dobaMinuty = dobaMinuty;
	}



	public String getZanr() {
		return zanr;
	}


	public void setZanr(String zanr) {
		this.zanr = zanr;
	}


	public String getNazev() {
		return nazev;
	}


	public void setNazev(String nazev) {
		this.nazev = nazev;
	}
	
	public boolean pridatHerce (Herec herec) {
		boolean povedlosepridatherce = herci.add(herec);
		return povedlosepridatherce;
	}
	public Set<Herec> getHerci(){
		return herci;
	}
	
	public void vypisHerce() {
		for(Herec herec : herci) {
			System.out.println(herec);
			
		}
		
	}



	@Override
	public String toString() {
		return "Film [zanr=" + zanr + ", nazev=" + nazev + ", herci=" + herci + ", zacatekHodiny=" + zacatekHodiny
				+ ", zacetekMinuty=" + zacetekMinuty + ", dobaMinuty=" + dobaMinuty + "]";
	}
	
	
	
}
