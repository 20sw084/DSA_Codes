public class Node2 {
	int data;
	Node2 next;

	public Node2(int data) {
		this.data=data;
	}
	public Node2(int data,Node2 next) {
		this(data);
		this.next=next;
	}
	
	public static void insert(Node2 node,int data) { 
		// Inserts data in sorted form
		Node2 n=node;  // Keep copy of node 
		while(n.next!=null) {	// Traverse the whole node
			if(n.next.data>data) {		// Compares from second data, 
										// if greater than inserted data.
				break;					// break the loop
			}
			n=n.next;		// Try changing reference of node.
		}
		n.next=new Node2(data,n.next);	// Inserts the data at that position.
										// If data is greater than the whole node,
										// inserts at last position.
	}

	public static boolean search(Node2 node,int target) {
		Node2 n=node;	// Retains the copy of start so, that start reused for traverse.
		while(n!=null) {		// Traverse the copy of node 
			if(n.data==target) {	// If target found
				return true;	// Jump out of the function
			}
			n=n.next;			// Change reference
		}
		return false;			// If not found, return false
	}
	
	public static void main(String[] args) {
		Node2 start=new Node2(15);
		Node2 n=start;
		n.next=new Node2(20);
		n=n.next;
		n.next=new Node2(30);
		n=n.next;
		n.next=new Node2(35);
		insert(start,25);
		System.out.println(search(start,25))                                                                                                                                                                                                                     ;
		for(Node2 i=start;i!=null;i=i.next) {
			System.out.println(i.data);
		}
	}
}
