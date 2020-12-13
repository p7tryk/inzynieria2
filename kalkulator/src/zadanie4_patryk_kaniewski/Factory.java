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
		LinkedList<Operation> oplist = new LinkedList<Operation>();


		public Factory()
			{
				populate();
			}

		public void populate()
			{
				oplist.add(new Potegowanie());
				oplist.add(new Mnozenie());
				oplist.add(new Dodawanie());
				
				System.out.println(oplist);
				
				oplist.forEach(temp -> {
					temp.debug();
				}); // much lambda such wow
			}

		public boolean containsKey(String token)
			{
				for (Operation temp : oplist)
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
				for (Operation temp : oplist)
				{
					if (token.equals(temp.key()))
						return temp.get();
				}
				return 0;
			}

		public boolean alignment(String token)
			{
				System.out.println("alignment " + token);
				for (Operation temp : oplist)
				{
					if (token.equals(temp.key()))
						return temp.alignment();
				}
				return true;
			}

		public double doOperation(double n1, String token, double n2)
			{
				for (Operation temp : oplist)
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
