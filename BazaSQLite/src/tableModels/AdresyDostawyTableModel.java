package tableModels;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import records.AdresyDostawy;

public class AdresyDostawyTableModel extends AbstractTableModel {

	private String[] columns = { "id", "id_zamowienia", "kraj", "miejscowosc", "ulica", "mieszkanie", "kod_pocztowy" };
	private List<AdresyDostawy> adresyDostawy;
	
	public AdresyDostawyTableModel(List<AdresyDostawy> adresyDostawy) {
		this.adresyDostawy = adresyDostawy;
	}
	
	@Override
	public int getRowCount() {

		return adresyDostawy.size();
	}

	@Override
	public int getColumnCount() {

		return 7;
	}
	
	@Override
	public String getColumnName(int columnIndex) {
		
		return columns[columnIndex];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		switch(columnIndex) {
		case 0:
			return adresyDostawy.get(rowIndex).getId();
		case 1:
			return adresyDostawy.get(rowIndex).getId_zamowienia();
		case 2:
			return adresyDostawy.get(rowIndex).getKraj();
		case 3:
			return adresyDostawy.get(rowIndex).getMiejscowosc();
		case 4:
			return adresyDostawy.get(rowIndex).getUlica();
		case 5:
			return adresyDostawy.get(rowIndex).getMieszkanie();
		case 6:
			return adresyDostawy.get(rowIndex).getKod_pocztowy();
		default:
			return adresyDostawy.get(rowIndex).getId();
		}
	}

}
