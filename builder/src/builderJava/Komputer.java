package builderJava;

import java.util.List;

public class Komputer
	{
		public Komputer(String nazwa, int iloscRam, int wielkoscDysku, List<String> gPU, List<String> cPU, List<String> dodatki)
			{
				super();
				this.nazwa = nazwa;
				this.iloscRam = iloscRam;
				this.wielkoscDysku = wielkoscDysku;
				GPU = gPU;
				CPU = cPU;
				this.dodatki = dodatki;
			}

		private String nazwa;
		private int iloscRam; // w GB
		private int wielkoscDysku; // w GB
		private List<String> GPU;
		private List<String> CPU;
		private List<String> dodatki;

		@Override
		public String toString()
			{
				return "Komputer [nazwa=" + nazwa + ", iloscRam=" + iloscRam + "GB, wielkoscDysku=" + wielkoscDysku
						+ "GB, GPU=" + GPU + ", CPU=" + CPU + ", dodatki=" + dodatki + "]";
			}

	}
