
public class List {
		int data;
		List next;
		public List() {
		}
		public List(int data) {
			this.data=data;
		}
		public List(int data, List next) { 
		this.data=data;
		this.next=next;
		}
		public static List insertSorted(List node,int elem) {
			if(node==null||node.data>elem) {
				node=new List(elem,node);
				return node;
			}
			List t=node;
			for(t=node;t.next!=null;t=t.next) {
				if(t.next.data>elem) {
					break;
				}
			}
			t.next=new List(elem,t.next);
			t=t.next;
			return node;
		}
		
		public static void main(String[] args) {
			List start=new List();
			start.data=78;
			start.next=new List(84);
			start.next.next=new List(101);
			start.next.next.next=new List(106);
			List.insertSorted(start, 92);
			for(List i=start;i!=null;i=i.next) {
				System.out.println(i.data);
			}
		}
}
