package swingGUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class GUI {

	private JFrame frame;
	private JPanel gridPanel;
	private JButton btnAdresyDostawy;
	private JButton btnKategorie;
	private JButton btnKlienci;
	private JButton btnPracownicy;
	private JButton btnTowary;
	private JButton btnTowaryKategorie;
	private JButton btnTowaryOferta;
	private JButton btnZamowienia;
	private JPanel topPanel;
	private JButton dodaj;
	private JButton usun;
	JScrollPane scrollPane;
	
	
	public GUI() {
		
		frame = new JFrame("Podstawy baz danych");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		scrollPane = new JScrollPane();
		
		gridPanel = new JPanel(new GridLayout(0, 1, 0, 10));
		gridPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		
		btnAdresyDostawy = new JButton("adresy_dostawy");
		btnAdresyDostawy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				AdresyDostawyGUI adresyDostawyGui = new AdresyDostawyGUI(scrollPane, dodaj, usun);
			}
		});
		btnKategorie = new JButton("kategorie");
		btnKategorie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				KategorieGUI kategorieGui = new KategorieGUI(scrollPane, dodaj, usun);
			}
		});
		btnKlienci = new JButton("klienci");
		btnKlienci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				KlienciGUI klienciGui = new KlienciGUI(scrollPane, dodaj, usun);
			}
		});
		btnPracownicy = new JButton("pracownicy");
		btnPracownicy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				PracownicyGUI pracownicyGui = new PracownicyGUI(scrollPane, dodaj, usun);
			}
		});
		btnTowary = new JButton("towary");
		btnTowary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				TowaryGUI towaryGui = new TowaryGUI(scrollPane, dodaj, usun);
			}
		});
		btnTowaryKategorie = new JButton("towary_kategorie");
		btnTowaryKategorie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				TowaryKategorieGUI towaryKategorieGui = new TowaryKategorieGUI(scrollPane, dodaj, usun);
			}
		});
		btnTowaryOferta = new JButton("towary_oferta");
		btnTowaryOferta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				TowaryOfertaGUI towaryOfertaGui = new TowaryOfertaGUI(scrollPane, dodaj, usun);
			}
		});
		btnZamowienia = new JButton("zamowienia");
		btnZamowienia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				ZamowieniaGUI zamowieniaGui = new ZamowieniaGUI(scrollPane, dodaj, usun);
			}
		});
		
		gridPanel.add(btnAdresyDostawy);
		gridPanel.add(btnKategorie);
		gridPanel.add(btnKlienci);
		gridPanel.add(btnPracownicy);
		gridPanel.add(btnTowary);
		gridPanel.add(btnTowaryKategorie);
		gridPanel.add(btnTowaryOferta);
		gridPanel.add(btnZamowienia);
		
		frame.getContentPane().add(BorderLayout.WEST, gridPanel);
		
		
		frame.getContentPane().add(BorderLayout.CENTER, scrollPane);
		
		
		topPanel = new JPanel();
		dodaj = new JButton("Dodaj");
		dodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
			}
		});
		usun = new JButton("Usuñ");
		usun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
			}
		});

		dodaj.setPreferredSize(new Dimension(200, 30));
		topPanel.add(dodaj);
		usun.setPreferredSize(new Dimension(200, 30));
		topPanel.add(usun);
		
		frame.getContentPane().add(BorderLayout.NORTH, topPanel);
		
		
		
		
		frame.setVisible(true);
		
		
		
		
		
		


	}
}
