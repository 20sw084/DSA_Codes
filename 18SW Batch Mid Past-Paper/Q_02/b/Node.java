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
		Node N1=new Node("Biscuits");	
		Node start=N1;
		start.next=new Node("Patties");
		start=start.next;
		start.next=new Node("Samosa");
		start=start.next;
		start.next=new Node("Sandwich");
		start=start.next;
		start.next=new Node("Cakes");
		start=start.next;
		start.next=new Node("Bread");
		
		Node N2=new Node("Pepsi");	
		Node start2=N2;
		start2.next=new Node("Juice");
		start2=start2.next;
		start2.next=new Node("Water");
		start2=start2.next;
		start2.next=new Node("Coffee");
		start2=start2.next;
		start2.next=new Node("Milk");
		start2=start2.next;
		start2.next=new Node("Ice Cream");
		start2=start2.next;
		start2.next=new Node("Yougurt");
		
		System.out.println(N1);
		System.out.println(N1.search("Cakes"));
		
	}
}