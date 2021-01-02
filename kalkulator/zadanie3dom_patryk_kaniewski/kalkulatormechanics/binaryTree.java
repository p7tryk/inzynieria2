package kalkulatormechanics;

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

		public Node getRoot()
			{
				return root;
			}
	}
