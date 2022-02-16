 
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
		LinkedListQueue lq=new LinkedListQueue();
		lq.add("One");
		lq.add("Two");
		lq.add("Three");
		lq.add("Four");
		lq.add("Five");
		System.out.println(llq.search("Five"));
//		System.out.println(llq.first());
//		System.out.println(llq.remove());
//		System.out.println(llq.size());
		llq.reverse();
//		llq.insert("Midd");
//		llq.merge(lq);
		System.out.println(llq.toString());
//		LinkedListQueue merged=llq.merge(llq,lq);
//		System.out.println(merged.size());
//		for(Node i=l.head.next;i!=l.head;i=i.next) {
//			System.out.println(i.data);
//		}
//		System.out.println(merged.toString());
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
	public void insert(Object o) {
		int count=1;
		int midPosition=this.size/2;
		System.out.println(midPosition);
		for(Node i=head.next;i!=head.prev.next;i=i.next) {	
			System.out.println(midPosition);
			if(count==midPosition) {
				System.out.println(midPosition+1);
				i.next=new Node(o);
				this.size++;
			}
			count++;
		}
	}

	@Override
	public Object first() {
		// TODO Auto-generated method stub
		if(head.next==null) 
			throw new IllegalArgumentException("Stack is Empty.");
		return head.next.data;
	}
	
//	public LinkedListQueue reverse() {
//		LinkedListQueue llq=new LinkedListQueue();
//		for(Node i=this.head.prev;i!=this.head;i=i.prev) {
////			llq.head.next=llq.head.next.next = 
////					new Node(i.data,llq.head.next,llq.head.prev);
//			llq.add(i.data);
//		}
//		return llq;
//	}
	
	public void reverse() {
		LinkedListQueue llq=new LinkedListQueue();
		for(Node i=this.head.prev;i!=this.head;i=i.prev) {
//			llq.head.next=llq.head.next.next = 
//					new Node(i.data,llq.head.next,llq.head.prev);
			llq.add(i.data);
		}
		this.head=llq.head;
	}
	
	// To be Defined
	public void merge(LinkedListQueue llq2) {
		this.head.prev.next=llq2.head.next;
		llq2.head.next.prev=this.head.prev;
		llq2.head.prev.next=this.head;
		this.head.prev=llq2.head.prev;
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

	public boolean search(Object o) {
		boolean res=false;
		for(Node i=this.head.next;i!=head.prev.next;i=i.next) {
			if(i.data==o) {
				res=true;
			}
		}
		return res;
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

}


//https://www.youtube.com/watch?v=
