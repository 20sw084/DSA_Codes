// Write a function to delete last element from node.

package dsaCodes;

public class Node2 {
	int data;
	Node2 next;
	
	public Node2() {
		super();
		// TODO Auto-generated constructor stub
	}

	Node2(int data){
		this.data=data;
	}
	
	Node2(int data, Node2 next)
	{
		this.data=data;
		this.next=next;
	}
	public static Node2 deleteLast(Node2 n1) {
		Node2 i=n1;
		if(n1==null)
			return n1;
		for(i=n1;i!=null;i=i.next) {
			if(n1.next==null) 
			return n1=null;
			if(i.next.next==null) {
				i.next=null;
			}
		}
		return n1;
	}
	public static void main(String[] args) {		
		Node2 node1=new Node2(0);		
		node1.next=new Node2(2);
		node1.next.next=new Node2(3);
		node1.next.next.next=new Node2(10);
		
		
		Node2 node2=new Node2(1);		
		node2.next=new Node2(2);
		node2.next.next=new Node2(3);	
		node2.next.next.next=new Node2(5);
		node2.next.next.next.next=new Node2(9);
		
	
		Node2 deleted=deleteLast(node1);
		System.out.println("Deleted List is  ::    ");
		for(Node2 i=deleted;i!=null;i=i.next) {		
			System.out.print("\t"+i.data);
		}		
	}
}
