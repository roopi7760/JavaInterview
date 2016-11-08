package interview;

public class BinaryTree {

	private class Node{
		private Node left;
		private Node right;
		private int data;
		
		public Node(int data){
			left = null;
			right = null;
			this.data = data;
		}
		public void setData(int data)
		{
			this.data = data;
		}
		public int getData()
		{
			return this.data;
		}
		
		public void setRight(Node right){
			this.right = right;
		}
		public Node getRight(){
			return this.right;
		}
		public void setLeft(Node left){
			this.left = left;
		}
		public Node getLeft(){
			return this.left;
		}
	}
	
	private Node root;
	public BinaryTree(){
		root = null;
	}
	
	public void insert(int data){
		Node node = new Node(data);
		if(root == null)
		{
			root= node;
			return;
		}
		Node current = root;
		Node parent = null;
		while(current != null)
		{
			parent = current;
			if(data > current.getData())
			{
				current = current.getRight();
			}
			else
				current = current.getLeft();
		}
		if(parent.getData() > data){
			parent.setLeft(node);
		}
		else
			parent.setRight(node);
	}
	
	public boolean search(int data){
		Node current = root;
		
		while(current != null)
		{
			if(current.getData() == data){
				
				return true;
			}
			else if(current.getData() > data){
				
				current = current.getLeft();
			}
			
			else
				current = current.getRight();
		}
		
		return false;
	}
	
	public int maxValue()
	{
		return maxValue(root);
	}
	public int maxValue(Node root)
	{
		int max=0;
		
		while(root.getRight() != null){
			max = root.getRight().getData();
			root = root.getRight();
		}
		
		return max;
	}
	
	public int minValue()
	{
		return minValue(root);
	}
	
	public int minValue(Node root)
	{
		int min = root.getData();
		while(root.getLeft()!= null)
		{
			min = root.getLeft().getData();
			root = root.getLeft();
		}
		System.out.println(min);
		return min;
	}
	
	public void postOrder(Node root){
		if(root==null)
			return;
		
		postOrder(root.getLeft());
		postOrder(root.getRight());
		System.out.print(root.getData() + "  ");
	}
	public void postOrder(){
		postOrder(root);
	}
	
	public void preOrder(Node root){
		if(root==null)
			return;
		System.out.print(root.getData() + "  ");
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}
	public void preOrder(){
		preOrder(root);
	}
	
	
	public void inOrder(Node root){
		if(root==null)
			return;
		inOrder(root.getLeft());
		System.out.print(root.getData() + "  ");
		inOrder(root.getRight());
	}
	public void inOrder(){
		inOrder(root);
	}
	
	public Node delete(int data, Node root){
		if(root == null)
			return root;
		if(root.getData() > data){
			root.setLeft(delete(data, root.getLeft()));
		}
		else if(root.getData() < data) 
			root.setRight(delete(data, root.getRight()));
		else
		{
			//no Child
			if(root.getRight() == null)
				return root.getLeft();
			//only single child
			else if(root.getLeft() == null)
				return root.getRight();
			
				root.setData(minValue(root.getRight()));
				root.setRight(delete(root.getData(), root.getRight()));
				
		}
		return root;
	}
	
	public void delete(int data)
	{
		root= delete(data, root);
	}
	
	public int LCA(Node root, int a , int b)
	{
		if(root == null)
			return -1;
		else if(root.getData() == a || root.getData() == b)
			return root.getData();
		else if(Math.max(a,b) < root.getData())
			return LCA(root.getLeft(),a,b);
		else if (Math.min(a, b) > root.getData())
			return LCA(root.getRight(),a,b);
		
		return root.getData();
	}
	
	public int LCA(int a, int b)
	{
		return LCA(root,a,b);
	}
	public static void main(String [] args)
	{
		BinaryTree b = new BinaryTree();
		b.insert(5);
		b.insert(6);
		b.insert(3);
		b.insert(8);
		b.insert(1);
		b.insert(11);
		b.insert(10);
		b.insert(15);
		b.insert(4);
		b.insert(7);
		System.out.println("InOrder");
		b.inOrder();
		System.out.println("\nPreOrder");
		b.preOrder();
		System.out.println("\nPostOrder");
		b.postOrder();
		
		System.out.println("\nMinimum value in tree is " + b.minValue());
		System.out.println("\nMaximum value in tree is " + b.maxValue());
		
		System.out.println("Lowest Common Ancestor  is " + b.LCA(1,0));
		
	}
}
