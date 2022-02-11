
public class LinkedListQueue implements Queue{
	
	Node head=new Node();
	private int size;
	
	public static class Node {
		Object data;	
		Node next=this;
		Node prev=this;
		Node(Object data){
			this.data=data;
		}	
		public Node() {
			// TODO Auto-generated constructor stub
		}
		Node(Object data, Node next , Node prev)
		{
			this.data=data;
			this.next=next;
			this.prev=prev;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListQueue llq=new LinkedListQueue();
		llq.add("One");
		llq.add("Two");
		llq.add("Three");
		llq.add("Four");
		llq.add("Five");
		System.out.println(llq.size());
		System.out.println(llq.first());
		System.out.println(llq.remove());
		System.out.println(llq.size());
	}

	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
//		Node i=head;
		if(this.head.next==null) {
			head.next.data=obj;
			head.prev=head.next;
			++size;
		}
		else {
			head.prev=head.prev.next=new Node(obj,head,head.prev);
			++size;
		}
	}

	@Override
	public Object first() {
		// TODO Auto-generated method stub
		if(head.next==null) 
			throw new IllegalArgumentException("Stack is Empty.");
		return head.next.data;
	}

	@Override
	public Object remove() {
		// TODO Auto-generated method stub
		Node n=null;
		if(head.next==null) {
			throw new IllegalArgumentException("Stack is Empty");
		}
		else {		
			n=head.next;
			head.next=head.next.next;
			size--;
		}
		return n.data;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

}


//https://www.youtube.com/watch?v=Bf-P7TGD6QU
