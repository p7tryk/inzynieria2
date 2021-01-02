package kalkulatormechanics;

import java.util.LinkedList;
import java.util.List;

import operacje.Dodawanie;
import operacje.Dzielenie;
import operacje.Mnozenie;
import operacje.Modulo;
import operacje.Odejmowanie;
import operacje.Operation;
import operacje.Potegowanie;

public final class OperatorManager
	{
		LinkedList<Operation> oplist = new LinkedList<Operation>();


		public OperatorManager()
			{
				populate();
			}

		public void populate() //factory
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
				//but its composite
				List<Double> listaobecna = new LinkedList<Double>(); 
				if(root.size()==0)
					return root.getDouble();	
			
				root.getChildren().forEach(node -> {
					if(node.isNumber())
						listaobecna.add(node.getDouble());
					else
						listaobecna.add(calculate(node));
				}); //such lambda much wow
				
				return doOperation(root.getValue(),listaobecna); //this is slightly less stupid now
		}
		public void printInfix(Node root)
		{
				if(root.size()>1) //right
					printInfix(root.get(1));
				
				System.out.print(root.getValue());
				System.out.print(" ");
				

				if(root.size()>0) //left
					printInfix(root.get(0));
		}
		public void printPostfix(Node root)
		{
				if(root.size()>1) //right
					printPostfix(root.get(1));
				
				if(root.size()>0) //left
					printPostfix(root.get(0));

				System.out.print(root.getValue());
				System.out.print(" ");
		}
		public void printPrefix(Node root)
		{

				System.out.print(root.getValue());
				System.out.print(" ");
				
				if(root.size()>1) //right
					printPrefix(root.get(1));
				
				if(root.size()>0) //left
					printPrefix(root.get(0));
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
				return 0; //doesn't actually happen because of tree building process
			}

		public boolean alignment(String token)
			{
				//System.out.println("alignment " + token);
				for (Operation temp : oplist)
				{
					if (token.equals(temp.key()))
						return temp.alignment();
				}
				return true; //doesn't actually happen because of tree building process
			}
		public int getArgumentCount(String token)
			{
				//System.out.println("alignment " + token);
				for (Operation temp : oplist)
				{
					if (token.equals(temp.key()))
						return temp.getArgumentCount();
				}
				return 0; //doesn't actually happen because of tree building process
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
				System.out.println("unknown operation"); //doesn't actually happen because of tree building process
				return 0;
			}
		
	}
