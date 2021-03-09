package tableModels;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import records.Pracownicy;

public class PracownicyTableModel extends AbstractTableModel {

	private String[] columns = { "id", "imie", "nazwisko" };
	private List<Pracownicy> pracownicy;
	
	public PracownicyTableModel(List<Pracownicy> pracownicy) {
		this.pracownicy = pracownicy;
	}
	
	@Override
	public int getRowCount() {

		return pracownicy.size();
	}

	@Override
	public int getColumnCount() {

		return 3;
	}
	
	@Override
	public String getColumnName(int columnIndex) {
		
		return columns[columnIndex];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		switch(columnIndex) {
		case 0:
			return pracownicy.get(rowIndex).getId();
		case 1:
			return pracownicy.get(rowIndex).getImie();
		case 2:
			return pracownicy.get(rowIndex).getNazwisko();
		default:
			return pracownicy.get(rowIndex).getId();
		}
	}

}
