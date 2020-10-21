package strategia;

public class Biblioteka
	{
		public static void run()
		{
				KartaCzytelnika czytelnik1 = new KartaCzytelnika("patryk", "kaniewski", 420);
				junior junior = new junior();
				junior.wyswietlDane(czytelnik1);
		}
		
		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				Biblioteka.run();
			}

	}
