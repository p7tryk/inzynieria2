package records;

public class TowaryKategorie {

	private int id_towary;
	private int id_kategorie;
	
	
	public TowaryKategorie(int id_towary, int id_kategorie) {
		super();
		this.id_towary = id_towary;
		this.id_kategorie = id_kategorie;
	}

	public int getId_towary() {
		return id_towary;
	}
	
	public void setId_towary(int id_towary) {
		this.id_towary = id_towary;
	}
	
	public int getId_kategorie() {
		return id_kategorie;
	}
	
	public void setId_kategorie(int id_kategorie) {
		this.id_kategorie = id_kategorie;
	}
}
