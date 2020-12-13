package operacje;

public class Odejmowanie extends Operation
	{
		@Override
		public void init()
		{
				//System.out.println("constructs odejmowanie");
				operation = "-";
				priority = 1;
				alignment = true;
				//System.out.println(this);
		}
		@Override
		public double doOperation(double n1, double n2)
			{
				//System.out.println("odejmowanie");
				return n1-n2;
			}
	}
