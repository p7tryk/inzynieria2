package kalkulatormechanics;

import java.util.LinkedList;
import java.util.List;

public class Node
	{
		// public Node prev; // TODO WTF??????????
		private String key; // TODO private + getters setters
		private List<Node> lista;

		public boolean isNumber()
			{
				return isNumber(key);
			}

		private boolean isNumber(String str)
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

		public void addChild(Node input)
			{
				lista.add(input);
			}

		public List<Node> getChildren()
			{
				return lista;
			}

		public int size()
			{
				return lista.size();
			}

		public Node get(int input)
			{
				return lista.get(input);
			}

//		public Node change(double input)
//		{
//				key = String.valueOf(input);
//				return this;
//		}

		public Node(String data)
			{
				key = data;
				lista = new LinkedList<Node>();
			}

		public Node(double data)
			{
				key = String.valueOf(data);
				lista = new LinkedList<Node>();
			}

		public double getDouble()
			{
				return Double.valueOf(key);
			}

		public String getValue()
			{
				return key;
			}

		public String toString()
			{
				return key + " ";
			}
	}