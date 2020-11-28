package zadanie3_patryk_kaniewski;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;


public class Kalkulator
	{
		//TODO sane private vs public
		private binaryTree tree;
		Map<String, Integer> order = new HashMap<>();

		private void genHash()
		{
				order.put("%", 2);
				order.put("^", 3);
				order.put("/", 2);
				order.put("*", 2);
				order.put("+", 1);
				order.put("-", 1);
				order.put("(", 0);
		}
		public Kalkulator(String input) throws Exception
			{
				genHash();
				growTree((convert(tokenizer(input))));
				calculate();
			}

		static boolean isNumber(String str)
			{
				try
				{
					Double.valueOf(str);
					return true;
				} catch (Exception e)
				{
					return false;
				}
			}
		private void growTree(Queue<String> input)
		{
				System.out.println(input);
				Stack<Node> stack = new Stack<Node>();
				Node temp = null;
				Node prev;
				for(String token: input)
				{
					System.out.println(token);
					prev = temp;
					temp = new Node(token);
					temp.prev = prev;
					if(isNumber(token))
					{
						stack.push(temp);
					}
					else
					{
						temp.left = stack.pop();
						if(!stack.isEmpty())
							temp.right = stack.pop();
						stack.push(temp);
					}
				}
				
				//System.out.println(stack);
				
				tree = new binaryTree(stack.pop());
				temp=tree.getRoot();
				
				//TODO rozwinac prawa strone drzewka
				while(!stack.isEmpty())
				{
					temp.left = stack.pop();
					if(!stack.isEmpty())
					{
						temp.right = stack.pop();
					}
					if(isNumber(temp.left.getValue()))
					{
						if(isNumber(temp.right.getValue()))
						{
							temp = temp.prev;
						}
						else
						{
							temp = temp.right;
						}
					}
					else
						temp=temp.left;
					
				//temp = temp.left;
				}
				tree.print();
		}
		
		private List<String> tokenizer(String input)
		{ 
			//TODO lepsza tokenizacja
			List<String> lista;
			lista = Arrays.asList(input.split(" "));
			
			return lista;
		}

		private void validate() throws Exception
		{
			//throw new Exception("invalid input");
		}
		
		private Queue<String> convert(List<String> input) throws Exception
			{
				//TODO input validation
				try
				{
					validate();
				} catch (Exception e)
				{
					e.printStackTrace();
					System.exit(-1);
				}
				

				Queue<String> queue = new LinkedList<>();
				Stack<String> stack = new Stack<>();

				for (String token : input)
				{
					if(isNumber(token))
					{
						queue.add(token);
					}
					else if(!token.equals("(") && !token.equals(")"))
					{
						while(!stack.isEmpty() && order.get(token) <= order.get(stack.peek()))
						{
							queue.add(stack.pop());
						}
					}
					else if(token.equals("("))
					{
						stack.push(token);
					}
					else if(token.equals(")"))
					{
							while(!stack.peek().equals("("))
							{
								queue.add(stack.pop());
							}
					}
					else
						throw new Exception("invalid input");
				}
				
				//prepare return
				while (!stack.isEmpty())
				{
					queue.add(stack.pop());
				}

				return queue;
			}
		
		
		
		public double calculate()
		{
			
			double output = tree.calculate();
			tree.getRoot().printInfix();
			System.out.print("=");
			System.out.println(output);
			return output;
		}
	}
