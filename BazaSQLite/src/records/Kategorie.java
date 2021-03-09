package records;

public class Kategorie {
	
	private int id;
	private String kategoria;
	
	
	public Kategorie(int id, String kategoria) {
		super();
		this.id = id;
		this.kategoria = kategoria;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getKategoria() {
		return kategoria;
	}
	
	public void setKategoria(String kategoria) {
		this.kategoria = kategoria;
	}
}
