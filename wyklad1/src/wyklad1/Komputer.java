package wyklad1;

import java.util.ArrayList;
import java.util.List;

public class Komputer {

		private String nazwa;
		private String iloscRamu;
		private String wielkoscHDD;
		private List<String> dodatki;
		
		

		private Komputer(String nazwa, String iloscRamu, String wielkoscHDD, List<String> dodatki)
			{
				super();
				this.nazwa = nazwa;
				this.iloscRamu = iloscRamu;
				this.wielkoscHDD = wielkoscHDD;
				this.dodatki = dodatki;
			}
		


		@Override
		public String toString()
			{
				return "Komputer [nazwa=" + nazwa + ", iloscRamu=" + iloscRamu + ", wielkoscHDD=" + wielkoscHDD
						+ ", dodatki=" + dodatki + "]";
			}
		

		public static class KomputerBuilder
		{
			private String nazwa;
			private String iloscRamu;
			private String wielkoscHDD;
			private List<String> dodatki;
				
			public KomputerBuilder domyslnaWielkoscHDD(String wielkoscHDD)
				{
					if(wielkoscHDD.isBlank())
						wielkoscHDD="1";
					this.wielkoscHDD=wielkoscHDD;
					return this;
				}

			public KomputerBuilder domyslnaIloscRamu(String iloscRamu)
				{
					if(iloscRamu.isBlank())
						iloscRamu="4";
					this.iloscRamu = iloscRamu;
					return this;
				}

			public KomputerBuilder domyslnaNazwa(String nazwa)
				{
					if(nazwa.isBlank())
						nazwa="komputer1";
					this.nazwa=nazwa;
					return this;
				}
			public KomputerBuilder dodatki(String dodatki)
			{
					this.dodatki.add(dodatki);
					return this;
			}
		}
		
}
