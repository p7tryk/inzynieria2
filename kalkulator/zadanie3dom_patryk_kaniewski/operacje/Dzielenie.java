package operacje;

import java.util.List;

import kalkulatormechanics.Node;

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
		public double doOperation(List<Double> lista)
			{

				return lista.get(0)/lista.get(1); //TODO div#0
			}
	}
