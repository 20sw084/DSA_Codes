// Write a function to find largest element from unsorted linked list.

package dsaCodes;

public class Node1 {
	int data;
	Node1 next;
	
	Node1(int data){
		this.data=data;
	}
	
	Node1(int data, Node1 next)
	{
		this.data=data;
		this.next=next;
	}

	public static int large(Node1 n1) {
		int large=0;
		Node1 i = n1;
		large=i.data;
		for(i=n1;i.next!=null;i=i.next) {
			if(large<=i.next.data) {
				large=i.next.data;
			}
		}
		return large;
	}
	
	public static void main(String[] args) {		
		Node1 node1=new Node1(1);		
		node1.next=new Node1(22);
		node1.next.next=new Node1(3);
		
		System.out.println("Largest Element is :  "+large(node1));
	}
}
