
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Herec novak = new Herec("Jan", "Novák");
		Herec novakova = new Herec("Anna", "Nováková");
		
		Film pelisky = new Film("Komedie", "Pelíšky", 8, 0, 120);
		Film obecnaSkola = new Film("Rodinný", "Obecná škola", 10, 15, 115);
		Film paniKluci = new Film("Dobrodružný", "Páni kluci", 12, 0, 90);
		
		pelisky.pridatHerce(novakova);
		pelisky.pridatHerce(novak);
		
		Kinosal rodinny = new Kinosal(1);
		
		rodinny.pridatFilm(paniKluci);
		rodinny.pridatFilm(pelisky);
		rodinny.pridatFilm(obecnaSkola);
	//	rodinny.vypisFilm();
		
		Festival ceskyFilmovyFestival = new Festival ("Èeský filmový festival", "07.07.2021");
		
	
		ceskyFilmovyFestival.pridatKinosal(rodinny);
		ceskyFilmovyFestival.vypisKinosaly();
		System.out.println(ceskyFilmovyFestival);
		
		// vypisHerce(pelisky);
		//pelisky.vypisHerce();
		
	}
	
/*	public static void vypisHerce(Film film) {
		for(Herec herec : film.getHerci()) {
			System.out.println(herec);	
		}	
	} */

}
