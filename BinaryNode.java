
public class BinaryNode<T> implements BinaryNodeInterface<T> {
	
	private T data;
	private BinaryNode<T> leftChild;
	private BinaryNode<T> rightChild;
	
	public BinaryNode()
	{
		this(null, null, null);
	} // end default constructor
	
	public BinaryNode(T newData)
	{
		this(newData, null, null);
	} // end constructor
	
	public BinaryNode(T newData, BinaryNode<T> newLeftChild, 
							BinaryNode<T> newRightChild)
	{
		data = newData;
		leftChild = newLeftChild;
		rightChild = newRightChild;
	} // end constructor
	
	public void setData(T newData)
	{
		data = newData;
	} // end setData
	
	public void setLeftChild(BinaryNode<T> newLeftChild)
	{
		leftChild = newLeftChild;
	} // end setLeftChild
	
	public void setRightChild(BinaryNode<T> newRightChild)
	{
		rightChild = newRightChild;
	} // end setRightChild
	
	public T getData()
	{
		return data;
	} // end getData
	
	public BinaryNode<T> getLeftChild()
	{
		return leftChild;
	} // end getLeftChild
	
	public BinaryNode<T> getRightChild()
	{
		return rightChild;
	} // end getRightChild
	
	public BinaryNode<T> copy()
	{
		BinaryNode<T> newRoot = new BinaryNode<T>(data);
		if (leftChild != null) {
			newRoot.setLeftChild(leftChild.copy());
		}
		if (rightChild != null) {
			newRoot.setRightChild(rightChild.copy());
		}
		return newRoot;
	} // end copy
	
	public void preOrder()
	{
		System.out.println(data);
		
		if (leftChild != null) {
			leftChild.preOrder();
		}
		
		if (rightChild != null) {
			rightChild.preOrder();
		}
	} // end preOrder
	
	public void inOrder()
	{
		if (leftChild != null) {
			leftChild.inOrder();
		}
		
		System.out.println(data);
		
		if (rightChild != null) {
			rightChild.inOrder();
		}
	} // end inOrder
	
	public void postOrder()
	{
		if (leftChild != null) {
			leftChild.postOrder();
		}
		
		if (rightChild != null) {
			rightChild.postOrder();
		}
		
		System.out.println(data);
	} // end postOrder
	
	public int getNumberOfNodes()
	{
		int leftNodes = 0;
		int rightNodes = 0;
		
		if (leftChild != null) {
			leftNodes = leftChild.getNumberOfNodes();
		}
		if (rightChild != null) {
			rightNodes = rightChild.getNumberOfNodes();
		}
		
		return 1 + leftNodes + rightNodes;
	} // end getNumberOfNodes
	
	public int getHeight()
	{
		int height = 0;
		int leftHeight = 0;
		int rightHeight = 0;
		
		if (leftChild != null) {
			leftHeight = leftChild.getHeight();
		}
		
		if (rightChild != null) {
			rightHeight = rightChild.getHeight();
		}
		
		height = 1 + Math.max(leftHeight, rightHeight);
		return height;
	} // end getHeight
	
	public T getLeftmostData()
	{
		if (leftChild == null) {
			return data;
		}
		else {
			return leftChild.getLeftmostData();
		}
	} // end getLeftmostData
	
	public T getRightmostData()
	{
		if (rightChild == null) {
			return data;
		}
		else {
			return rightChild.getRightmostData();
		}
	} // end getRightmostData
}
