package addRecord;

import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import dbAccess.TowarySql;

public class AddTowaryGUI {
	
	JDialog dialog;
	
	public AddTowaryGUI() {
		
		
		JTextField producent = new JTextField();
		JTextField opis = new JTextField();
		JTextField galeria_zdjec = new JTextField();
		JTextField ilosc_sprzedanych = new JTextField();
		

		final JComponent[] inputs = new JComponent[] {
		        new JLabel("producent"),
		        producent,
		        new JLabel("opis"),
		        opis,
		        new JLabel("galeria_zdjec"),
		        galeria_zdjec,
		        new JLabel("ilosc_sprzedanych"),
		        ilosc_sprzedanych
		};
		int result = JOptionPane.showConfirmDialog(null, inputs, "Dodaj nowy rekord", JOptionPane.OK_CANCEL_OPTION);
		if (result == JOptionPane.OK_OPTION) {
		    if(TowarySql.insert(producent.getText(), opis.getText(), galeria_zdjec.getText(), Integer.parseInt(ilosc_sprzedanych.getText()))) {
		    	System.out.println("Wpisano");
		    } 
		} else {
		    System.out.println("nic nie wpisano");
		}
	}
}
