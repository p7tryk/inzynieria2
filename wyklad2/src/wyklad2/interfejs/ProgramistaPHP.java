package wyklad2.interfejs;

public class ProgramistaPHP extends Pracownik implements programuje
	{

		
		
	public ProgramistaPHP(String imie, String nazwisko)
		{
			super(imie, nazwisko);
			// TODO Auto-generated constructor stub
		}

	@Override
	public void programuj()
		{
			System.out.println("Programuje w PHP");
			
		}

	@Override
	public void wyswietl()
		{
			// TODO Auto-generated method stub
			System.out.println("Programista PHP" + toString());
		}

	}
