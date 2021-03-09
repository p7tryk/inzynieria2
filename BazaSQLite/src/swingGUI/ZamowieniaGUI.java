package swingGUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import addRecord.AddZamowieniaGUI;
import dbAccess.PracownicySql;
import dbAccess.ZamowieniaSql;
import records.Zamowienia;
import tableModels.ZamowieniaTableModel;

public class ZamowieniaGUI extends JFrame{

	private List<Zamowienia> records;
	
	private JTable table;
	private ZamowieniaTableModel model;
	private JScrollPane scrollPane;
	
	public ZamowieniaGUI(JScrollPane scrollPane, JButton dodaj, JButton usun) {

		this.scrollPane = scrollPane;
		
		PrintAll();

		dodaj.removeActionListener(dodaj.getActionListeners()[0]);
		dodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {

				AddZamowieniaGUI addZamowieniaGUI = new AddZamowieniaGUI();
				PrintAll();
			}
		});
		usun.removeActionListener(usun.getActionListeners()[0]);
		usun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				String id = model.getValueAt(table.getSelectedRow(), 0).toString();	
				ZamowieniaSql.delete(id);
				PrintAll();
			}
		});
	}
	
	private void PrintAll() {
		
		records = ZamowieniaSql.selectAll();
		table = new JTable();
		model = new ZamowieniaTableModel(records);
		table.setModel(model);
		scrollPane.setViewportView(table);
		scrollPane.repaint();
		scrollPane.revalidate();
	}
	
}
