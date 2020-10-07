package wyklad1;

import java.util.ArrayList;
import java.util.List;

public class Sklep {

	private void run() 
	{
			List<String> dodatki = new ArrayList<>();
			dodatki.add("klawiatura");
			dodatki.add("mysz");
			
			Komputer komputer1 = new Komputer();
			komputer1.setNazwa("OriginPC");
			komputer1.setIloscRamu("4");
			komputer1.setWielkoscHDD("1TB");
			komputer1.setDodatki(dodatki);
			System.out.println(komputer1);
	}
		
	public static void main(String[] args) 
	{
			new Sklep().run();
	}

}
