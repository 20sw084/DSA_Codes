
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
	public boolean isLeaf() {
		if(left==null && right==null) {
			return true;
		}
		return false;
	}
	public int size() {
		if(left==null && right==null) {
			return 1;
		}
		if(left==null) {
			return 1+right.size();
		}
		if(right==null) {
			return 1+left.size();
		}
		return 1+left.size()+right.size();
	}
	public int height() {
		if(root==null) {
			return -1;
		}
		int leftN=0,rightN=0;
		if(left!=null) leftN=1+left.height();
		if(right!=null) rightN=1+right.height();
		
		return (leftN>rightN)?leftN:rightN;
	}
	public boolean contains(Object target) {
		// Approach 1 (MINE ONE)
//		if(root==target) {
//			return true;
//		}
//		boolean present=false;
//		if(left!=null) {
//			present = left.contains(target);
//			if(present==true) {
//				return present;
//			}
//		}
//		if(right!=null) {
//			present = right.contains(target);
//			if(present==true) {
//				return present;
//			}
//		}
//		return present;
		
		//Approach 2  (BY Teacher)
	if(root==target) {
	return true;
	}
	boolean present=false;
	if(left!=null) {
		if(left.toString().contains(target.toString()))  return true;
		present=left.contains(target);
	}
	if(right!=null) {
		if(right.toString().contains(target.toString()))  return true;
	present=right.contains(target);
	}
	return present;
	}
	
	
	public boolean isFull() {
		int height=height();
		int size=size();
		int match=(int) Math.pow(2,height+1);
		match--;
//		System.out.println(size+" , "+height+" , "+match);
		return (match==size);
	}

	// Swap the left and right tree;
	public void swap() {
		if(left==null || right==null) {
			System.out.println("SWAP not possible.");
			return;
		}
		BinaryTree temp=left;
		left=right;
		right=temp;
	}
	
	// Find out the right most node of the left tree
	
	public BinaryTree Right_Most_Of_Left() {
		if(root==null) {
			return null;
		}
		if(left!=null) {
			for(BinaryTree i=left;i!=null;i=i.getRight()) {
				if(i.getRight()==null)
				{
					return i;
				}
			}
		}
		return null;	
	}
	
	
	// Find out the left most node of the right tree
	
	public BinaryTree Left_Most_Of_Right() {
		if(root==null) {
			return null;
		}
		if(right!=null) {
			for(BinaryTree i=right;i!=null;i=i.getLeft()) {
				if(i.getLeft()==null)
				{
					return i;
				}
			}
		}
		return null;	
	}
	public static void main(String[] args) {
		BinaryTree treeB =new BinaryTree("B");
		BinaryTree treeD =new BinaryTree("D");
		BinaryTree treeE =new BinaryTree("E");
		BinaryTree treeC =new BinaryTree("C",treeD,treeE);
		BinaryTree tree =new BinaryTree("A",treeB,treeC);
		
		tree.swap();
		
		System.out.println(tree);
		System.out.println(tree.isLeaf());
		System.out.println(tree.size());
		System.out.println(tree.height());
		System.out.println(tree.contains("C"));
		System.out.println(tree.contains("B"));
		System.out.println(tree.contains("D"));
		System.out.println(tree.contains("E"));
		System.out.println(tree.contains("A"));
		System.out.println(tree.contains("J"));

		System.out.println(tree.Right_Most_Of_Left());
		System.out.println(tree.Left_Most_Of_Right());
		
		System.out.println(tree.isFull());
		
	}
}
