package patryk_kaniewski;

@objid("fb8fe4c4-042e-4627-ad2f-1e78475f83f6")
public class Kalkulator
	{
		@objid("7d3d3ee8-425e-4f33-9542-417e500d7a34")
		private int liczba2;

		@objid("880dcbe6-0cbd-4210-b37f-d38c5f291176")
		private int liczba1;

		@objid("6c6f4473-a26f-4294-bf88-c90fb40bb84c")
		public Operacja stan;

		@objid("96a735df-c2cb-4da0-bf21-f6903ed9b07e")
		public Kalkulator(Operacja stanPoczatkowy)
			{
				stan = stanPoczatkowy;
			}

		public Kalkulator(Operacja stanPoczatkowy,int p1, int p2)
			{
				stan = stanPoczatkowy;
				liczba1 = p1;
				liczba2 = p2;
			}

		@objid("81ebf0ab-89e8-4ade-a9ad-c6044fc75e5a")
		public int getLiczba2()
			{
				// Automatically generated method. Please delete this comment before entering
				// specific code.
				return this.liczba2;
			}

		@objid("0f158e9a-785b-4aa4-b485-4686ae1742fe")
		public void setLiczba2(int value)
			{
				// Automatically generated method. Please delete this comment before entering
				// specific code.
				this.liczba2 = value;
			}

		@objid("4d45d8bc-5ab1-4ad8-adfb-b95036005ce4")
		public int getLiczba1()
			{
				// Automatically generated method. Please delete this comment before entering
				// specific code.
				return this.liczba1;
			}

		@objid("b531561e-e007-445a-9c5c-34ae7ba68975")
		public void setLiczba1(int value)
			{
				// Automatically generated method. Please delete this comment before entering
				// specific code.
				this.liczba1 = value;
			}

		@objid("94e54cc4-c1d5-4102-a085-f609b4c48966")
		public void licz()
			{
				System.out.print("wynik=" + stan.licz(liczba1, liczba2) + "\n");
			}

		@objid("bc62b635-e6fc-4afc-8501-56c51177e656")
		public void setOperacja(Operacja p1)
			{
				stan = p1;
			}

	}
