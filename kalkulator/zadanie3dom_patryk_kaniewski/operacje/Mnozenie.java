package operacje;

public class Mnozenie extends Operation
	{
		@Override
		public void init()
		{
				//System.out.println("constructs mnozenie");
				operation = "*";
				priority = 2;
				alignment = true;
				//System.out.println(this);
		}
		@Override
		public double doOperation(double n1, double n2)
			{
				//System.out.println("mnozenie");
				return n1*n2;
			}
	}
