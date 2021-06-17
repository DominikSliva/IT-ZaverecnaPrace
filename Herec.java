
public class Herec {

	private String jmeno;
	private String prijmeni;
	
	
	public String getJmeno() {
		return jmeno;
	}
	public void setJmeno(String jmeno) {
		this.jmeno = jmeno;
	}
	public String getPrijmeni() {
		return prijmeni;
	}
	public void setPrijmeni(String prijmeni) {
		this.prijmeni = prijmeni;
	}
	
	
	public Herec(String jmeno, String prijmeni) {
		super();
		this.jmeno = jmeno;
		this.prijmeni = prijmeni;
	}
	
	
	@Override
	public String toString() {
		return "Herec [jmeno=" + jmeno + ", prijmeni=" + prijmeni + "]";
	}
	
}
