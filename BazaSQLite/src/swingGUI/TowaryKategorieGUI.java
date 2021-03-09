package swingGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import addRecord.AddTowaryKategorieGUI;
import dbAccess.TowaryKategorieSql;
import dbAccess.ZamowieniaSql;
import records.TowaryKategorie;
import tableModels.TowaryKategorieTableModel;

public class TowaryKategorieGUI extends JFrame{

	private List<TowaryKategorie> records;

	private JTable table;
	private TowaryKategorieTableModel model;
	private JScrollPane scrollPane;
	
	public TowaryKategorieGUI(JScrollPane scrollPane, JButton dodaj, JButton usun) {

		this.scrollPane = scrollPane;
		
		PrintAll();

		dodaj.removeActionListener(dodaj.getActionListeners()[0]);
		dodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				AddTowaryKategorieGUI addTowaryKategorieGUI = new AddTowaryKategorieGUI();
				PrintAll();
			}
		});
		usun.removeActionListener(usun.getActionListeners()[0]);
		usun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				String id = model.getValueAt(table.getSelectedRow(), 0).toString();	
				TowaryKategorieSql.delete(id);
				PrintAll();
			}
		});
	}
	
private void PrintAll() {
		
		records = TowaryKategorieSql.selectAll();
		table = new JTable();
		model = new TowaryKategorieTableModel(records);
		table.setModel(model);
		scrollPane.setViewportView(table);
		scrollPane.repaint();
		scrollPane.revalidate();
	}
}
