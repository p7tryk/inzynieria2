package zadanie3_patryk_kaniewski;

import java.util.ArrayList;
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
		
		public Kalkulator(String input)
			{
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
				Node temp;
				for(String token: input)
				{
					System.out.println(token);
					temp = new Node(token);
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
				
				System.out.println(stack);
				
				tree = new binaryTree(stack.pop());
				temp=tree.getRoot();
				while(!stack.isEmpty())
				{
					temp.left = stack.pop();
					if(stack.isEmpty())
					{
						temp.right = stack.pop();
					}
					temp = temp.left;
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
		
		private Queue<String> convert(List<String> input)
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
				Map<String, Integer> order = new HashMap<>();
				order.put("^", 3);
				order.put("/", 2);
				order.put("*", 2);
				order.put("+", 1);
				order.put("-", 1);
				order.put("(", 0);

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
						while (!stack.empty() && order.get(token) <= order.get(stack.peek()))
						{
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
		
		
		
		private double calculate()
		{
			
			double output = tree.calculate();
			System.out.print("wynik =");
			System.out.println(output);
			return output;
		}
	}
