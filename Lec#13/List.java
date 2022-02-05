
public class List {
		Object data;
		List next;
		public List() {
		}
		public List(Object data) {
			this.data=data;
		}
		public List(Object data, List next) { 
		this.data=data;
		this.next=next;
		}
		public static List insert(List node,Object elem) {
//			if(node==null||node.data>elem) {
//				node=new List(elem,node);
//				return node;
//			}
			List t=node;
//			for(t=node;t.next!=null;t=t.next) {
//				if(t.next.data>elem) {
//					break;
//				}
//			}
			t.next=new List(elem,t.next);
			t=t.next;
			return node;
		}
}