// Write a function to merge one node onto another.

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
	public static Node2 merge(Node2 n1,Node2 n2) {
		Node2 i;
		for(i=n1;i.next!=null;i=i.next) 
		{
		}		
		i.next=n2;		
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
		
	
		Node2 merged=merge(node1,node2);
		for(Node2 i=merged;i!=null;i=i.next) {		
			System.out.println("Merged List  ::    "+i.data);
		}		
	}
}