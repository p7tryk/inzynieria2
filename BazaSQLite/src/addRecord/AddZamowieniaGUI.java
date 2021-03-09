package addRecord;

import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import dbAccess.ZamowieniaSql;

public class AddZamowieniaGUI {
	
	JDialog dialog;
	
	public AddZamowieniaGUI() {
		
		
		JTextField cena_dostawy = new JTextField();
		JTextField data_zamowienia = new JTextField();
		JTextField status = new JTextField();
		JTextField darmowy_zwrot = new JTextField();
		JTextField numer_faktury = new JTextField();
		JTextField id_klienci = new JTextField();
		JTextField id_pracownicy = new JTextField();

		final JComponent[] inputs = new JComponent[] {
		        new JLabel("cena_dostawy"),
		        cena_dostawy,
		        new JLabel("data_zamowienia"),
		        data_zamowienia,
		        new JLabel("status"),
		        status,
		        new JLabel("darmowy_zwrot"),
		        darmowy_zwrot,
		        new JLabel("numer_faktury"),
		        numer_faktury,
		        new JLabel("id_klienci"),
		        id_klienci,
		        new JLabel("id_pracownicy"),
		        id_pracownicy,
		};
		int result = JOptionPane.showConfirmDialog(null, inputs, "Dodaj nowy rekord", JOptionPane.OK_CANCEL_OPTION);
		if (result == JOptionPane.OK_OPTION) {
		    if(ZamowieniaSql.insert(Integer.parseInt(cena_dostawy.getText()), data_zamowienia.getText(),
		    		status.getText(), Integer.parseInt(darmowy_zwrot.getText()), Integer.parseInt(numer_faktury.getText()),
		    		Integer.parseInt(id_klienci.getText()), Integer.parseInt(id_pracownicy.getText()))) {
		    	System.out.println("Wpisano");
		    } 
		} else {
		    System.out.println("nic nie wpisano");
		}
	}
}
