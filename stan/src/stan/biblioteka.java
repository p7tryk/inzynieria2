package stan;

public class biblioteka
	{

		public static void main(String[] args)
			{
	            KartaCzytelnika karta1 = new KartaCzytelnika("patryk","kaniewski",420, new KartaJunior());
	            System.out.println(karta1.getTypKarty().getState());
	            System.out.println(karta1.toString());
	            
	            karta1.setTypKarty(new KartaSenior());
	            
	            System.out.println(karta1.getTypKarty().getState());
	            System.out.println(karta1.toString());
			}

	}
