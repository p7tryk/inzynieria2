package bazylab3;

import javax.swing.*;

import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.SQLException;
import java.util.ArrayList;

public class GUI
	{
		
		static ArrayList<String> lista;
		static JFrame okno;
		

		public GUI()
			{
				lista = new ArrayList<String>();
				displayWindow();
			}
		protected void finalize()
		{
				//tutaj zapisz do pliku
		}



		public static void displayWindow()
			{
				// tworzenie okna
				okno = new JFrame("LAB3");
				okno.setSize(1024, 780);
				okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				JPanel jp2 = new JPanel(); 
				JLabel jl2 = new JLabel("dodawacz"); 
				JButton jbadd = new JButton("dodaj");
				final JTextField textfield = new JTextField("string");

				textfield.setPreferredSize(new Dimension(120,30));

				
				jp2.add(jl2);
				jp2.add(textfield);
				

				jp2.add(jbadd);

				okno.getContentPane().add(BorderLayout.NORTH, jp2);

				okno.setVisible(true);


				//dodawanie nowego rzedu
				jbadd.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent evt)
							{
								lista.add(textfield.getText());
							}
					});
			}
	};;
