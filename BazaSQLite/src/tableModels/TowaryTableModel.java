package tableModels;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import records.Towary;

public class TowaryTableModel extends AbstractTableModel {

	private String[] columns = { "id", "producent", "opis", "galeria_zdjec", "ilosc_sprzedanych" };
	private List<Towary> towary;
	
	public TowaryTableModel(List<Towary> towary) {
		this.towary = towary;
	}
	
	@Override
	public int getRowCount() {

		return towary.size();
	}

	@Override
	public int getColumnCount() {

		return 5;
	}
	
	@Override
	public String getColumnName(int columnIndex) {
		
		return columns[columnIndex];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		switch(columnIndex) {
		case 0:
			return towary.get(rowIndex).getId();
		case 1:
			return towary.get(rowIndex).getProducent();
		case 2:
			return towary.get(rowIndex).getOpis();
		case 3:
			return towary.get(rowIndex).getGaleria_zdjec();
		case 4:
			return towary.get(rowIndex).getIlosc_sprzedanych();
		default:
			return towary.get(rowIndex).getId();
		}
	}

}
