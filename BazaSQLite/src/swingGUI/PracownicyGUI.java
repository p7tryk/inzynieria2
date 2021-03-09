package swingGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import addRecord.AddPracownicyGUI;
import dbAccess.PracownicySql;
import records.Pracownicy;
import tableModels.PracownicyTableModel;

public class PracownicyGUI extends JFrame{

	private List<Pracownicy> records;
	
	private JTable table;
	private PracownicyTableModel model;
	private JScrollPane scrollPane;
	
	public PracownicyGUI(JScrollPane scrollPane, JButton dodaj, JButton usun) {
		
		this.scrollPane = scrollPane;
		
		PrintAll();

		dodaj.removeActionListener(dodaj.getActionListeners()[0]);
		dodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				AddPracownicyGUI addPracownicyGUI = new AddPracownicyGUI();
				PrintAll();
			}
		});
		usun.removeActionListener(usun.getActionListeners()[0]);
		usun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				String id = model.getValueAt(table.getSelectedRow(), 0).toString();	
				PracownicySql.delete(id);
				PrintAll();
			}
		});
	}
	
	private void PrintAll() {
		
		records = PracownicySql.selectAll();
		table = new JTable();
		model = new PracownicyTableModel(records);
		table.setModel(model);
		scrollPane.setViewportView(table);
		scrollPane.repaint();
		scrollPane.revalidate();
	}
}
