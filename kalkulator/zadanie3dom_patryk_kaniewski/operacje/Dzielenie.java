package operacje;

public class Dzielenie extends Operation
	{
		@Override
		public void init()
		{
				//System.out.println("constructs dzielenie");
				operation = "/";
				priority = 2;
				alignment = true;
				//System.out.println(this);
		}
		@Override
		public double doOperation(double n1, double n2)
			{
				//System.out.println("dzielenie");
				return n1/n2; //TODO div by 0
			}
	}
