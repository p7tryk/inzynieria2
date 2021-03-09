package tableModels;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import records.Zamowienia;

public class ZamowieniaTableModel extends AbstractTableModel {

	private String[] columns = { "id", "cena_dostawy", "data_zamowienia", "status", "darmowy_zwrot", "numer_faktury", "id_klienci", "id_pracownicy" };
	private List<Zamowienia> zamowienia;
	
	public ZamowieniaTableModel(List<Zamowienia> zamowienia) {
		this.zamowienia = zamowienia;
	}
	
	@Override
	public int getRowCount() {

		return zamowienia.size();
	}

	@Override
	public int getColumnCount() {

		return 8;
	}
	
	@Override
	public String getColumnName(int columnIndex) {
		
		return columns[columnIndex];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		switch(columnIndex) {
		case 0:
			return zamowienia.get(rowIndex).getId();
		case 1:
			return zamowienia.get(rowIndex).getCena_dostawy();
		case 2:
			return zamowienia.get(rowIndex).getData_zamowienia();
		case 3:
			return zamowienia.get(rowIndex).getStatus();
		case 4:
			return zamowienia.get(rowIndex).getDarmowy_zwrot();
		case 5:
			return zamowienia.get(rowIndex).getNumer_faktury();
		case 6:
			return zamowienia.get(rowIndex).getId_klienci();
		case 7:
			return zamowienia.get(rowIndex).getId_pracownicy();
		default:
			return zamowienia.get(rowIndex).getId();
		}
	}

}
