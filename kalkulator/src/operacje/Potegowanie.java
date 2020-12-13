package operacje;

public class Potegowanie extends Operation
	{
		@Override
		public void init()
		{
				System.out.println("constructs potegowanie");
				operation = "^";
				priority = 3;
				alignment = false;
				System.out.println(this);
		}
		@Override
		public double doOperation(double n1, double n2)
			{
				System.out.println("dodawanie");
				return Math.pow(n1,n2);
			}
	}
