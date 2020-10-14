package wyklad2;

public class Prezes extends Pracownik
	{

		public Prezes(String imie, String nazwisko)
			{
				super(imie, nazwisko);
				// TODO Auto-generated constructor stub
			}

		@Override
		public void programuj()
			{
				System.out.println("Prezes juz nie umie programowac");

			}

		@Override
		public void wyswietl()
			{
				// TODO Auto-generated method stub
				System.out.println("Prezes" + toString());
			}

		@Override
		public void zrobKawe()
			{
				System.out.println("prosze mnie nie obrazac");
			}

	}
