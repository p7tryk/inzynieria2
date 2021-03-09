package addRecord;

import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import dbAccess.AdresyDostawySql;

public class AddAdresyDostawyGUI {
	
	JDialog dialog;
	
	public AddAdresyDostawyGUI() {
		
		
		JTextField id_zamowienia = new JTextField();
		JTextField kraj = new JTextField();
		JTextField miejscowosc = new JTextField();
		JTextField ulica = new JTextField();
		JTextField mieszkanie = new JTextField();
		JTextField kod_pocztowy = new JTextField();

		final JComponent[] inputs = new JComponent[] {
		        new JLabel("id_zamowienia"),
		        id_zamowienia,
		        new JLabel("kraj"),
		        kraj,
		        new JLabel("miejscowosc"),
		        miejscowosc,
		        new JLabel("ulica"),
		        ulica,
		        new JLabel("mieszkanie"),
		        mieszkanie,
		        new JLabel("kod_pocztowy"),
		        kod_pocztowy
		};
		int result = JOptionPane.showConfirmDialog(null, inputs, "Dodaj nowy rekord", JOptionPane.OK_CANCEL_OPTION);
		if (result == JOptionPane.OK_OPTION) {
		    if(AdresyDostawySql.insert(Integer.parseInt(id_zamowienia.getText()), kraj.getText(),
		    		miejscowosc.getText(), ulica.getText(), mieszkanie.getText(), kod_pocztowy.getText())) {
		    	System.out.println("Wpisano");
		    } 
		} else {
		    System.out.println("nic nie wpisano");
		}
	}
}
