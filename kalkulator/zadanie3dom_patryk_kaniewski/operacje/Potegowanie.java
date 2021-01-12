package operacje;

import java.util.List;

public class Potegowanie extends Operation
	{
		@Override
		protected void init()
			{
				// System.out.println("constructs potegowanie");
				operation = "^";
				priority = 3;
				alignment = false;
				argumentCount = 2;
				// System.out.println(this);
			}

		@Override
		public double doOperation(List<Double> lista)
			{
				return Math.pow(lista.get(1), lista.get(0));
			}
	}
