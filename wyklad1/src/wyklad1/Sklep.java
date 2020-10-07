package wyklad1;

import java.util.ArrayList;
import java.util.List;

public class Sklep {

	private void run() 
	{
			List<String> dodatki = new ArrayList<>();
			dodatki.add("myszka");
			dodatki.add("klawiatura");
			
			Komputer komputer1 = new Komputer("OriginPC", "6", "1TB", dodatki);
			System.out.println(komputer1);
	}
		
	public static void main(String[] args) 
	{
			new Sklep().run();
	}

}
