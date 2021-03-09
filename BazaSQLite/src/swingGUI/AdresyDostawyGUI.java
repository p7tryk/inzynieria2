package swingGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import addRecord.AddAdresyDostawyGUI;
import dbAccess.AdresyDostawySql;
import dbAccess.ZamowieniaSql;
import records.AdresyDostawy;
import tableModels.AdresyDostawyTableModel;

public class AdresyDostawyGUI extends JFrame{

	private List<AdresyDostawy> records;
	
	private JTable table;
	private AdresyDostawyTableModel model;
	private JScrollPane scrollPane;

	public AdresyDostawyGUI(JScrollPane scrollPane, JButton dodaj, JButton usun) {
		
		this.scrollPane = scrollPane;
		
		PrintAll();

		dodaj.removeActionListener(dodaj.getActionListeners()[0]);
		dodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {

				AddAdresyDostawyGUI addAdresyDostawyGUI = new AddAdresyDostawyGUI();
				PrintAll();
			}
		});
		usun.removeActionListener(usun.getActionListeners()[0]);
		usun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				String id = model.getValueAt(table.getSelectedRow(), 0).toString();	
				AdresyDostawySql.delete(id);
				PrintAll();
			}
		});

	}
	
private void PrintAll() {
		
		records = AdresyDostawySql.selectAll();
		table = new JTable();
		model = new AdresyDostawyTableModel(records);
		table.setModel(model);
		scrollPane.setViewportView(table);
		scrollPane.repaint();
		scrollPane.revalidate();
	}
}
