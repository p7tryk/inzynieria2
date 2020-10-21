package strategia;

public class junior implements TypKarty
	{

	@Override
	public void wykonajDzialanie(KartaCzytelnika czytelnik)
		{
			// TODO Auto-generated method stub
			
			
		}

	@Override
	public void wyswietlDane(KartaCzytelnika czytelnik)
		{
			System.out.print("Karta junior\n");
			System.out.print(czytelnik.toString());
		}

	}
