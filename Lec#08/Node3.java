// Write a function to replace a given position element in list.
package dsaCodes;

public class Node3 {
	public int data;
	public Node3 next;	
	Node3(int data){
		this.data=data;
	}	
	public Node3() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Node3(int data, Node3 next)
	{
		this.data=data;
		this.next=next;
	}
	public static void printNode(Node3 n){
        for(Node3 i=n;i!=null;i=i.next){
            System.out.println(i.data);
        }  
    }
	public static Node3 replace(Node3 n,int pos,int num) {
		int count=1;
		Node3 i=n;
		while(i!=null) {
			if(count==(pos-1)) {
				break;
			}
			count++;
			i=i.next;
		}
		i.next=new Node3(num,i.next.next);
		return n;
	}

	public static void main(String[] args) {		
		Node3 N1=new Node3(1);	
		Node3 start=N1;
		start.next=new Node3(2);
		start=start.next;
		start.next=new Node3(4);
		start=start.next;
		start.next=new Node3(6);
		
		
		Node3 replaced=replace(N1,2,8);

		System.out.println("Replaced Element List  ::    ");
		
		printNode(replaced);
		
	}
}
