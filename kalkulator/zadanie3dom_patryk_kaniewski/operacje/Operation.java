package operacje;

import java.util.List;

public abstract class Operation
	{
		protected String operation = null;
		protected int priority = 0;
		protected boolean alignment = true;
		protected int argumentCount = 0;

		public Operation()
			{
				init();
				// jestem leniwy i latwiej copy paste
			}

		protected void init()
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
		// just debug prints nothing serious
//		public void printInfix(List<Double> lista) 
//			{
//				System.out.print(lista.get(1) + " " + operation + " " + lista.get(2));
//			}
//
//		public void printPostfix(List<Double> lista)
//			{
//				System.out.print(lista.get(1) + " " + lista.get(2) + " " + operation);
//			}
//
//		public void printPrefix(List<Double> lista)
//			{
//				System.out.print(lista.get(1) + " " + operation + " " + lista.get(2));
//			}
		// just debug prints nothing serious

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