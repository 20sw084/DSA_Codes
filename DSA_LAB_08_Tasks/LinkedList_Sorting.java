
public class LinkedList_Sorting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node start=new Node(330);
		start.next=new Node(320);
		start.next.next=new Node(4430);
		start.next.next.next=new Node(920);
		start.next.next.next.next=new Node(430);
		start.next.next.next.next.next=new Node(320);
		start.next.next.next.next.next.next=new Node(540);
		start.next.next.next.next.next.next.next=new Node(930);
		start.bubbleSort(start);
	}

}
