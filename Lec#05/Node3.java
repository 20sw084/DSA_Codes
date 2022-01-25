/* 
 * Write down a program of Linked List. 
 * (In our case, we are going to double it.)
 */
package dsaCodes;

import java.util.Scanner;

public class Node3 {
	int data;
	Node3 next;
	public Node3(int data) {
		this.data=data;
	}
	
	// Main Function
	public static void main(String args[]) {
		Node3 start=new Node3(30);
		Node3 n=start;
		int size=4;
		for(int i=0;i<size;i++) {
			System.out.println("Enter Number "+(i+1)+" / "+size);
			n=n.next=new Node3((new Scanner(System.in)).nextInt());
		}
		
		//Access data now
		for(Node3 i=start;i!=null;i=i.next) {
			System.out.println(i.data);
		}
	}
}
