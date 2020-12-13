package operacje;


public class Dodawanie extends Operation
	{
		@Override
		public void init()
		{
				System.out.println("constructs dodawanie");
				operation = "+";
				priority = 1;
				alignment = true;
				System.out.println(this);
		}
		@Override
		public double doOperation(double n1, double n2)
			{
				System.out.println("dodawanie");
				return n1+n2;
			}
	}
