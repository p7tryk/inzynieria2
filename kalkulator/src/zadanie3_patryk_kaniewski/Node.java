package zadanie3_patryk_kaniewski;


class Node
{
	public Node prev; //WTF?????
	public String key; 	//TODO private + getters setters
	public Node left, right;

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
	private double doOperation(double n1, String operation, double n2)
		{
			switch(operation)
			{
			case "+":
				return n1+n2;
			case "-":
				return n1-n2;
			case "*":
				return n1*n2;
			case "/": //TODO dzielenie przez zero
				return n1/n2;
			case "%":
				return n1 % n2;
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

	public String getValue()
		{
			return key;
		}

	public double calculate()
		{
			if(left == null)
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
				n2 = Integer.parseInt(right.getValue());
			
			wynik = doOperation(n1,key,n2);
			System.out.println(n1 + key + n2 + "=" + wynik);
			
			return wynik;
		}
	public void print()
	{
			if(!(left==null))
				left.print();
			System.out.print(key);
			if(!(right==null))
				right.print();	
	}
	public String toString()
	{
			return key;
	}
}