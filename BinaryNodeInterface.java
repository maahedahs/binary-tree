
public interface BinaryNodeInterface<T> {
	
	// These methods set the data, left child, and right child of a 
	// binary node
	public void setData(T newData);
	public void setLeftChild(BinaryNode<T> newLeftChild);
	public void setRightChild(BinaryNode<T> newRightChild);
	
	// These methods return the data, left child, and right child of
	// of a binary node
	public T getData();
	public BinaryNode<T> getLeftChild();
	public BinaryNode<T> getRightChild();
	
	// Copies the subtree rooted at the BinaryNode object who calls
	// the method
	public BinaryNode<T> copy();
	
	// Performs preorder traversal of a subtree rooted at a BinaryNode
	// object who calls the method
	public void preOrder();
	
	// Performs inorder traversal of a subtree rooted at a BinaryNode
	// object who calls the method
	public void inOrder();
	
	// Performs postorder traversal of a subtree rooted at a BinaryNode
	// object who calls the method
	public void postOrder();
	
	// returns the number of nodes of a subtree rooted at a BinaryNode
	// object who calls the method
	public int getNumberOfNodes();
	
	// Returns the height of a subtree rooted at a BinaryNode object who
	// calls the method
	public int getHeight();
	
	// Returns the data of the right most node of a subtree rooted at a
	// BinaryNode object who calls the method
	public T getRightmostData();
	
	// Returns the data of the left most node of a subtree rooted at a
	// BinaryNode object who calls the method
	public T getLeftmostData();
	
}
