package example;
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
		Node2 n=node;
		while(n.next!=null) {
			if(n.next.data>data) {
				break;
			}
			n=n.next;
		}
		n.next=new Node2(data,n.next);
	}

	public static boolean search(Node2 node,int target) {
		Node2 n=node;
		while(n!=null) {
			if(n.data==target) {
				return true;
			}
			n=n.next;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Node2 start=new Node2(15);
		Node2 n=start;
		n.next=new Node2(20);
		n=n.next;
		n.next=new Node2(30);
		n=n.next;
		n.next=new Node2(35);
		n=n.next;
		insert(start,25);
		System.out.println(search(start,25))                                                                                                                                                                                                                     ;
		for(Node2 i=start;i!=null;i=i.next) {
			System.out.println(i.data);
		}
	}
}