
public class BinaryTree<T> implements BinaryTreeInterface<T> {
	
	private BinaryNode<T> root;
	
	public BinaryTree()
	{
		root = null;
	} // end default constructor
	
	public BinaryTree(T rootData)
	{
		root = new BinaryNode<T>(rootData);
	} // end constructor
	
	public BinaryTree(T rootData, BinaryTree<T> leftTree,
						BinaryTree<T> rightTree)
	{
		root = new BinaryNode<T>(rootData);
		
		if(leftTree == rightTree) {
			root.setLeftChild(leftTree.root);
			BinaryNode<T> newNode = leftTree.root.copy();
			root.setRightChild(newNode);
		}
		else {
			root.setLeftChild(leftTree.root);
			root.setRightChild(rightTree.root);
		}
	} // end constructor
	
	// Returns the root of a binary tree
	public BinaryNode<T> getRoot()
	{
		return root;
	} // end getRoot()
	
	public void preOrder(BinaryNode<T> node)
	{
		if (node != null) {
			System.out.println(node.getData());
			preOrder(node.getLeftChild());
			preOrder(node.getRightChild());
		}
	} // end preOrder
	
	public void inOrder(BinaryNode<T> node)
	{
		if (node != null) {
			inOrder(node.getLeftChild());
			System.out.println(node.getData());
			inOrder(node.getRightChild());
		}
	} // end inOrder
	
	public void postOrder(BinaryNode<T> node)
	{
		if (node != null) {
			postOrder(node.getLeftChild());
			postOrder(node.getRightChild());
			System.out.println(node.getData());
		}
	} // end postOrder
	
	public int getNumberOfNodes(BinaryNode<T> node)
	{
		int leftNodes = 0;
		int rightNodes = 0;
		
		if (node.getLeftChild() != null) {
			leftNodes = getNumberOfNodes(node.getLeftChild());
		}
		if (node.getRightChild() != null) {
			rightNodes = getNumberOfNodes(node.getRightChild());
		}
		
		return 1 + leftNodes + rightNodes;
	} // end getNumberOfNodes
	
	public int getHeight(BinaryNode<T> node)
	{
		int height = 0;
		
		if (node != null) {
			height = 1 + Math.max(getHeight(node.getLeftChild()), 
					getHeight(node.getRightChild()));
		}
		
		return height;
	} // end getHeight
	
	public T getLeftmostData(BinaryNode<T> node)
	{
		if (node.getLeftChild() == null) {
			return node.getData();
		}
		else {
			return getLeftmostData(node.getLeftChild());
		}
	} // end getLeftmostData
	
	public T getRightmostData(BinaryNode<T> node)
	{
		if (node.getRightChild() == null) {
			return node.getData();
		}
		else {
			return getRightmostData(node.getRightChild());
		}
	} // end getRightmostData
}
