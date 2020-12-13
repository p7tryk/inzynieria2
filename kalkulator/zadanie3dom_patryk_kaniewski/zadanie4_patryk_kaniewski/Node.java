package zadanie4_patryk_kaniewski;

public class Node
	{
		// public Node prev; // TODO WTF??????????
		private String key; // TODO private + getters setters
		public Node left, right;

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

		private double doOperation(double n1, String operation, double n2)
			{
				switch (operation)
				{
				case "+":
					return n2 + n1;
				case "-":
					return n2 - n1;
				case "*":
					return n2 * n1;
				case "/": // TODO dzielenie przez zero
					return n2 / n1;
				case "%":
					return n2 % n1;
				case "^":
					return Math.pow(n2, n1);
				}
				return 0;
			}

		public Node(String data)
			{
				key = data;
				left = right = null;
			}

		public Node(double data)
			{
				key = String.valueOf(data);
				left = right = null;
			}

		public double getDouble()
			{
				return Double.valueOf(key);
			}

		public String getValue()
			{
				return key;
			}

		public double calculate()
			{
				// TODO fix for unary operators
				if (left == null)
					return 0;
				double wynik;
				double n1, n2;

				if (!isNumber(left.getValue()))
					n1 = left.calculate();
				else
					n1 = Integer.parseInt(left.getValue());
				if (!isNumber(right.getValue()))
					n2 = right.calculate();
				else if (right == null)
					n2 = 0;
				else
					n2 = Double.valueOf(right.getValue());

				wynik = doOperation(n1, key, n2);
				System.out.println(n2 + key + n1 + "=" + wynik);

				return wynik;
			}

		public void printInfix()
			{
				if (!(right == null))
					right.printInfix();
				System.out.print(toString());
				if (!(left == null))
					left.printInfix();
			}

		public void printPostfix()
			{
				if (!(right == null))
					right.printPostfix();
				if (!(left == null))
					left.printPostfix();
				System.out.print(toString());
			}

		public void printPrefix()
			{
				System.out.print(toString());
				if (!(right == null))
					right.printPrefix();
				if (!(left == null))
					left.printPrefix();
			}

		public String toString()
			{
				return key + " ";
			}
	}