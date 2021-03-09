package tableModels;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import records.TowaryKategorie;

public class TowaryKategorieTableModel extends AbstractTableModel {

	private String[] columns = { "id_towary", "id_kategorie" };
	private List<TowaryKategorie> towaryKategorie;
	
	public TowaryKategorieTableModel(List<TowaryKategorie> towaryKategorie) {
		this.towaryKategorie = towaryKategorie;
	}
	
	@Override
	public int getRowCount() {

		return towaryKategorie.size();
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
			return towaryKategorie.get(rowIndex).getId_towary();
		case 1:
			return towaryKategorie.get(rowIndex).getId_kategorie();
		default:
			return towaryKategorie.get(rowIndex).getId_towary();
		}
	}

}
