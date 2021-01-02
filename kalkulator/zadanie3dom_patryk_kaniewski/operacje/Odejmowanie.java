package operacje;

import java.util.List;

public class Odejmowanie extends Operation
	{
		@Override
		public void init()
		{
				//System.out.println("constructs odejmowanie");
				operation = "-";
				priority = 1;
				alignment = true;
				argumentCount = 2;
				//System.out.println(this);
		}
		@Override
		public double doOperation(List<Double> lista)
			{
				return lista.get(1)-lista.get(0);
			}
	}
