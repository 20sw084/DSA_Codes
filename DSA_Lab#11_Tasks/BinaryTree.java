import java.util.ArrayDeque;
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
    	if(this.getData()==null)
    		return true;
    	if(this.getLeft()==null && this.getRight()==null) {
    		return true;
    	}
    	if(this.getLeft()!=null && this.getRight()!=null) {
    		return (getLeft().isFull() && getRight().isFull());
    	}
    	return false;
    }
    
    public boolean isComplete() {
    	// return if the tree is empty
        if (this.getData() == null) {
            return true;
        }
 
        // create an empty queue and enqueue the root node
        Queue<BinaryTree> queue = new ArrayDeque<>();
        queue.add(this);
 
        // to store the current node
        BinaryTree front;
 
        // flag to mark the end of full nodes
        boolean flag = false;
 
        // loop till queue is empty
        while (!queue.isEmpty())
        {
            // dequeue front node
            front = queue.poll();
 
            // if we have encountered a non-full node before and the current node
            // is not a leaf, a tree cannot be complete
            if (flag && (front.left != null || front.right != null)) {
                return false;
            }
 
            // if the left child is empty and the right child exists,
            // a tree cannot be complete
            if (front.left == null && front.right != null) {
                return false;
            }
 
            // if the left child exists, enqueue it
            if (front.left != null) {
                queue.add(front.left);
            }
            // if the current node is a non-full node, set the flag to true
            else {
                flag = true;
            }
 
            // if the right child exists, enqueue it
            if (front.right != null) {
                queue.add(front.right);
            }
            // if the current node is a non-full node, set the flag to true
            else {
                flag = true;
            }
        }
 
        return true;
    }
    
    public int degree() {
    	int deg=0;
    	if(this.getData()==null){
    		return 0;
    	}
    	if(this.getLeft()!=null){
    		this.getLeft().degree();
    		deg++;
    	}
    	if(this.getRight()!=null){
    		this.getRight().degree();
    		deg++;
    	}
    	return deg;
    }
    
    public int getNumOfLeafNodes(){
    	if(this.getData()==null){
    	return 0;
    	}
//    	Initialize an empty Queue
		Queue<BinaryTree> q  = new LinkedList<>();
		// Do level order traversal starting from root
        int count = 0; // Initialize count of leaves
        q.add(this);
        while (!q.isEmpty())
        {
            BinaryTree temp = q.peek();
            q.poll();
 
            if (temp.left != null)
            {
                q.add(temp.left);
            }
            if (temp.right != null)
            {
                q.add(temp.right);
            }
            if (temp.left == null &&
                temp.right == null)
            {
                count++;
            }
        }
    	return count;
    }
    int getLevelUtil(BinaryTree tree, Object data, int level)
    {
        if (tree == null)
            return 0;
 
        if (tree.getData().equals(data))
            return level;
 
        int downlevel
            = getLevelUtil(tree.getLeft(), data, level + 1);
        if (downlevel != 0)
            return downlevel;
 
        downlevel
            = getLevelUtil(tree.getRight(), data, level + 1);
        return downlevel;
    }
 
    /* Returns level of given data value */
    int getLevel(Object data)
    {
        return getLevelUtil(this, data, 1);
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
 	public Object Right_Most_Of_Left() {
 		if(getData()==null) {
 			return null;
 		}
 		if(getLeft()!=null) {
 			for(BinaryTree i=getLeft();i!=null;i=i.getRight()) {
 				if(i.getRight()==null)
 				{
 					return i.getData();
 				}
 			}
 		}
 		return null;	
 	}
 		
 	
 	// Find out the left most node of the right tree
 	
 	public Object Left_Most_Of_Right() {
 		if(getData()==null) {
 			return null;
 		}
 		if(getRight()!=null) {
 			for(BinaryTree i=getRight();i!=null;i=i.getLeft()) {
 				if(i.getLeft()==null)
 				{
 					return i.getData();
 				}
 			}
 		}
 		return null;	
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
		BinaryTree treeB =new BinaryTree("B");
		BinaryTree treeD =new BinaryTree("D");
		BinaryTree treeE =new BinaryTree("E");
		BinaryTree treeC =new BinaryTree("C",treeD,treeE);
		BinaryTree tree =new BinaryTree("A",treeB,treeC);
		System.out.println("Inorder trsversal of tree is : "+tree.inOrderTraversal());
		System.out.println("Is TreeC have Leaf?  "+treeC.isLeaf());
		System.out.println("Size of tree is : "+treeC.size());
		System.out.println("Is treeC contains C?  "+treeC.contains("C"));
		System.out.println("Left and Right Trees are swapped. ");
		tree.swap();
		System.out.println("Is treeC contains A?  "+tree.contains("A"));
		System.out.println("Is treeC contains J?  "+tree.contains("J"));
		System.out.println("Right Most node of left subtree is?  "+tree.Right_Most_Of_Left());
		System.out.println("Left Most node of right subtree is?  "+tree.Left_Most_Of_Right());
		System.out.println("Is tree a full binary tree?  "+tree.isFull());
		System.out.println("Is tree a complete binary tree?  "+tree.isComplete());
		System.out.println("Level of tree where D is?  "+tree.getLevel("D"));
		System.out.println("Number of Leaf Nodes of tree is?  "+tree.getNumOfLeafNodes());
		System.out.println("Degree of tree is : "+tree.degree());
	}
}
