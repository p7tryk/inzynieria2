package builderJava;


public class Sklep
	{
		public static void run()
			{
				Komputer komputer1 = new StacjonanyBuilder()
						.setNazwa("Komputer dla Zosii")
						.setIloscRam(2048)
						.addCPU("Epyc 7742")
						.addCPU("Epyc 7742")
						.addGPU("Radeon Pro WX9100")
						.addGPU("Radeon Pro WX9100")
						.addGPU("Radeon Pro WX9100")
						.addGPU("Radeon Pro WX9100")
						.setWielkoscDysku(12000)
						.addDodatek("Klawiatura")
						.addDodatek("Myszka")
						.build();

				System.out.println(komputer1);

				Komputer komputer2 = new StacjonanyBuilder()
						.setNazwa("Komputer dla Marka")
						.setIloscRam(8)
						.setWielkoscDysku(1000)
						.build();

				System.out.println(komputer2);
				
				Komputer komputer3 = new LaptopBuilder()
						.setNazwa("Laptop dla Zbyszka")
						.setIloscRam(8)
						.addDodatek("kamerka")
						.build();
				System.out.println(komputer3);
			}

		public static void main(String[] args)
			{
				Sklep.run();		
			}

	}
