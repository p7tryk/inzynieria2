package builderJava;

import java.util.ArrayList;
import java.util.List;

public class LaptopBuilder implements KomputerBuilder
	{
		private String nazwa = "Domyslny Laptop";
		private int iloscRam = 4; // w GB
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
					addCPU("I3-10300u");
				}
			}

		public LaptopBuilder setNazwa(String nazwa)
			{
				this.nazwa = nazwa;
				return this;
			}

		public LaptopBuilder setIloscRam(int iloscRam)
			{
				this.iloscRam = iloscRam;
				return this;
			}

		public LaptopBuilder setWielkoscDysku(int wielkoscDysku)
			{
				this.wielkoscDysku = wielkoscDysku;
				return this;
			}

		public LaptopBuilder addGPU(String gPU)
			{
				if(GPU.isEmpty())
					this.GPU.add(gPU);
				return this;
			}

		public LaptopBuilder addCPU(String cPU)
			{
				if(CPU.isEmpty())
					this.CPU.add(cPU);
				return this;
			}

		public LaptopBuilder addDodatek(String dodatek)
			{
				dodatki.add(dodatek);
				return this;
			}
	}
