import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Mirror Tree Conversion");
		System.out.println("----------------------");
		
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number of nodes in the binary tree");
			int sizeOfTree = scanner.nextInt();
			BinaryTree binaryTree = new BinaryTree(null);
			for(int index = 0; index < sizeOfTree; index++) {
				System.out.println("Enter the node value");
				binaryTree.SetBinaryTreeRoot(
				binaryTree.Insert(binaryTree.GetBinaryTreeRoot(), scanner.nextInt()));
			}
			System.out.println("-----The Inorder Traversal-----");
			binaryTree.InorderTraversal(binaryTree.GetBinaryTreeRoot());
			binaryTree.SetBinaryTreeRoot(binaryTree.GetMirrorTree(binaryTree.GetBinaryTreeRoot()));
			System.out.println("------Inorder Traversal after MirrorTree conversion");
			binaryTree.InorderTraversal(binaryTree.GetBinaryTreeRoot());
		}catch(Exception exception) {
			System.out.println("Thrown exception is "+exception.getMessage());
		}		
		
	}
}
