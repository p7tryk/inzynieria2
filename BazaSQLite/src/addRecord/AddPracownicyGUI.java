package addRecord;

import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import dbAccess.PracownicySql;

public class AddPracownicyGUI {
	
	JDialog dialog;
	
	public AddPracownicyGUI() {
		
		
		JTextField imie = new JTextField();
		JTextField nazwisko = new JTextField();

		final JComponent[] inputs = new JComponent[] {
		        new JLabel("imie"),
		        imie,
		        new JLabel("nazwisko"),
		        nazwisko
		};
		int result = JOptionPane.showConfirmDialog(null, inputs, "Dodaj nowy rekord", JOptionPane.OK_CANCEL_OPTION);
		if (result == JOptionPane.OK_OPTION) {
		    if(PracownicySql.insert(imie.getText(), nazwisko.getText())) {
		    	System.out.println("Wpisano");
		    } 
		}else {
		    System.out.println("nic nie wpisano");
		}
	}
}
