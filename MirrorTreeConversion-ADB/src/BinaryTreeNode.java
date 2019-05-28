
public class BinaryTreeNode {
	private int data;
	private BinaryTreeNode leftNode;
	private BinaryTreeNode rightNode;
	
	public BinaryTreeNode(int data) {
		this.data = data;
	}
	
	public void SetBinaryTreeNode(int data) {
		this.data = data;
	}
	
	public void SetBinaryTreeNodeLeft(BinaryTreeNode leftNode) {
		this.leftNode = leftNode;
	}
	
	public void SetBinaryTreeNodeRight(BinaryTreeNode rightNode) {
		this.rightNode = rightNode;
	}
	
	public int GetBinaryTreeNodeData() {
		return this.data;
	}
	
	public BinaryTreeNode GetBinaryTreeNodeLeft() {
		return this.leftNode;
	}
	
	public BinaryTreeNode GetBinaryTreeNodeRight() {
		return this.rightNode;
	}
}
