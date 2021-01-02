package operacje;

import java.util.List;

import kalkulatormechanics.Node;

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
		public double doOperation(List<Double> lista)
			{
				return lista.get(0)*lista.get(1);
			}
	}
