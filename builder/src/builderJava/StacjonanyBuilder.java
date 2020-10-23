package builderJava;

import java.util.ArrayList;
import java.util.List;

public class StacjonanyBuilder implements KomputerBuilder
	{
		private String nazwa = "Domyslny Komputer";
		private int iloscRam = 8; // w GB
		private int wielkoscDysku = 256; // w GB
		private List<String> GPU = new ArrayList<String>();
		private List<String> CPU = new ArrayList<String>();
		private List<String> dodatki = new ArrayList<String>();

		@Override
		public Komputer build()
			{
				check();	//TODO tutaj nie wiem czy sprawdzac czy dawac error
				return new Komputer(nazwa, iloscRam, wielkoscDysku, GPU, CPU, dodatki);
			}

		private void check()
			{
				if(CPU.isEmpty())
				{
					addCPU("Ryzen R5 3600");
				}
			}

		public StacjonanyBuilder setNazwa(String nazwa)
			{
				this.nazwa = nazwa;
				return this;
			}

		public StacjonanyBuilder setIloscRam(int iloscRam)
			{
				this.iloscRam = iloscRam;
				return this;
			}

		public StacjonanyBuilder setWielkoscDysku(int wielkoscDysku)
			{
				this.wielkoscDysku = wielkoscDysku;
				return this;
			}

		public StacjonanyBuilder addGPU(String gPU)
			{
				this.GPU.add(gPU);
				return this;
			}

		public StacjonanyBuilder addCPU(String cPU)
			{
				this.CPU.add(cPU);
				return this;
			}

		public StacjonanyBuilder addDodatek(String dodatek)
			{
				dodatki.add(dodatek);
				return this;
			}
	}
