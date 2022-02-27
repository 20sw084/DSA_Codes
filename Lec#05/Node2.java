/* 
 * Write down a program of Linked List.
 */

public class Node2 {
	int data;
	Node2 next;
	public Node2(int data) {
		this.data=data;
	}
	
	// Main Function
	public static void main(String args[]) {
		Node2 start=new Node2(30);
		Node2 n=start;		/* Retaining data to access easily
					 while working storing on copy &
					 retrieving from original. */
		n.next=new Node2(60);
		n=n.next;
		n.next=new Node2(90);
		
		//Access data now
		for(Node2 i=start;i!=null;i=i.next) {
			System.out.println(i.data);
		}
	}
}
