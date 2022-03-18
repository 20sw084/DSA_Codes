
public class BinaryTree {
	Object root;
	BinaryTree left,right;
	public BinaryTree(Object root, BinaryTree left, BinaryTree right) {
		super();
		this.root = root;
		this.left = left;
		this.right = right;
	}
	public BinaryTree(Object root) {
		super();
		this.root = root;
	}
	public Object getRoot() {
		return root;
	}
	public void setRoot(Object root) {
		this.root = root;
	}
	public BinaryTree getLeft() {
		return left;
	}
	public void setLeft(BinaryTree left) {
		this.left = left;
	}
	public BinaryTree getRight() {
		return right;
	}
	public void setRight(BinaryTree right) {
		this.right = right;
	}
	// In Order Traversal
//	@Override
//	public String toString() {
//		StringBuffer buf=new StringBuffer("");
//		if(left!=null) {
//			buf.append(left+",");
//		}
//		buf.append(root);
//		if(right!=null) {
//			buf.append(","+right);
//		}
//		
//		return buf + "";
//	}

	// Pre Order Traversal
//	@Override
//	public String toString() {
//		StringBuffer buf=new StringBuffer("");
//		buf.append(root);
//		if(left!=null) {
//			buf.append(","+left);
//		}
//		if(right!=null) {
//			buf.append(","+right);
//		}
//		
//		return buf + "";
//	}
	
	// Post Order Traversal
	@Override
	public String toString() {
		StringBuffer buf=new StringBuffer("");
		if(left!=null) {
			buf.append(left+",");
		}
		if(right!=null) {
			buf.append(right+",");
		}
		buf.append(root);
		
		return buf + "";
	}
	public static void main(String[] args) {
		BinaryTree treeB =new BinaryTree("B");
		BinaryTree treeD =new BinaryTree("D");
		BinaryTree treeE =new BinaryTree("E");
		BinaryTree treeC =new BinaryTree("C",treeD,treeE);
		BinaryTree tree =new BinaryTree("A",treeB,treeC);
		
		
		System.out.println(tree);
		
	}
}
