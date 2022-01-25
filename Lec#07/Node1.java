package dsaCodes;

public class Node1 {

	int data;
	Node1 next;
	
	Node1(int data){
		this.data=data;
	}
	
	Node1(int data, Node1 next)
	{
		this.data=data;
		this.next=next;
	}

	public static Node1 delete(Node1 start,int num) {
		
		if(start==null || start.data>num) {
			return start;
		}
		if(start.data==num) {
			return start.next;
		}
		for(Node1 i=start;i.next!=null;i=i.next) {
			if(i.next.data>num) {
				break;
			}
			if(i.next.data==num) {
				i.next=i.next.next;
				break;
			}
		}
		return start;
	}
	public static void main(String[] args) {		
		Node1 node=new Node1(1);		
		node.next=new Node1(2);
		node.next.next=new Node1(3);
		Node1 n=delete(node, 2);
		
		for(Node1 i=n;i!=null;i=i.next) {
			System.out.println(i.data);
		}
	}
}

