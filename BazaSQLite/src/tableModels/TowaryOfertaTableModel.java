package tableModels;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import records.TowaryOferta;

public class TowaryOfertaTableModel extends AbstractTableModel {

	private String[] columns = { "id", "ilosc_dostepnych", "cena", "promocja_cena", "promocja_ilosc",
			"promocja_poczatek", "promocja_koniec", "id_towary" };
	private List<TowaryOferta> towaryOferta;
	
	public TowaryOfertaTableModel(List<TowaryOferta> towaryOferta) {
		this.towaryOferta = towaryOferta;
	}
	
	@Override
	public int getRowCount() {

		return towaryOferta.size();
	}

	@Override
	public int getColumnCount() {

		return 9;
	}
	
	@Override
	public String getColumnName(int columnIndex) {
		
		return columns[columnIndex];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		switch(columnIndex) {
		case 0:
			return towaryOferta.get(rowIndex).getId();
		case 1:
			return towaryOferta.get(rowIndex).getIlosc_dostepnych();
		case 2:
			return towaryOferta.get(rowIndex).getCena();
		case 3:
			return towaryOferta.get(rowIndex).getPromocja_cena();
		case 4:
			return towaryOferta.get(rowIndex).getPromocja_ilosc();
		case 5:
			return towaryOferta.get(rowIndex).getPromocja_poczatek();
		case 6:
			return towaryOferta.get(rowIndex).getPromocja_koniec();
		case 7:
			return towaryOferta.get(rowIndex).getId_towary();
		default:
			return towaryOferta.get(rowIndex).getId();
		}
	}

}
