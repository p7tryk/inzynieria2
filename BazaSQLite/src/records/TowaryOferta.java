package records;

public class TowaryOferta {

	private int id;
	private int ilosc_dostepnych;
	private int cena;
	private int promocja_cena;
	private int promocja_ilosc;
	private String promocja_poczatek;
	private String promocja_koniec;
	private int id_towary;
	
	
	public TowaryOferta(int id, int ilosc_dostepnych, int cena, int promocja_cena, int promocja_ilosc,
			String promocja_poczatek, String promocja_koniec, int id_towary) {
		super();
		this.id = id;
		this.ilosc_dostepnych = ilosc_dostepnych;
		this.cena = cena;
		this.promocja_cena = promocja_cena;
		this.promocja_ilosc = promocja_ilosc;
		this.promocja_poczatek = promocja_poczatek;
		this.promocja_koniec = promocja_koniec;
		this.id_towary = id_towary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIlosc_dostepnych() {
		return ilosc_dostepnych;
	}
	public void setIlosc_dostepnych(int ilosc_dostepnych) {
		this.ilosc_dostepnych = ilosc_dostepnych;
	}
	public int getCena() {
		return cena;
	}
	public void setCena(int cena) {
		this.cena = cena;
	}
	public int getPromocja_cena() {
		return promocja_cena;
	}
	public void setPromocja_cena(int promocja_cena) {
		this.promocja_cena = promocja_cena;
	}
	public int getPromocja_ilosc() {
		return promocja_ilosc;
	}
	public void setPromocja_ilosc(int promocja_ilosc) {
		this.promocja_ilosc = promocja_ilosc;
	}
	public String getPromocja_poczatek() {
		return promocja_poczatek;
	}
	public void setPromocja_poczatek(String promocja_poczatek) {
		this.promocja_poczatek = promocja_poczatek;
	}
	public String getPromocja_koniec() {
		return promocja_koniec;
	}
	public void setPromocja_koniec(String promocja_koniec) {
		this.promocja_koniec = promocja_koniec;
	}
	public int getId_towary() {
		return id_towary;
	}
	public void setId_towary(int id_towary) {
		this.id_towary = id_towary;
	}
}
