public class Node {
	Object data;
	Node next;	
	Node(Object data){
		this.data=data;
	}	
	public Node() {
	}
	Node(Object data, Node next)
	{
		this.data=data;
		this.next=next;
	}
	public String toString(){
		String str="";
        for(Node i=this;i!=null;i=i.next){
            str+=i.data+"  ";
        }
		return str;  
    }
	public LinkedListStack toLinkedStack() {
		LinkedListStack listStack=new LinkedListStack();
		for(Node i=this;i!=null;i=i.next){
            listStack.push(i.data);
        }
		return listStack;
	}
	// TO BE DEFINED in LAB tasks
	public void bubbleSort() {
		
	}
	public boolean search(Object obj) {
		boolean res=false;
		for(Node i=this;i!=null;i=i.next){
            if(i.data==obj) {
            	res=true;
            	break;
            }
        }
		return res;
	}	
	public static void main(String[] args) {		
		Node N1=new Node("Apples");	
		Node start=N1;
		start.next=new Node("Oranges");
		start=start.next;
		start.next=new Node("Kiwi");
		start=start.next;
		start.next=new Node("Lemon");
		start=start.next;
		start.next=new Node("Mango");
		
		LinkedListStack stack=N1.toLinkedStack();
		stack.reverse();
		System.out.println(stack);
//		
//		System.out.println(N1);
		System.out.println(N1.search("Cakes"));
		
	}
}