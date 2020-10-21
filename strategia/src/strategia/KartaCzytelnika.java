package strategia;

public class KartaCzytelnika
	{
		private String imie;
		private String nazwisko;
		private int nrKarty;
		public TypKarty;
		public KartaCzytelnika(String imie, String nazwisko, int nrKarty)
			{
				super();
				this.imie = imie;
				this.nazwisko = nazwisko;
				this.nrKarty = nrKarty;
			}
		@Override
		public String toString()
			{
				return "KartaCzytelnika [imie=" + imie + ", nazwisko=" + nazwisko + ", nrKarty=" + nrKarty + "]";
			}
	}
