package wyklad2;

public class ProgramistaJava extends Pracownik
	{

		
		
	public ProgramistaJava(String imie, String nazwisko)
		{
			super(imie, nazwisko);
			// TODO Auto-generated constructor stub
		}

	@Override
	public void programuj()
		{
			System.out.println("Programuje w Java");
			
		}

	@Override
	public void wyswietl()
		{
			// TODO Auto-generated method stub
			System.out.println("Programista Java" + toString());
		}

	}
