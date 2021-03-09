package tableModels;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import records.Kategorie;

public class KategorieTableModel extends AbstractTableModel {

	private String[] columns = { "id", "kategoria" };
	private List<Kategorie> kategorie;
	
	public KategorieTableModel(List<Kategorie> kategorie) {
		this.kategorie = kategorie;
	}
	
	@Override
	public int getRowCount() {

		return kategorie.size();
	}

	@Override
	public int getColumnCount() {

		return 2;
	}
	
	@Override
	public String getColumnName(int columnIndex) {
		
		return columns[columnIndex];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		switch(columnIndex) {
		case 0:
			return kategorie.get(rowIndex).getId();
		case 1:
			return kategorie.get(rowIndex).getKategoria();
		default:
			return kategorie.get(rowIndex).getId();
		}
	}

}
