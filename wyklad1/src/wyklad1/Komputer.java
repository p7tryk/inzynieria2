package wyklad1;

import java.util.List;

public class Komputer<dodatki> {

		private String nazwa;
		private String iloscRamu;
		private String wielkoscHDD;
		private List<String> dodatki;
		
		public String getNazwa()
			{
				return nazwa;
			}
		public void setNazwa(String nazwa)
			{
				this.nazwa = nazwa;
			}
		public String getIloscRamu()
			{
				return iloscRamu;
			}
		public void setIloscRamu(String iloscRamu)
			{
				this.iloscRamu = iloscRamu;
			}
		public String getWielkoscHDD()
			{
				return wielkoscHDD;
			}
		public void setWielkoscHDD(String wielkoscHDD)
			{
				this.wielkoscHDD = wielkoscHDD;
			}
		public List<String> getDodatki()
			{
				return dodatki;
			}
		public void setDodatki(List<String> dodatki)
			{
				this.dodatki = dodatki;
			}




		@Override
		public String toString()
			{
				return "Komputer [nazwa=" + nazwa + ", iloscRamu=" + iloscRamu + ", wielkoscHDD=" + wielkoscHDD
						+ ", dodatki=" + dodatki + "]";
			}
		


		
}
