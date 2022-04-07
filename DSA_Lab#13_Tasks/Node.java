public class Node {
	String data;
	Node next;
	Node() {
		super();
		// TODO Auto-generated constructor stub
	}
	Node(String data) {
		super();
		this.data = data;
		this.next=new Node();
	}
	Node(String data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}	
	public void print() {
		for(Node i=this;i.data!=null;i=i.next) {
			System.out.println(i.data);
		}		
	}
}