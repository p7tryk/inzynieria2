package addRecord;

import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import dbAccess.TowaryKategorieSql;

public class AddTowaryKategorieGUI {
	
	JDialog dialog;
	
	public AddTowaryKategorieGUI() {
		
		
		JTextField id_towary = new JTextField();
		JTextField id_kategorie = new JTextField();

		final JComponent[] inputs = new JComponent[] {
		        new JLabel("id_towary"),
		        id_towary,
		        new JLabel("id_kategorie"),
		        id_kategorie
		};
		int result = JOptionPane.showConfirmDialog(null, inputs, "Dodaj nowy rekord", JOptionPane.OK_CANCEL_OPTION);
		if (result == JOptionPane.OK_OPTION) {
		    if(TowaryKategorieSql.insert(Integer.parseInt(id_towary.getText()), Integer.parseInt(id_kategorie.getText()))) {
		    	System.out.println("Wpisano");
		    } 
		} else {
		    System.out.println("nic nie wpisano");
		}
	}
}
