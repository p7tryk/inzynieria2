package records;

public class Klienci {
	
	private int id;
	private String imie;
	private String nazwisko;
	private String kraj;
	private String miejscowosc;
	private String ulica;
	private String mieszkanie;
	private String kod_pocztowy;
	private String numer_tel;
	private String email;
	
	
	public Klienci(int id, String imie, String nazwisko, String kraj, String miejscowosc, String ulica,
			String mieszkanie, String kod_pocztowy, String numer_tel, String email) {
		super();
		this.id = id;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.kraj = kraj;
		this.miejscowosc = miejscowosc;
		this.ulica = ulica;
		this.mieszkanie = mieszkanie;
		this.kod_pocztowy = kod_pocztowy;
		this.numer_tel = numer_tel;
		this.email = email;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getImie() {
		return imie;
	}
	
	public void setImie(String imie) {
		this.imie = imie;
	}
	
	public String getNazwisko() {
		return nazwisko;
	}
	
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	
	public String getKraj() {
		return kraj;
	}
	
	public void setKraj(String kraj) {
		this.kraj = kraj;
	}
	
	public String getMiejscowosc() {
		return miejscowosc;
	}
	
	public void setMiejscowosc(String miejscowosc) {
		this.miejscowosc = miejscowosc;
	}
	
	public String getUlica() {
		return ulica;
	}
	
	public void setUlica(String ulica) {
		this.ulica = ulica;
	}
	
	public String getMieszkanie() {
		return mieszkanie;
	}
	
	public void setMieszkanie(String mieszkanie) {
		this.mieszkanie = mieszkanie;
	}
	
	public String getKod_pocztowy() {
		return kod_pocztowy;
	}
	
	public void setKod_pocztowy(String kod_pocztowy) {
		this.kod_pocztowy = kod_pocztowy;
	}
	
	public String getNumer_tel() {
		return numer_tel;
	}
	
	public void setNumer_tel(String numer_tel) {
		this.numer_tel = numer_tel;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
}
