package zadanie3_patryk_kaniewski;

import java.util.Stack;

public class binaryTree
	{
		Node root;

		binaryTree(String input)
			{
				root = new Node(input);
			}
		binaryTree(Node input)
		{
				root = input;
		}
		public double calculate()
		{
			return  root.calculate();
		}
		public void printInfix()
		{
			root.printInfix();
			System.out.println();
		}
		public void printPostfix()
		{
			root.printPostfix();
			System.out.println();
		}
		public void printPrefix()
		{
			root.printPrefix();
			System.out.println();
		}
		public String toString()
		{
			//TODO display tree
			Stack<Node> stack;
			return null;
		}
		public Node getRoot()
		{
			return root;
		}
	}
