package zadanie3_patryk_kaniewski;

import java.util.Scanner;

public class Main
	{
		public static void treetest()
		{
				//tree test
				binaryTree tree = new binaryTree("+");
				/*
				 * 	2+2*2
				 * 					+
				 * 			*				2
				 * 		2		2
				 * 
				 *  = 6
				 */
				tree.root.left = new Node("*");
				tree.root.left.left = new Node("2");
				tree.root.left.right = new Node("2");
				tree.root.right = new Node("2");
				tree.calculate();
		}
		public static void main(String[] args) throws Exception
			{
				
				//treetest();
				
				Scanner in = new Scanner(System.in);
				while (true)
				{
					System.out.println();
					System.out.println("podaj wyrazenie oddzielone spacjami np ( 2 + 2 ) * 2");
					String input = in.nextLine();
					Kalkulator kalkulator = new Kalkulator(input);
				}

				
				
			}

	}
