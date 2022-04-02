import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	private Object data;
	private BinaryTree left,right;
	public BinaryTree(Object data) {
		this.data=data;
	}
	public BinaryTree(Object data,BinaryTree left,BinaryTree right) {
		this.data=data;
		this.left=left;
		this.right=right;
	}
	public void setData(Object data) {
		this.data=data;
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
	public Object getData() {
		return data;
	}
	public String preOrderTraversal() {
		StringBuffer str=new StringBuffer();
		str.append(this.getData());
		if(getLeft()!=null) {
		str.append(","+getLeft().preOrderTraversal());
		}
		if(getRight()!=null) {
		str.append(","+getRight().preOrderTraversal());
		}
		return str+"";
	}
	public String inOrderTraversal() {
		StringBuffer str=new StringBuffer("");
		if(getLeft()!=null) {
			str.append(getLeft().inOrderTraversal()+",");
		}
		str.append(this.getData());
		if(getRight()!=null) {
			str.append(","+getRight().inOrderTraversal());
		}
		return str+"";
	}
	public String postOrderTraversal() {
		StringBuffer str=new StringBuffer("");
		if(getLeft()!=null) {
			str.append(getLeft().inOrderTraversal()+",");
		}
		if(getRight()!=null) {
			str.append(","+getRight().inOrderTraversal());
		}
		str.append(this.getData());
		return str+"";
	}
    private boolean isLeaf() {
    	if(getLeft()!=null && getRight()!=null) {
			return true;
		}
		return false;
	}
    public boolean isBalanced() {
    	if(this.getData()==null) {
    		return true;
    	}
    	if(this.getLeft().height()-this.getRight().height() == 0 ||
    		this.getLeft().height()-this.getRight().height() == 1 ||
    		this.getLeft().height()-this.getRight().height() == -1 ) {
    		return true;
    	}
    	return false;
    }
    public boolean isComplete() {  // TO be defined	
    	int height=height();
    	int size=size();
    	int match=(int) (2*Math.pow(2, height+1));
    	return match==size;
    }
    public int size() {
    	if(getLeft()==null && getRight()==null)
    		return 1;
    	if(getLeft()==null)
        	return 1+getRight().size();
    	if(getRight()==null)
        	return 1+getLeft().size();
    	return 1+getLeft().size()+getRight().size();
    }
    public int height() {
    	if(getData()==null) {
    		return -1;
    	}
    	int leftNode=0, rightNode=0;
    	if(getLeft()!=null) {
    		leftNode=1 + getLeft().height();
    	}
    	if(getRight()!=null) {
    		leftNode=1 + getRight().height();
    	}
    	return (leftNode>rightNode)?leftNode:rightNode;
    }
    public boolean contains(Object target) {
    	// Approach 1 (MINE ONE)
//		if(getData()==target) {
//			return true;
//		}
//		boolean present=false;
//		if(getLeft()!=null) {
//			present = getLeft().contains(target);
//			if(present==true) {
//				return present;
//			}
//		}
//		if(getRight()!=null) {
//			present = getRight().contains(target);
//			if(present==true) {
//				return present;
//			}
//		}
//		return present;
//    }
    	
		//Approach 2  (BY Teacher)
		if(getData()==target) {
			return true;
		}
		boolean present=false;
		
		if(getLeft()!=null) {
			if(getLeft().preOrderTraversal().contains(target.toString()))  return true;
				present=getLeft().contains(target);
		}
		if(getRight()!=null) {
			if(getRight().preOrderTraversal().contains(target.toString()))  return true;
				present=getRight().contains(target);
			}
		return present;
    }
    public boolean isFull() {
    	int height=height();
    	int size=size();
    	int match=(int) (2*Math.pow(2, height+1));
    	return match==size;
    }
    // Swap the left and right tree;
 	public void swap() {
 		if(getLeft()==null || getRight()==null) {
 			System.out.println("SWAP not possible.");
 			return;
 		}
 		BinaryTree temp=getLeft();
 		setLeft(getRight());
 		setRight(temp);
 	}
 	
 	// Find out the right most node of the left tree
	public BinaryTree Right_Most_Of_Left() {
 		if(getData()==null) {
 			return null;
 		}
 		if(getLeft()!=null) {
 			for(BinaryTree i=getLeft();i!=null;i=i.getRight()) {
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
 		if(getData()==null) {
 			return null;
 		}
 		if(getRight()!=null) {
 			for(BinaryTree i=getRight();i!=null;i=i.getLeft()) {
 				if(i.getLeft()==null)
 				{
 					return i;
 				}
 			}
 		}
 		return null;	
 	}
 	
 	public void printLevelOrder(BinaryTree node)
    {
      Queue<BinaryTree> queue = new LinkedList<BinaryTree>();
      queue.add(node);
      while (!queue.isEmpty())
      {   
        // poll() removes the present head.
        BinaryTree tempNode = queue.poll();
        System.out.print(tempNode.data + " ");
   
        /*Enqueue left child */
        if (tempNode.left != null) {
          queue.add(tempNode.left);
        }
   
        /*Enqueue right child */
        if (tempNode.right != null) {
          queue.add(tempNode.right);
        }
      }
    }
 	
 	public int degree() {
 		int deg=0;
		if(getLeft()!=null) {
			deg+=1;
			deg+=getLeft().degree();
		}
		if(getRight()!=null) {
			deg+=1;
			deg+=getRight().degree();
		}
		return deg;
 	}
 	
 	public int numberOfLeaves(BinaryTree tree) {
 		if (tree == null) 
 			return 0; 
 		if (tree.isLeaf()) 
 		{
 			return 1; 
 		} 
 		else 
 		{ 
 			return numberOfLeaves(tree.getLeft()) + 
 					numberOfLeaves(tree.getRight()); 
 		}
 	}
 	
 	public boolean insert(BinaryTree tree,int obj) {
 		if(tree==null) {
 			tree.setData(obj);
 		}
 		if(obj>(int)tree.getData()) {
 			insert(tree.getLeft(),obj);
 		}
 		if(obj<(int)tree.getData()) {
 			insert(tree.getRight(),obj);
 		}
 		return false;
 	}
 	
 	public boolean delete(BinaryTree tree, int obj) {
 		return false;
 	}
 	
 	
	public static void main(String[] args) {
		BinaryTree treeB =new BinaryTree(20,new BinaryTree(12),new BinaryTree(21));
		BinaryTree treeD =new BinaryTree(40);
		BinaryTree treeE =new BinaryTree(50);
		BinaryTree treeC =new BinaryTree(35,treeD,treeE);
		BinaryTree tree =new BinaryTree(30,treeB,treeC);
		System.out.println(tree.inOrderTraversal());
		System.out.println(treeC.isLeaf());
		System.out.println(treeC.size());
//		System.out.println(treeC.contains("C"));
//		tree.swap();
//		System.out.println(tree.contains("A"));
//		System.out.println(tree.contains("J"));
		System.out.println(tree.Right_Most_Of_Left());
		System.out.println(tree.Left_Most_Of_Right());
		System.out.println(tree.isFull());
//		System.out.println(tree.insert(tree,67));
		tree.printLevelOrder(tree);
		System.out.println(tree.isBalanced());
		System.out.println(tree.degree());
		System.out.println(tree.numberOfLeaves(tree));
	}
}	