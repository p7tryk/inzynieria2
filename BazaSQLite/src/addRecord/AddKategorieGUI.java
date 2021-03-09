package addRecord;

import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import dbAccess.KategorieSql;

public class AddKategorieGUI {
	
	JDialog dialog;
	
	public AddKategorieGUI() {
		
		
		JTextField kategoria = new JTextField();

		final JComponent[] inputs = new JComponent[] {
		        new JLabel("kategoria"),
		        kategoria,
		};
		int result = JOptionPane.showConfirmDialog(null, inputs, "Dodaj nowy rekord", JOptionPane.OK_CANCEL_OPTION);
		if (result == JOptionPane.OK_OPTION) {
		    if(KategorieSql.insert(kategoria.getText())) {
		    	System.out.println("Wpisano");
		    } 
		} else {
		    System.out.println("nic nie wpisano");
		}
	}
}
