package operacje;

import java.util.List;

public class Dodawanie extends Operation
	{
		@Override
		protected void init()
			{
				// System.out.println("constructs dodawanie");
				operation = "+";
				priority = 1;
				alignment = true;
				argumentCount = 2;
				// System.out.println(this);
			}

		@Override
		public double doOperation(List<Double> lista)
			{
				// System.out.println("dodawanie");
				return lista.get(1) + lista.get(0);
			}
	}
