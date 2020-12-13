package operacje;

public class Operation
	{
		static String operation = null;
		static int priority = 0;
		static boolean alignment = true;

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

		public double doOperation(double n1, double n2)
			{
				System.out.println("unmasked method");
				return 0;
			}

		public boolean alignment()
			{
				return alignment;
			}

		public void printInfix(double n1, double n2)
			{
				System.out.print(n1 + " " + operation + " " + n2);
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