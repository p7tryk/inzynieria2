package tableModels;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import records.Klienci;

public class KlienciTableModel extends AbstractTableModel {

	private String[] columns = { "id", "imie", "nazwisko", "kraj", "miejscowosc", "ulica", "mieszkanie", "kod_pocztowy", "numer_tel", "email" };
	private List<Klienci> klienci;
	
	public KlienciTableModel(List<Klienci> klienci) {
		this.klienci = klienci;
	}
	
	@Override
	public int getRowCount() {

		return klienci.size();
	}

	@Override
	public int getColumnCount() {

		return 10;
	}
	
	@Override
	public String getColumnName(int columnIndex) {
		
		return columns[columnIndex];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		switch(columnIndex) {
		case 0:
			return klienci.get(rowIndex).getId();
		case 1:
			return klienci.get(rowIndex).getImie();
		case 2:
			return klienci.get(rowIndex).getNazwisko();
		case 3:
			return klienci.get(rowIndex).getKraj();
		case 4:
			return klienci.get(rowIndex).getMiejscowosc();
		case 5:
			return klienci.get(rowIndex).getUlica();
		case 6:
			return klienci.get(rowIndex).getMieszkanie();
		case 7:
			return klienci.get(rowIndex).getKod_pocztowy();
		case 8:
			return klienci.get(rowIndex).getNumer_tel();
		case 9:
			return klienci.get(rowIndex).getEmail();
		default:
			return klienci.get(rowIndex).getId();
		}
	}

}
