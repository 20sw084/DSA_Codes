// Write a function to return the sum of all the elements of a linked list. 

public class Node3 {
	int data;
	Node3 next;

	public Node3(int data) {
		this.data=data;
	}
	public Node3(int data,Node3 next) {
		this(data);
		this.next=next;
	}
	
	public static void insert(Node3 node,int data) { 
		// Inserts data in sorted form
		Node3 n=node;  // Keep copy of node 
		while(n.next!=null) {	// Traverse the whole node
			if(n.next.data>data) {		// Compares from second data, 
										// if greater than inserted data.
				break;					// break the loop
			}
			n=n.next;		// Try changing reference of node.
		}
		n.next=new Node3(data,n.next);	// Inserts the data at that position.
										// If data is greater than the whole node,
										// inserts at last position.
	}

	public static boolean search(Node3 node,int target) {
		Node3 n=node;	// Retains the copy of start so, that start reused for traverse.
		while(n!=null) {		// Traverse the copy of node 
			if(n.data==target) {	// If target found
				return true;	// Jump out of the function
			}
			n=n.next;			// Change reference
		}
		return false;			// If not found, return false
	}
	
	public static int addAll(Node3 node) {
		int sum=0;		// Make a local variable to store sum
		while(node!=null) {
			sum+=node.data;	// Sum the data 
			node=node.next;	// Change the reference
		}
		return sum;			// Return that sum to function.
	}
	
	public static void main(String[] args) {
		Node3 start=new Node3(15);
		Node3 n=start;
		n.next=new Node3(20);
		n=n.next;
		n.next=new Node3(30);
		n=n.next;
		n.next=new Node3(35);
		n=n.next;
		insert(start,25);
		System.out.println(search(start,25));
		System.out.println(addAll(start));
		for(Node3 i=start;i!=null;i=i.next) {
			System.out.println(i.data);
		}
	}
}
