package stan;

public class KartaCzytelnika
	{
		private String imie;
		private String nazwisko;
		private int nrKarty;

		private TypKarty typKarty;

		public KartaCzytelnika(String imie, String nazwisko, int nrKarty, TypKarty typKarty)
			{
				super();
				this.imie = imie;
				this.nazwisko = nazwisko;
				this.nrKarty = nrKarty;
				this.setTypKarty(typKarty);
			}

		@Override
		public String toString()
			{
				return "KartaContext [imie=" + imie + ", nazwisko=" + nazwisko + ", nrKarty=" + nrKarty + ", typKarty="
						+ typKarty.getState() + "]";
			}

		public void setTypKarty(TypKarty typKarty)
			{
				this.typKarty = typKarty;
			}

		public TypKarty getTypKarty()
			{
				return typKarty;
			}

	}
