	
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
//			llq.reverse();
//			llq.insert("Midd");
	//		llq.merge(lq);
//			System.out.println(llq.toString());
	//		LinkedListQueue merged=llq.merge(llq,lq);
	//		System.out.println(merged.size());
	//		for(Node i=l.head.next;i!=l.head;i=i.next) {
	//			System.out.println(i.data);
	//		}
	//		System.out.println(merged.toString());
//			System.out.println(llq.equals("Four"));
//			llq.display();
//			LinkedListQueue l=llq.clone();
//			LinkedListStack2 k=llq.toStack();
//			System.out.println(k);
//			llq.removeBottomElement();
//			llq.display();
//			ArrayStack as=llq.toArrayStack();
//			System.out.println(as);
//			llq.deQueue("Hi", "front");
			System.out.println(llq.toArrayQueue());
//			System.out.println(llq);
		}
		
		public Object removeBottomElement() {
			Object n=new Object();
			for(Node i=this.head.next;i!=head.prev.next;i=i.next) {
				if(i.next.data==null) {
				n=remove();	
				break;
				}
			}
			return n;
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
			for(Node i=this.head.next;i!=this.head.prev.next;i=i.next) {
				if(count==midPosition) {
					i.next=new Node(o,i.next,i.prev);
					this.size++;
				}
				count++;
			}
		}
		
		public LinkedListQueue clone() {
			LinkedListQueue l=new LinkedListQueue();
			for(Node i=this.head.next;i!=head.prev.next;i=i.next) {
				l.add(i.data);
			}
			return l;
		}
		
		public void display() {
			if(head.next==null) 
				throw new IllegalArgumentException("Stack is Empty.");
			for(Node i=this.head.next;i!=head.prev.next;i=i.next) {
				System.out.println(i.data);	
			}
		}
		
		public boolean equals(Object obj) {
			boolean res=false;
			if(head.next==null) 
				throw new IllegalArgumentException("Stack is Empty.");
			for(Node i=this.head.next;i!=head.prev.next;i=i.next) {
				if(i.data==obj) {
					res=true;
					break;
				}
			}
			return res;
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
		
		public ArrayStack toArrayStack() {
			ArrayStack as=new ArrayStack(10);
			for(Node i=this.head.next;i!=head.prev.next;i=i.next) {
				as.push(i.data);
			}
			return as;
		}
		
		public void deQueue(Object obj,String end) {
			if(end.equalsIgnoreCase("rear")) {
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
			else if(end.equalsIgnoreCase("front")) {
				if(this.head.next==null) {
					head.next.data=obj;
					head.prev=head.next;
					++size;
				}
				else {
					LinkedListQueue n=new LinkedListQueue();
					n.head.next=new Node(obj);
					n.head.next.next=this.head.next;
//					head.next=head.prev.next=new Node(obj,head,head.prev);
					++size;
					this.head.next=n.head.next;
				}
				}
				else {
					System.out.println("In De-Queue, You can insert elements only on rear and front end.");
				}
		}
		
		public ArrayQueue toArrayQueue() {
			ArrayQueue as=new ArrayQueue();
			for(Node i=this.head.next;i!=head.prev.next;i=i.next) {
				as.add(i.data);
			}
			return as;
		}
		
		public LinkedListStack2 toStack() {
			if(head.next==null) 
				throw new IllegalArgumentException("Stack is Empty.");
			LinkedListStack2 l=new LinkedListStack2();
			for(Node i=this.head.next;i!=head.prev.next;i=i.next) {
				l.push(i.data);
			}
			return l;
		}
	}