package addRecord;

import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import dbAccess.KlienciSql;

public class AddKlienciGUI {
	
	JDialog dialog;
	
	public AddKlienciGUI() {
		
		
		JTextField imie = new JTextField();
		JTextField nazwisko = new JTextField();
		JTextField kraj = new JTextField();
		JTextField miejscowosc = new JTextField();
		JTextField ulica = new JTextField();
		JTextField mieszkanie = new JTextField();
		JTextField kod_pocztowy = new JTextField();
		JTextField numer_tel = new JTextField();
		JTextField email = new JTextField();

		final JComponent[] inputs = new JComponent[] {
		        new JLabel("imie"),
		        imie,
		        new JLabel("nazwisko"),
		        nazwisko,
		        new JLabel("kraj"),
		        kraj,
		        new JLabel("miejscowosc"),
		        miejscowosc,
		        new JLabel("ulica"),
		        ulica,
		        new JLabel("mieszkanie"),
		        mieszkanie,
		        new JLabel("kod_pocztowy"),
		        kod_pocztowy,
		        new JLabel("numer_tel"),
		        numer_tel,
		        new JLabel("email"),
		        email
		};
		int result = JOptionPane.showConfirmDialog(null, inputs, "Dodaj nowy rekord", JOptionPane.OK_CANCEL_OPTION);
		if (result == JOptionPane.OK_OPTION) {
		    if(KlienciSql.insert(imie.getText(), nazwisko.getText(), kraj.getText(), miejscowosc.getText(),
		    		ulica.getText(), mieszkanie.getText(), kod_pocztowy.getText(), numer_tel.getText(), email.getText())) {
		    	System.out.println("Wpisano");
		    } 
		} else {
		    System.out.println("nic nie wpisano");
		}
	}
}
