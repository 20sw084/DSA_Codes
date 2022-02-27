public class Node1 {
	int data;
	Node1 next;

	public Node1(int data) {
		this.data=data;
	}
	public Node1(int data,Node1 next) {
		this(data);
		this.next=next;
	}
	
	public static void insert(Node1 node,int data) { 
		// Inserts data in sorted form
		Node1 n=node;  // Keep copy of node 
		while(n.next!=null) {	// Traverse the whole node
			if(n.next.data>data) {		// Compares from second data, 
										// if greater than inserted data.
				break;					// break the loop
			}
			n=n.next;		// Try changing reference of node.
		}
		n.next=new Node1(data,n.next);	// Inserts the data at that position.
										// If data is greater than the whole node,
										// inserts at last position.
	}
	
	public static void main(String[] args) {
		Node1 start=new Node1(15);
		Node1 n=start;
		n.next=new Node1(20);
		n=n.next;
		n.next=new Node1(30);
		n=n.next;
		n.next=new Node1(35);
		n=n.next;
		insert(start,25);
		
		for(Node1 i=start;i!=null;i=i.next) {
			System.out.println(i.data);
		}
	}
}
