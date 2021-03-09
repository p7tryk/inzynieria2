package records;

public class Towary {

	private int id;
	private String producent;
	private String opis;
	private String galeria_zdjec;
	private int ilosc_sprzedanych;
	
	
	public Towary(int id, String producent, String opis, String galeria_zdjec, int ilosc_sprzedanych) {
		super();
		this.id = id;
		this.producent = producent;
		this.opis = opis;
		this.galeria_zdjec = galeria_zdjec;
		this.ilosc_sprzedanych = ilosc_sprzedanych;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getProducent() {
		return producent;
	}
	
	public void setProducent(String producent) {
		this.producent = producent;
	}
	
	public String getOpis() {
		return opis;
	}
	
	public void setOpis(String opis) {
		this.opis = opis;
	}
	
	public String getGaleria_zdjec() {
		return galeria_zdjec;
	}
	
	public void setGaleria_zdjec(String galeria_zdjec) {
		this.galeria_zdjec = galeria_zdjec;
	}
	
	public int getIlosc_sprzedanych() {
		return ilosc_sprzedanych;
	}
	
	public void setIlosc_sprzedanych(int ilosc_sprzedanych) {
		this.ilosc_sprzedanych = ilosc_sprzedanych;
	}
}
