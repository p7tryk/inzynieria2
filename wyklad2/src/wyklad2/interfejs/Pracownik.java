package wyklad2.interfejs;

public abstract class Pracownik
	{
		public Pracownik(String imie, String nazwisko)
		{
			super();
			this.imie = imie;
			this.nazwisko = nazwisko;
		}
		private final String imie;
		private final String nazwisko;
		
		@Override
		public String toString()
			{
				return "Pracownik [imie=" + imie + ", nazwisko=" + nazwisko + "]";
			}
		
		public abstract void programuj();
		public abstract void wyswietl();
		public void zrobKawe()
		{
				System.out.println("Juz lece...");
		}
	}
