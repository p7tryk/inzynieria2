package zadanie4_patryk_kaniewski;

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
				return root.calculate();
			}

		//TODO lambda the fuck out of it
		public void walktree(Runnable toRun)
		{
				Node newroot = root;
				walktree(toRun, root);
		}
		public void walktree(Runnable toRun, Node temp)
			{
				//left side
				while(temp!=null)
				{
					toRun.run();
					walktree(toRun, temp.left);
					walktree(toRun, temp.right);
				}
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

//		public String toString()
//		{
//			//TODO display tree
//			Stack<Node> stack;
//			return null;
//		}
		public Node getRoot()
			{
				return root;
			}
	}