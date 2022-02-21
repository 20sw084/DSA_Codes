
public class LinkedListStack1 implements Stack{
		Object data;
		LinkedListStack1 next;
		int size;
		public LinkedListStack1() {
		}
		public LinkedListStack1(Object data) {
			this.data=data;
		}
		public LinkedListStack1(Object data, LinkedListStack1 next) { 
		this.data=data;
		this.next=next;
		}
		public static LinkedListStack1 insert(LinkedListStack1 node,Object elem) {
			LinkedListStack1 t=node;
			t.next=new LinkedListStack1(elem,t.next);
			t=t.next;
			return node;
		}
		@Override
		public void push(Object obj) {
			// TODO Auto-generated method stub
			LinkedListStack1 lls=new LinkedListStack1(obj);
			size++;
		}
		@Override
		public Object pop() {
			// TODO Auto-generated method stub
			if(this.data==null) {
				throw new IllegalArgumentException("<STACK IS EMPTY RIGHT NOW>");
			}
			LinkedListStack1 ls=this;
			while(ls.next!=null)
			{
				ls=ls.next;
			}
			
			return ls;
		}
		@Override
		public Object peek() {
			// TODO Auto-generated method stub
			if(this.data==null) {
				throw new IllegalArgumentException("<STACK IS EMPTY RIGHT NOW>");
			}
			LinkedListStack1 i=this;
			while(i.next.next!=null) {
				i=i.next;
			}
			return i.next.data;
		}
		@Override
		public int size() {
			// TODO Auto-generated method stub
			return size;
		}
		
		public void print() {
			for(LinkedListStack1 i=this;i!=null;i=i.next) {
				System.out.print(i.data+".  ");
			}
			System.out.println();
		}
		public String toString() {
			String str="";
			for(LinkedListStack1 i=this;i!=null;i=i.next) {
				str+=i.data+".  ";
			}
			return str;
		}
		public Object lastElement() {
		if(this.data==null) {
			throw new IllegalArgumentException("<STACK IS EMPTY RIGHT NOW>");
		}
		LinkedListStack1 i=this;
		return i.data;
		}
		public Object thirdElement() {
			if(this.data==null) {
				throw new IllegalArgumentException("<STACK IS EMPTY RIGHT NOW>");
			}
			LinkedListStack1 i=this;
			return i.next.next.data;
		}
		public void evenElements() {
			if(this.data==null) {
				throw new IllegalArgumentException("<STACK IS EMPTY RIGHT NOW>");
			}
			LinkedListStack1 i=this;
			for(i=this;i!=null;i=i.next) {
				if((Integer) i.data%2==0) {
				System.out.print(i.data+".  ");
				}
			}
		}
		public void oddElements() {
			if(this.data==null) {
				throw new IllegalArgumentException("<STACK IS EMPTY RIGHT NOW>");
			}
			LinkedListStack1 i=this;
			for(i=this;i!=null;i=i.next) {
				if((Integer) i.data%2==1) {
				System.out.print(i.data+".  ");
				}
			}
		}
		public static void main(String[] args) {
			LinkedListStack1 lls=new LinkedListStack1("KIWI");
			LinkedListStack1 llsCopy=lls;
							lls.next=new LinkedListStack1("PineApple");
							lls=lls.next;
							lls.next=new LinkedListStack1("Banana");
							lls=lls.next;
							lls.next=new LinkedListStack1("Orange");
							lls=lls.next;
							lls.next=new LinkedListStack1("Apple");
							lls=lls.next;
							lls.next=new LinkedListStack1("Guava");
							lls=lls.next;
							lls.next=new LinkedListStack1("Strawberry");
			llsCopy.pop();
			System.out.println(llsCopy.peek());
			llsCopy.print();
			System.out.println(llsCopy.lastElement());
			System.out.println(llsCopy.thirdElement());
			
			LinkedListStack1 l=new LinkedListStack1(101);
			l.evenElements();
			l.oddElements();
			System.out.println(llsCopy);
		}
}