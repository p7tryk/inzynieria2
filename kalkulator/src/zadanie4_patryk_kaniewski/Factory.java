package zadanie4_patryk_kaniewski;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import operacje.Dodawanie;
import operacje.Mnozenie;
import operacje.Operation;
import operacje.Potegowanie;

public class Factory
	{
		List<Operation> lista = null;

		public Factory()
			{
				lista = new LinkedList<Operation>();
				populate();
			}

		public void populate()
			{
				Operation test;
				Operation test1 = new Mnozenie();
				lista.add(test1);
				Operation test2 = new Potegowanie();
				lista.add(test2);
				Operation test3 =  new Dodawanie();
				lista.add(test3);
				
				System.out.println(lista);
				lista.forEach(temp -> {
					temp.debug();
				}); // much lambda such wow
			}

		public boolean containsKey(String token)
			{
				for (Operation temp : lista)
				{
					if (token.equals(temp.key()))
					{
						System.out.println("true containsKey " + token);
						return true;
					}
				}
				System.out.println("false containsKey " + token);
				return false;
			}

		public int get(String token)
			{
				System.out.println("get " + token);
				for (Operation temp : lista)
				{
					if (token.equals(temp.key()))
						return temp.get();
				}
				return 0;
			}

		public boolean alignment(String token)
			{
				System.out.println("alignment " + token);
				for (Operation temp : lista)
				{
					if (token.equals(temp.key()))
						return temp.alignment();
				}
				return true;
			}

		public double doOperation(double n1, String token, double n2)
			{
				for (Operation temp : lista)
				{
					if (token.equals(temp.key()))
					{
						return temp.doOperation(n1, n2);
					}
				}
				System.out.println("unknown operation");
				return 0;
			}
	}
