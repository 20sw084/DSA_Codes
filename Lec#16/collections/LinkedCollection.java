package collections;

public class LinkedCollection extends AbstractCollection{
	private int size;
	private Node head=new Node();
	private static class Node{
		Object object;
		Node prev,next;
		Node(){
			prev=next=this;
		}
		public Node(Object object,Node prev,Node next){
			this.object=object;
			this.next=next;
			this.prev=prev;					
		}
	}
	public int size() {
		return size;
	}
	public boolean add(Object object) {
		head.prev=head.prev.next=new Node(object,head.prev,head);
		++size;
		return true;
	}
	public Iterator iterator() {
		return new Iterator(){
			private Node cursor=head.next;
			private boolean okToRemove=false;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return cursor!=head;
			}
			@Override
			public Object next() {
				// TODO Auto-generated method stub
				if(cursor==head)
					throw new RuntimeException();
				Object temp=cursor.object;
				okToRemove=true;
				cursor=cursor.next;
				return temp;
			}
			@Override
			public void remove() {
				// TODO Auto-generated method stub
				if(!okToRemove) {
					throw new IllegalStateException();
				}
				cursor.prev=cursor.prev.next;
				cursor.prev.next=cursor;
				--size;
				okToRemove=false;
			}
		};
	}
	public static void main(String[] args) {
		LinkedCollection bag=new LinkedCollection();
		bag.add("One");
		bag.add("Two");
		bag.add("Three");
		bag.add("Four");
		bag.add("Five");
		System.out.println(bag);
		System.out.println(bag.size());
		Iterator it=bag.iterator();
		System.out.println(it.next());
		System.out.println( bag.contains("Two"));
		it.remove();
//		it=bag.iterator();
//		it.next();
		System.out.println(bag.remove("Three"));
//		bag.remove("Five");
//		System.out.println(bag.size());
		System.out.println(bag);
	}
}