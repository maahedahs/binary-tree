
public interface BinaryTreeInterface<T> {
	
	// Performs preorder traversal of a subtree rooted at a given node
	public void preOrder(BinaryNode<T> node);
	
	// Performs inorder traversal of a subtree rooted at a given node
	public void inOrder(BinaryNode<T> node);
	
	// Performs postorder traversal of a subtree rooted at a given node
	public void postOrder(BinaryNode<T> node);
	
	// Returns the number of nodes of a subtree rooted at a given node
	public int getNumberOfNodes(BinaryNode<T> node);
	
	// Returns the height of a subtree rooted at a given node
	public int getHeight(BinaryNode<T> node);
	
	// Returns the data of the left most node of a subtree rooted at a 
	// given node
	public T getLeftmostData(BinaryNode<T> node);
	
	// Returns the data of the right most node of a subtree rooted at a 
	// given node
	public T getRightmostData(BinaryNode<T> node);
}
