import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kinosal {

	int poradoveCislo;
	
	private List<Film> filmy;
	

	public Kinosal(int poradoveCislo) {
		super();
		this.poradoveCislo = poradoveCislo;
		
		this.filmy = new ArrayList<> ();
	}


	public int getPoradoveCislo() {
		return poradoveCislo;
	}


	public void setPoradoveCislo(int poradoveCislo) {
		this.poradoveCislo = poradoveCislo;
	}
	public boolean pridatFilm (Film film) {
		boolean povedlosepridatherce = filmy.add(film);
		return povedlosepridatherce;
	}
	public List<Film> getFilmy(){
		return filmy;
	}
	
	public void vypisFilm() {
		Collections.sort(filmy, new FilmComparator());
		
		for(Film film : filmy) {
			System.out.println(film);
			
		}
		
	}


	@Override
	public String toString() {
		return "Kinosal [poradoveCislo=" + poradoveCislo + ", filmy=" + filmy + "]";
	}
	
	
	
}
