// Write a function to return the sum of all the elements of a linked list. 
package example;
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
		Node3 n=node;
		while(n.next!=null) {
			if(n.next.data>data) {
				break;
			}
			n=n.next;
		}
		n.next=new Node3(data,n.next);
	}

	public static boolean search(Node3 node,int target) {
		Node3 n=node;
		while(n!=null) {
			if(n.data==target) {
				return true;
			}
			n=n.next;
		}
		return false;
	}
	
	public static int addAll(Node3 node) {
		int sum=0;
		while(node!=null) {
			sum+=node.data;
			node=node.next;
		}
		return sum;
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