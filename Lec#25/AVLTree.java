public class AVLTree {
	
	private int key,height;
	private AVLTree left,right;
	public static final AVLTree NIL=new AVLTree();
	private AVLTree() {
		setRight(this);
		setLeft(getRight());
	}
	public AVLTree(int key) {
		setKey(key);
		setRight(NIL);
		setLeft(getRight());
	}
	private AVLTree(int key, AVLTree left, AVLTree right) {
		super();
		this.key = key;
		this.left = left;
		this.right = right;
		this.height=1+ Math.max(getLeft().height, getRight().height);
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public AVLTree getLeft() {
		return left;
	}
	public void setLeft(AVLTree left) {
		this.left = left;
	}
	public AVLTree getRight() {
		return right;
	}
	public void setRight(AVLTree right) {
		this.right = right;
	}
	
	// Size Method
	
	public int size() {
		if(this==NIL) {
			return 0;
		}
		return 1+ getLeft().size()+ getRight().size();
	}
	
	// Print Tree
	
	public String toString() {
		if(this==NIL) return "";
		return getLeft()+" "+getKey()+" "+getRight();
	}
	
	// Add Method
	
	public boolean add(int key) {
		int oldSize=size();
		grow(key);
		return size()>oldSize;
	}
	
	// Grow Method
	
	public AVLTree grow(int key) {
		if(this==NIL) {
			return new AVLTree(key);
		}
		if(key==this.getKey()) {
			return this;
		}
		if(key<this.getKey()) {
			setLeft(getLeft().grow(key));
		}
		else
		{
			setRight(getRight().grow(key));
		}
		reBalance();
		height=1+Math.max(getLeft().height, getRight().height);
		return this;
	}
	
	// rotating tree to left side
	
	public void rotateLeft() {
		setLeft(new AVLTree(getKey(),getLeft(),getRight().getLeft()));
		setKey(getRight().getKey());
		setRight(getRight().getRight());
	}
	
	// rotating tree to right side
	
	public void rotateRight() {
		setRight(new AVLTree(getKey(),getLeft().getRight(),getRight()));
		setKey(getLeft().getKey());
		setLeft(getLeft().getLeft());
	}
	
	// Balance Tree
	
	public void reBalance() {
 		if(getRight().height>getLeft().height) {
 			if(getRight().getLeft().height>getRight().getRight().height) {
 				getRight().rotateRight();
 			}
 			this.rotateLeft();
 		}
 		else if (getRight().height<getLeft().height) {
 			if(getLeft().getRight().height>getLeft().getLeft().height) {
 				getLeft().rotateRight();
 			}
 			this.rotateRight();
 		}
 	}
	
//	public static void main(String[] args) {
//		AVLTree treeB =new AVLTree("B");
//		AVLTree treeD =new AVLTree("D");
//		AVLTree treeE =new AVLTree("E");
//		AVLTree treeC =new AVLTree("C",treeD,treeE);
//		AVLTree tree =new AVLTree("A",treeB,treeC);
//		System.out.println(tree.inOrderTraversal());
//		System.out.println(treeC.isLeaf());
//		System.out.println(treeC.size());
////		System.out.println(treeC.contains("C"));
////		tree.swap();
////		System.out.println(tree.contains("A"));
////		System.out.println(tree.contains("J"));
//		System.out.println(tree.Right_Most_Of_Left());
//		System.out.println(tree.Left_Most_Of_Right());
//		System.out.println(tree.isFull());
//		System.out.println(tree.insert(tree,67));
//	}
}	
