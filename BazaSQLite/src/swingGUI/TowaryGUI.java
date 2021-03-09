package swingGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import addRecord.AddTowaryGUI;
import dbAccess.TowarySql;
import dbAccess.ZamowieniaSql;
import records.Towary;
import tableModels.TowaryTableModel;

public class TowaryGUI extends JFrame{

	private List<Towary> records;
	
	private JTable table;
	private TowaryTableModel model;
	private JScrollPane scrollPane;
	
	public TowaryGUI(JScrollPane scrollPane, JButton dodaj, JButton usun) {

		this.scrollPane = scrollPane;
		
		PrintAll();

		dodaj.removeActionListener(dodaj.getActionListeners()[0]);
		dodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {

				AddTowaryGUI addTowaryGUI = new AddTowaryGUI();
				PrintAll();
			}
		});
		usun.removeActionListener(usun.getActionListeners()[0]);
		usun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				String id = model.getValueAt(table.getSelectedRow(), 0).toString();	
				TowarySql.delete(id);
				PrintAll();
			}
		});
	}
	
private void PrintAll() {
		
		records = TowarySql.selectAll();
		table = new JTable();
		model = new TowaryTableModel(records);
		table.setModel(model);
		scrollPane.setViewportView(table);
		scrollPane.repaint();
		scrollPane.revalidate();
	}
}
