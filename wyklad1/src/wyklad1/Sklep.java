package wyklad1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import wyklad1.Komputer.KomputerBuilder;

public class Sklep
	{

		private void run()
			{
				try
				{
					Komputer komputer1 = new Komputer.KomputerBuilder().domyslnaNazwa("test");		
					System.out.println(komputer1);
				} 
				catch (Exception ex)
				{

				}

			}

		

		public static void main(String[] args)
			{
				new Sklep().run();
			}

	}
