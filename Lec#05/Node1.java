/* 
 * Write down a program of Binary Search from array. 
 * (In our case, we are going to double it.)
 */
package dsaCodes;

public class Node1 {
	int data;
	Node1 next;
	public Node1(int data) {
		this.data=data;
	}
	
	// Main Function
	public static void main(String args[]) {
		Node1 start=new Node1(30);
		start.next=new Node1(60);
		start.next.next=new Node1(90);
		
		//Access data now
		System.out.println(start.data);
		System.out.println(start.next.data);
		System.out.println(start.next.next.data);
	}
}
