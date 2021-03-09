package addRecord;

import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import dbAccess.TowaryOfertaSql;

public class AddTowaryOfertaGUI {
	
	JDialog dialog;
	
	public AddTowaryOfertaGUI() {
		
		
		JTextField ilosc_dostepnych = new JTextField();
		JTextField cena = new JTextField();
		JTextField promocja_cena = new JTextField();
		JTextField promocja_ilosc = new JTextField();
		JTextField promocja_poczatek = new JTextField();
		JTextField promocja_koniec = new JTextField();
		JTextField id_towary = new JTextField();

		final JComponent[] inputs = new JComponent[] {
		        new JLabel("ilosc_dostepnych"),
		        ilosc_dostepnych,
		        new JLabel("cena"),
		        cena,
		        new JLabel("promocja_cena"),
		        promocja_cena,
		        new JLabel("promocja_ilosc"),
		        promocja_ilosc,
		        new JLabel("promocja_poczatek"),
		        promocja_poczatek,
		        new JLabel("promocja_koniec"),
		        promocja_koniec,
		        new JLabel("id_towary"),
		        id_towary
		};
		int result = JOptionPane.showConfirmDialog(null, inputs, "Dodaj nowy rekord", JOptionPane.OK_CANCEL_OPTION);
		if (result == JOptionPane.OK_OPTION) {
		    if(TowaryOfertaSql.insert(Integer.parseInt(ilosc_dostepnych.getText()), Integer.parseInt(cena.getText()),
		    		Integer.parseInt(promocja_cena.getText()),Integer.parseInt(promocja_ilosc.getText()), promocja_poczatek.getText(),
		    		promocja_koniec.getText(), Integer.parseInt(id_towary.getText()))) {
		    	System.out.println("Wpisano");
		    } 
		} else {
		    System.out.println("nic nie wpisano");
		}
	}
}
