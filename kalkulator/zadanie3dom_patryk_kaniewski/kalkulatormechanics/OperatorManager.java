package kalkulatormechanics;

import java.util.LinkedList;


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
				double n1;
				double n2;
				if(root.left == null && root.right == null)
					return root.getDouble();	
				
				if(root.left.isNumber())
					n1 = root.left.getDouble();
				else
					n1 = calculate(root.left);
				if(root.right.isNumber())
					n2 = root.right.getDouble();
				else
					n2 = calculate(root.left);
					
				
				//Lambda this out maybe with prints?
				double temp = doOperation(n2,root.getValue(),n1);
				//System.out.print("doing:" + n2 + " " + root.getValue() + " " + n1 + " = "+ temp);
				return temp;
		}
		public void printInfix(Node root)
		{
				if(root.right != null)
					printInfix(root.right);
				
				System.out.print(root.getValue());
				System.out.print(" ");
				

				if(root.left != null)
					printInfix(root.left);
		}
		public void printPostfix(Node root)
		{
				if(root.right != null)
					printInfix(root.right);
				
				if(root.left != null)
					printInfix(root.left);

				System.out.print(root.getValue());
				System.out.print(" ");
		}
		public void printPrefix(Node root)
		{
				System.out.print(root.getValue());
				System.out.print(" ");
				
				if(root.right != null)
					printInfix(root.right);
				
				if(root.left != null)
					printInfix(root.left);
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
