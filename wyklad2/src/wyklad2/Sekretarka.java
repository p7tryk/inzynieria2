package wyklad2;

public class Sekretarka extends Pracownik
	{

		
		
	public Sekretarka(String imie, String nazwisko)
		{
			super(imie, nazwisko);
			// TODO Auto-generated constructor stub
		}

	@Override
	public void programuj()
		{
			System.out.println("Nie programuje");
			
		}

	@Override
	public void wyswietl()
		{
			// TODO Auto-generated method stub
			System.out.println("Sekretarka prezesa" + toString());
		}

	}
