package wyklad2.interfejs;

public class Sekretarka extends Pracownik implements robiacyKawe
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
