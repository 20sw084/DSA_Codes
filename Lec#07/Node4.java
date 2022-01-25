// Write a Function to get the size of linkedlist.

package dsaCodes;

public class Node4 {
	
	int data;
	Node4 next;	
	Node4(int data){
		this.data=data;
	}	
	public Node4() {
		// TODO Auto-generated constructor stub
	}
	Node4(int data, Node4 next)
	{
		this.data=data;
		this.next=next;
	}
	

	public int getSize(Node4 n1) {
		int times=0;
		for(Node4 i=n1;i!=null;i=i.next) {
			times++;
		}
		return times;
	}
	
	public static void main(String[] args) {
		Node4 start=new Node4(12);
		Node4 n=start;
		
		n.next=new Node4(4);
		n=n.next;
		 n.next=new Node4(14);
		n=n.next;
		 n.next=new Node4(15);
		n=n.next;
		 n.next=new Node4(16);
		n=n.next;
		 n.next=new Node4(17);
		n=n.next;
		
		int size=start.getSize(start);
		System.out.println("Size of List is : "+size);
	}
	
}
