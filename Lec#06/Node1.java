package example;
public class Node1 {
	int data;
	Node next;

	public Node1(int data) {
		this.data=data;
	}
	public Node1(int data,Node next) {
		this(data);
		this.next=next;
	}
	
	public static void insert(Node1 node,int data) {
		Node1 n=node;
		while(n.next!=null) {
			if(n.next.data>data) {
				break;
			}
			n=n.next;
		}
		n.next=new Node1(data,n.next);
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
