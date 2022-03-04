public class Node {
	int data;
	Node next;
	public Node() {
		
	}
	public Node(int data) {
		this.data=data;
	}
	public Node(int data, Node next) { 
	this.data=data;
	this.next=next;
	}
	public static int getHighest(Node n) {
				int large=n.data;
				for(Node i=n;i!=null;i=i.next) {
					if(i.data>large) {
						large=i.data;
					}
				}
				return large;
	}

	public void getMultiplication() {
		int first = this.data,last=0;
		for(Node i=this.next;i!=null;i=i.next) {
			if(i.next==null) {
				last=i.data;
			}
		}
		System.out.println("Multiplication of First "
				+ "and Last Node is : "+first*last);
	}
	
	public static int getLowest(Node n) {
		int small=n.data;
		for(Node i=n;i!=null;i=i.next) {
			if(i.data<small) {
				small=i.data;
			}
		}
		return small;
	}
	

	
	public static Node merge(Node n1,Node n2) {
		Node i=n1;
		for(i=n1;i.next!=null;i=i.next) {
			
		}
		for(Node j=n2;j.next!=null;j=j.next) {
			i.next=new Node(j.data);
			i=i.next;
		}
		return n1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node start=new Node(16);
		start.next=new Node(19);
		start.next.next=new Node(21);
		start.next.next.next=new Node(15);
		start.next.next.next.next=new Node(35);
		
		Node start1=new Node(15);
		start1.next=new Node(19);
		start1.next.next=new Node(35);
		start1.next.next.next=new Node(79);
		
		Node start2=new Node(8);
		start2.next=new Node(10);
		start2.next.next=new Node(12);
		start2.next.next.next=new Node(14);

		System.out.println("Lowest IS: "+getLowest(start));
		
		System.out.println("HIGHEST IS: "+getHighest(start));
		
		Node merged=merge(start1,start2);
		
		for(Node i=merged;i!=null;i=i.next) {
			System.out.println(i.data);
		}
		
		start.getMultiplication();
		for(Node i=start;i!=null;i=i.next) {
			System.out.println(i.data);
		}
	}
}
