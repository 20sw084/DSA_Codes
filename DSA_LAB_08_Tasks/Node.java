public class Node {
	public int data;
	public Node next;
	public Node() {
		
	}
	public Node(int data) {
		this.data=data;
		next=this;
	}
	public Node (int data, Node next ) {
		this.data=data;
		this.next=next;
	}
	public void bubbleSort(Node head) {
//		Node current = head;
//	    while (current != null) {
//	        Node second = current.next;
//	        while (second != null) {
//	            if (current.data > second.data) {
//	                int tmp = current.data;
//	                current.data = second.data;
//	                second.data = tmp;
//	            }
//	            second = second.next;
//	        }
//	        current = current.next;
//	    }
		
		
//		int size=7;
//		if (size > 1) {
//	        for (int i = 0; i < size; i++ ) {
//	            Node currentNode = head;
//	            Node next = head.next;
//	            for (int j = 0; j < size - 1; j++) {
//	                if (currentNode.data > next.data) {
//	                    int temp = currentNode.data;
//	                    currentNode.data = next.data;
//	                    next.data = temp;
//	                } 
//	                currentNode = next;
//	                next = next.next;                   
//	            } 
//	        }
//	    }
		
//		int size=5;
//		if (size > 1) {
//            boolean wasChanged;
//
//            do {
//                Node current = head;
//                Node previous = null;
//                Node Next = head.next;
//                wasChanged = false;
//
//                while ( next != null ) {
//                    if (current.data > Next.data) {
//                        /*
//                        // This is just a literal translation
//                        // of bubble sort in an array
//                        Node temp = currentNode;
//                        currentNode = next;
//                        next = temp;*/
//                        wasChanged = true;
//
//                        if ( previous != null ) {
//                            Node sig = Next.next;
//
//                            previous.next = Next;
//                            Next.next = current;
//                            current.next = sig;
//                        } else {
//                            Node sig = Next.next;
//
//                            head = Next;
//                            Next.next = current;
//                            current.next = sig;
//                        }
//
//                        previous = Next;
//                        Next = current.next;
//                    } else { 
//                        previous = current;
//                        current = Next;
//                        Next = Next.next;
//                    }
//                } 
//            } while( wasChanged );
//        }
		
//		 if (head != null) {
//		      Node current = null;
//		      int status = 0;
//		      do {
//		        current = head;
//		        status = 0;
//		        while (current != null && current.next != null) {
//		          if (current.data > current.next.data) {
//		            //Swap node values
//		            status = 1;
//		            current.data = current.data + current.next.data;
//		            current.next.data = current.data - current.next.data;
//		            current.data = current.data - current.next.data;
//		          }
//		          current = current.next;
//		        }
//		      } while (status == 1);
//		    } else {
//		      System.out.println("Empty Linked list");
//		    }
		
		if (head != null) {

		      Node current = null,
		        new_head = null,
		        move_node = null,
		        prev = null;

		      while (head != null) {
		        prev = null;
		        current = head;
		        move_node = head;
		        while (current != null) {

		          //When current node value is grator than previous node
		          if (current.next != null && current.next.data > move_node.data) {
		            //Swap node values
		            move_node = current.next;
		            prev = current;

		          }
		          current = current.next;
		        }
		        if (move_node == head) {
		          head = (head).next;
		        }

		        if (prev != null) {
		          prev.next = move_node.next;
		        }
		        move_node.next = new_head;
		        new_head = move_node;
		      }
		      //make new head
		      head = new_head;

		    } else {
		      System.out.println("Empty Linked list");
		    }
		
		
//		Node copy=start;
//		int iCount=0,jCount=0;
//		for(Node i=copy;i!=null;copy=copy.next) {
//			for(Node j=copy;jCount<iCount;j=j.next) {
//				if(i.data>j.data) {
//				int temp=i.data;
//					i.data=j.data;
//					j.data=temp;
//				}
//				jCount++;
//			}
//			iCount++;
//		}
	}
	public void print(Node n) {
		for(Node i=n;i!=null;i=i.next) {			
			System.out.println(i.data);
		}
	}
	
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
		start.print(start);
	}
}