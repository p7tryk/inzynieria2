package wyklad2.interfejs;

public class Fabryka
	{

		
		
		public static void main(String[] args)
			{
				new Fabryka().run();
				

			}

		private void run()
			{
				ProgramistaJava programistaJava = new ProgramistaJava("Jan","Kowalski");
				programistaJava.wyswietl();
				programistaJava.programuj();
				programistaJava.zrobKawe();
				
				ProgramistaPHP programistaPHP = new ProgramistaPHP("Robert","Swoboda");
				programistaPHP.wyswietl();
				programistaPHP.programuj();
				
				Prezes prezes = new Prezes("Tomek","Swoboda");
				prezes.wyswietl();
				prezes.programuj();
				prezes.zrobKawe();
				
				Sekretarka sekretarka = new Sekretarka("Anna","Kowalczyk");
				sekretarka.wyswietl();
				sekretarka.programuj();
				
			}

	}
