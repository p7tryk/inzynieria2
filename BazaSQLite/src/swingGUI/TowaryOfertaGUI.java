package swingGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import addRecord.AddTowaryOfertaGUI;
import dbAccess.TowaryOfertaSql;
import dbAccess.ZamowieniaSql;
import records.TowaryOferta;
import tableModels.TowaryOfertaTableModel;

public class TowaryOfertaGUI extends JFrame{

	private List<TowaryOferta> records;
	
	private JTable table;
	private TowaryOfertaTableModel model;
	private JScrollPane scrollPane;
	
	public TowaryOfertaGUI(JScrollPane scrollPane, JButton dodaj, JButton usun) {

		this.scrollPane = scrollPane;
		
		PrintAll();

		dodaj.removeActionListener(dodaj.getActionListeners()[0]);
		dodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				AddTowaryOfertaGUI addTowaryOfertaGUI = new AddTowaryOfertaGUI();
				PrintAll();
			}
		});
		usun.removeActionListener(usun.getActionListeners()[0]);
		usun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				String id = model.getValueAt(table.getSelectedRow(), 0).toString();	
				TowaryOfertaSql.delete(id);
				PrintAll();			}
		});
	}
	
private void PrintAll() {
		
		records = TowaryOfertaSql.selectAll();
		table = new JTable();
		model = new TowaryOfertaTableModel(records);
		table.setModel(model);
		scrollPane.setViewportView(table);
		scrollPane.repaint();
		scrollPane.revalidate();
	}
}
