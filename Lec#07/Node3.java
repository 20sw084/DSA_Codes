// Write a function to copy a list onto another node.
package dsaCodes;

public class Node3 {
	int data;
	Node3 next;	
	Node3(int data){
		this.data=data;
	}	
	public Node3() {
		super();
		// TODO Auto-generated constructor stub
	}
	Node3(int data, Node3 next)
	{
		this.data=data;
		this.next=next;
	}
	public static Node3 clone(Node3 n1) {
		Node3 copy = new Node3(n1.data);
		Node3 clone=copy;
		for(Node3 i=n1.next;i!=null;i=i.next) {
			copy.next=new Node3(i.data);
			copy=copy.next;
		}		
		return clone;
	}
	public static void main(String[] args) {		
		Node3 node1=new Node3(90);		
		node1.next=new Node3(2);
		node1.next.next=new Node3(3);
		node1.next.next.next=new Node3(10);
			
		
		Node3 copied=clone(node1);

		System.out.println("Copied List  ::    ");
		
		for(Node3 i=copied;i!=null;i=i.next) {			
			System.out.println(i.data);
		}
		
	}
}
