
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
//		LinkedListQueue lq=new LinkedListQueue();
//		lq.add("One");
//		lq.add("Two");
//		lq.add("Three");
//		lq.add("Four");
//		lq.add("Five");
		System.out.println(llq.search("Five"));
		System.out.println(llq.first());
		System.out.println(llq.remove());
		System.out.println(llq.size());
		llq.reverse();
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
		
	}

	public LinkedListQueue merge(LinkedListQueue lls1,LinkedListQueue lls2) {
		LinkedListQueue lls=new LinkedListQueue();
		lls.head=lls1.head;
//		lls.head.next=lls1.head.next;
		lls.head.prev=lls1.head.prev;
		lls.size=lls1.size;
		for (Node i=lls1.head.next;i!=lls1.head;i=i.next) {
			if(i.next==lls1.head) {
				System.out.println("JONNY");
				lls.head.prev=lls2.head.next;
//				lls.head.prev=lls2.head.prev;
				lls.size+=lls2.size;
			}
		}
		for (Node i=lls.head.next;i!=null;i=i.next) {
			if(i.next==null) {
				lls.head.prev=i;
			}			
		}
		return lls;
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


