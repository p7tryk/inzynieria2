package kalkulator;

import java.util.Scanner;

public class Main
	{

		public static void main(String[] args)
			{
				// TODO Auto-generated method stub

				Scanner in = new Scanner(System.in);
				while (true)
				{
					System.out.println();
					System.out.println("podaj wyrazenie np 2 + 2 * 2");
					String input = in.nextLine();
					Kalkulator kalkulator = new Kalkulator(input);
				}

				
			}

	}
