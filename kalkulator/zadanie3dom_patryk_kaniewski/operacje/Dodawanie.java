package operacje;

import java.util.List;

import kalkulatormechanics.Node;

public class Dodawanie extends Operation
	{
		@Override
		public void init()
		{
				//System.out.println("constructs dodawanie");
				operation = "+";
				priority = 1;
				alignment = true;
				//System.out.println(this);
		}
		@Override
		public double doOperation(List<Double> lista)
			{
				//System.out.println("dodawanie");
				return lista.get(0)+lista.get(1);
			}
	}
