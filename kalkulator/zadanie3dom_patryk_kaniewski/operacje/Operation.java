package operacje;

import java.util.List;

public abstract class Operation
	{
		String operation = null;
		int priority = 0;
		boolean alignment = true;
		int argumentCount = 0;

		public Operation()
			{
				init();
			}

		public void init()
			{
				System.out.println("unmasked method");
			}

		public int get()
			{
				return priority;
			}

		public String key()
			{
				return operation;
			}

		public double doOperation(List<Double> lista)
			{
				System.out.println("unmasked method");
				return 0;
			}

		public boolean alignment()
			{
				return alignment;
			}

		public int getArgumentCount()
			{
				return argumentCount;
			}

		public void printInfix(List<Double> lista) // just debug prints nothing serious
			{
				System.out.print(lista.get(1) + " " + operation + " " + lista.get(2));
			}

		public void printPostfix(List<Double> lista)
			{
				System.out.print(lista.get(1) + " " + lista.get(2) + " " + operation);
			}

		public void printPrefix(List<Double> lista)
			{
				System.out.print(lista.get(1) + " " + operation + " " + lista.get(2));
			}

		@Override
		public String toString()
			{
				return "operacja " + operation + " " + priority + " " + (alignment ? "lewo" : "prawo");
			}

		public void debug()
			{
				System.out.println(this);
			}

	}