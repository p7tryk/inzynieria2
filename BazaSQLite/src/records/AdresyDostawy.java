package records;

public class AdresyDostawy {
	
	private int id;
	private int id_zamowienia;
	private String kraj;
	private String miejscowosc;
	private String ulica;
	private String mieszkanie;
	private String kod_pocztowy;
	
	
	public AdresyDostawy(int id, int id_zamowienia, String kraj, String miejscowosc, String ulica, String mieszkanie,
			String kod_pocztowy) {
		super();
		this.id = id;
		this.id_zamowienia = id_zamowienia;
		this.kraj = kraj;
		this.miejscowosc = miejscowosc;
		this.ulica = ulica;
		this.mieszkanie = mieszkanie;
		this.kod_pocztowy = kod_pocztowy;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId_zamowienia() {
		return id_zamowienia;
	}
	
	public void setId_zamowienia(int id_zamowienia) {
		this.id_zamowienia = id_zamowienia;
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
	
}
