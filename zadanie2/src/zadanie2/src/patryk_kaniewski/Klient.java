package patryk_kaniewski;

@objid("e2af59cf-9671-49b3-84dd-236b51c653c8")
public class Klient
	{
		@objid("29ac75cb-c1f4-4adf-8c6d-815f0501ebe4")
		public static Kalkulator kalkulator;

		@objid("c4a7205f-6245-42a0-95af-ee69c7cd245b")
		public static void main(String[] args)
			{
				kalkulator = new Kalkulator(new Dodawanie());
				kalkulator.setLiczba1(5);
				kalkulator.setLiczba2(10);
				System.out.println(kalkulator.getLiczba1() + "+" + kalkulator.getLiczba2());
				kalkulator.licz();

				Kalkulator kalkulator2 = new Kalkulator(new Odejmowanie(), 15, 30);
				System.out.println(kalkulator2.getLiczba1() + "-" + kalkulator2.getLiczba2());
				kalkulator2.licz();
				
				kalkulator.setOperacja(new Mnozenie());
				System.out.println(kalkulator.getLiczba1() + "*" + kalkulator.getLiczba2());
				kalkulator.licz();
			}
	}
