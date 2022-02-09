
public class LinkedListQueue implements Queue{
	private Node head=new Node();
	private int size;
	
	public static class Node {
		Object data;
		Node prev=this,next=this;	
		
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
		head.prev=head.prev.next=new Node(object,head,head.prev);	
	}

	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object first() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
