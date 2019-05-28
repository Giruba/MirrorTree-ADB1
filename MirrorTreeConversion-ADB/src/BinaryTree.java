
public class BinaryTree {
	private BinaryTreeNode root;
	
	public BinaryTree(BinaryTreeNode binaryTreeNode) {
		this.root = binaryTreeNode;
	}
	
	public void SetBinaryTreeRoot(BinaryTreeNode binaryTreeNode) {
		this.root = binaryTreeNode;
	}
	
	public BinaryTreeNode GetBinaryTreeRoot() {
		return this.root;
	}
	
	public BinaryTreeNode Insert(BinaryTreeNode binaryTreeNode, int data) {
		if(binaryTreeNode == null) {
			binaryTreeNode = new BinaryTreeNode(data);
			return binaryTreeNode;
		}
		
		if(binaryTreeNode.GetBinaryTreeNodeData() > data) {
			binaryTreeNode.SetBinaryTreeNodeLeft(Insert(binaryTreeNode.GetBinaryTreeNodeLeft(), data));
		}else {
			binaryTreeNode.SetBinaryTreeNodeRight(Insert(binaryTreeNode.GetBinaryTreeNodeRight(), data));
		}
		
		return binaryTreeNode;
	}
	
	public void InorderTraversal(BinaryTreeNode binaryTreeNode) {
		if(binaryTreeNode == null) {
			return;
		}
		InorderTraversal(binaryTreeNode.GetBinaryTreeNodeLeft());
		System.out.println(binaryTreeNode.GetBinaryTreeNodeData()+" ");
		InorderTraversal(binaryTreeNode.GetBinaryTreeNodeRight());
	}
	
	public BinaryTreeNode GetMirrorTree(BinaryTreeNode binaryTreeNode) {
		
		if(binaryTreeNode == null) {
			return null;
		}
		
		BinaryTreeNode leftNode = GetMirrorTree(binaryTreeNode.GetBinaryTreeNodeLeft());
		BinaryTreeNode rightNode = GetMirrorTree(binaryTreeNode.GetBinaryTreeNodeRight());
		
		BinaryTreeNode temp = leftNode;
		binaryTreeNode.SetBinaryTreeNodeLeft(rightNode);
		binaryTreeNode.SetBinaryTreeNodeRight(temp);
		
		return binaryTreeNode;
	}
}
