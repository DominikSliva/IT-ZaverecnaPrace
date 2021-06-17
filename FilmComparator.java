import java.util.Comparator;

public class FilmComparator implements Comparator<Film> {

	@Override
	public int compare(Film film1, Film film2) {
	return film1.getZacatekHodiny() * 60 + film1.getZacetekMinuty() - (film2.getZacatekHodiny() * 60 + film2.getZacetekMinuty());
		
		
		
		

	}

}
