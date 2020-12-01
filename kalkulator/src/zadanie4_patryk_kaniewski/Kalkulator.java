package zadanie4_patryk_kaniewski;

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
				//TODO stop creating new object and do it properly
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
				//https://eduinf.waw.pl/inf/alg/001_search/0118.php
				//w koncu zrobione logicznie 
				System.out.println(input);
				
				Node temp = null;
				Stack<Node> stack = new Stack<Node>();
				for(String element : input)
				{
					temp = new Node(element);
					if(!isNumber(element))
					{
						temp.left = stack.pop();
						temp.right = stack.pop();
					}
					stack.push(temp);
				}
				tree = new binaryTree(stack.pop());
		}
		
		private List<String> tokenizer(String input)
		{ 
			//TODO better tokenization
			List<String> lista;
			lista = Arrays.asList(input.split(" "));
			
			return lista;
		}

		private void validate(List<String> input) throws Exception
		{
			//TODO input validation
			//throw new Exception("invalid input");
		}
		
		private Queue<String> convert(List<String> input) throws Exception
			{
				
				try
				{
					validate(input);
				} catch (Exception e)
				{
					e.printStackTrace();
					System.exit(-1);
				}
				

				Queue<String> queue = new LinkedList<>();
				Stack<String> stack = new Stack<>();

				for (String token : input)
				{
					if ("(".equals(token))
					{
						stack.push(token);
						continue;
					}

					if (")".equals(token))
					{
						while (!"(".equals(stack.peek()))
						{
							queue.add(stack.pop());
						}
						stack.pop();
						continue;
					}
					if (order.containsKey(token)) //operator mapped
					{
						while (!stack.empty() && order.get(token) < order.get(stack.peek()))
						{
							if(token.equals("^") && order.get(token) <= order.get(stack.peek())) //TODO standaryzowac lewostronnie laczne operatory
									break;
							queue.add(stack.pop());
						}
						stack.push(token);
						continue;
					}

					if (isNumber(token))
					{
						queue.add(token);
						continue;
					}
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
