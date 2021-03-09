package records;

public class Zamowienia {

	private int id;
	private int cena_dostawy;
	private String data_zamowienia;
	private String status;
	private int darmowy_zwrot;
	private int numer_faktury;
	private int id_klienci;
	private int id_pracownicy;
	
	
	public Zamowienia(int id, int cena_dostawy, String data_zamowienia, String status, int darmowy_zwrot,
			int numer_faktury, int id_klienci, int id_pracownicy) {
		super();
		this.id = id;
		this.cena_dostawy = cena_dostawy;
		this.data_zamowienia = data_zamowienia;
		this.status = status;
		this.darmowy_zwrot = darmowy_zwrot;
		this.numer_faktury = numer_faktury;
		this.id_klienci = id_klienci;
		this.id_pracownicy = id_pracownicy;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCena_dostawy() {
		return cena_dostawy;
	}
	public void setCena_dostawy(int cena_dostawy) {
		this.cena_dostawy = cena_dostawy;
	}
	public String getData_zamowienia() {
		return data_zamowienia;
	}
	public void setData_zamowienia(String data_zamowienia) {
		this.data_zamowienia = data_zamowienia;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getDarmowy_zwrot() {
		return darmowy_zwrot;
	}
	public void setDarmowy_zwrot(int darmowy_zwrot) {
		this.darmowy_zwrot = darmowy_zwrot;
	}
	public int getNumer_faktury() {
		return numer_faktury;
	}
	public void setNumer_faktury(int numer_faktury) {
		this.numer_faktury = numer_faktury;
	}
	public int getId_klienci() {
		return id_klienci;
	}
	public void setId_klienci(int id_klienci) {
		this.id_klienci = id_klienci;
	}
	public int getId_pracownicy() {
		return id_pracownicy;
	}
	public void setId_pracownicy(int id_pracownicy) {
		this.id_pracownicy = id_pracownicy;
	}
}
