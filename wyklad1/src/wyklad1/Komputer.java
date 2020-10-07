package wyklad1;

import java.util.List;

public class Komputer<dodatki> {

		private String nazwa;
		private String iloscRamu;
		private String wielkoscHDD;
		private List<String> dodatki;
		


		@Override
		public String toString()
			{
				return "Komputer [nazwa=" + nazwa + ", iloscRamu=" + iloscRamu + ", wielkoscHDD=" + wielkoscHDD
						+ ", dodatki=" + dodatki + "]";
			}
		


		
}
