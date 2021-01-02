package kalkulatormechanics;

import java.util.LinkedList;
import java.util.List;

import operacje.Dodawanie;
import operacje.Dzielenie;
import operacje.Mnozenie;
import operacje.Odejmowanie;
import operacje.Operation;
import operacje.Modulo;
import operacje.Potegowanie;

public final class OperatorManager
	{
		LinkedList<Operation> oplist = new LinkedList<Operation>();


		public OperatorManager()
			{
				populate();
			}

		public void populate()
			{
				oplist.add(new Potegowanie());
				oplist.add(new Mnozenie());
				oplist.add(new Dodawanie());
				oplist.add(new Odejmowanie());
				oplist.add(new Modulo());
				oplist.add(new Dzielenie());
				
				
//				System.out.println(oplist);
//				
//				oplist.forEach(temp -> {
//					temp.debug();
//				}); // much lambda such wow
			}
		public double calculate(Node root)
		{
				//im sick of this
				List<Double> listaobecna = new LinkedList<Double>(); 
				if(root.size()==0)
					return root.getDouble();	
			
				root.getChildren().forEach(node -> {
					if(node.isNumber())
					{
						listaobecna.add(node.getDouble());
					}
					else
						listaobecna.add(calculate(node));
					
				});
				
					
				
				

				return doOperation(root.getValue(),listaobecna); //this is stupid
		}
		public void printInfix(Node root)
		{
				if(root.size()<2) //right
					printInfix(root.get(2));
				
				System.out.print(root.getValue());
				System.out.print(" ");
				

				if(root.size()<1) //left
					printInfix(root.get(1));
		}
		public void printPostfix(Node root)
		{
				if(root.size()<2) //right
					printInfix(root.get(2));
				
				if(root.size()<1) //left
					printInfix(root.get(1));

				System.out.print(root.getValue());
				System.out.print(" ");
		}
		public void printPrefix(Node root)
		{
				System.out.print(root.getValue());
				System.out.print(" ");
				
				if(root.size()<2) //right
					printInfix(root.get(2));
				
				if(root.size()<1) //left
					printInfix(root.get(1));
		}
		

		public boolean containsKey(String token)
			{
				for (Operation temp : oplist)
				{
					if (token.equals(temp.key()))
					{
						//System.out.println("true containsKey " + token);
						return true;
					}
				}
				//System.out.println("false containsKey " + token);
				return false;
			}

		public int get(String token)
			{
				//System.out.println("get " + token);
				for (Operation temp : oplist)
				{
					if (token.equals(temp.key()))
						return temp.get();
				}
				return 0;
			}

		public boolean alignment(String token)
			{
				//System.out.println("alignment " + token);
				for (Operation temp : oplist)
				{
					if (token.equals(temp.key()))
						return temp.alignment();
				}
				return true;
			}

		public double doOperation(String token, List<Double> lista)
			{
				for (Operation temp : oplist)
				{
					if (token.equals(temp.key()))
					{
						return temp.doOperation(lista);
					}
				}
				System.out.println("unknown operation");
				return 0;
			}
		
	}
