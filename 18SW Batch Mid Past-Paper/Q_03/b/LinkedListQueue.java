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
		llq.add("Passenger-1");
		llq.add("Passenger-2");
		llq.add("Passenger-3");
		llq.add("Passenger-4");
		
		llq.print();
		llq.reverse();
		System.out.println(llq);
	}
	
		@Override
		public void add(Object obj) {
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
		
		public void reverse() {
			LinkedListQueue llq=new LinkedListQueue();
			for(Node i=this.head.prev;i!=this.head;i=i.prev) {
	//			llq.head.next=llq.head.next.next = 
	//					new Node(i.data,llq.head.next,llq.head.prev);
				llq.add(i.data);
			}
			this.head=llq.head;
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
		
		public String toString() {
			String str=" ";
			if(head.next==null) 
			throw new IllegalArgumentException("Stack is Empty.");
			for(Node i=this.head.next;i!=head.prev.next;i=i.next) {
				str+=(i.data+".     ");
			}
			return str;
		}
		
		public void print() {
			if(head.next==null) 
			throw new IllegalArgumentException("Stack is Empty.");
			for(Node i=this.head.next;i!=head.prev.next;i=i.next) {
				System.out.print(i.data+".     ");
			}
			System.out.println();
		}
		
		@Override
		public int size() {
			// TODO Auto-generated method stub
			return size;
		}
		
		public ArrayQueue toArrayQueue() {
			ArrayQueue as=new ArrayQueue();
			for(Node i=this.head.next;i!=head.prev.next;i=i.next) {
				as.add(i.data);
			}
			return as;
		}		
	}