
public class LinkedListStack2 implements Stack{
		public class Node{
			Node next;
			Object data;
			public Node() {
				this.data=0;
			}
			public Node(Object data) {
				this.data=data;
			}
			public Node(Object data, Node next) { 
			this.data=data;
			this.next=next;
			}
		}
		Node top;
		int size;
		LinkedListStack2()
		{
			this.top = null;
		}
		public boolean isEmpty() {
			return top==null;
		}
		@Override
		public void push(Object obj) {
			// TODO Auto-generated method stub
			top=new Node(obj,top);
			++size;
		}
		@Override
		public Object pop() {
			// TODO Auto-generated method stub
			if(size==0) {
				throw new IllegalArgumentException("<STACK IS EMPTY RIGHT NOW>");
			}
			--size;
			Object tempTop=top.data;
			top=top.next;
			return tempTop;
		}
		@Override
		public Object peek() {
			// TODO Auto-generated method stub
			if(size==0) {
				throw new IllegalArgumentException("<STACK IS EMPTY RIGHT NOW>");
			}
			return top.data;
		}
		@Override
		public int size() {
			// TODO Auto-generated method stub
			return size;
		}
		
		public void print() {
			for(LinkedListStack2 i=this;i.top!=null;i.top=i.top.next) {
				System.out.print(i.top.data+".  ");
			}
			System.out.println();
		}
		
		public String toString() {
			String str="";
			for(LinkedListStack2 i=this;i.top!=null;i.top=i.top.next) {
				str+=i.top.data+".  ";
			}
			return str;
		}
		
		public ArrayStack toArrayStack() {
			ArrayStack as=new ArrayStack();
			int sizeCopy=size;
			int sizeCopy1=size;
			int i=0;
			as.a=new Object[size];
			Object[] ob=new Object[size];
			while(sizeCopy!=0) {
				ob[i]=pop();
//				as=as.;
				i++;
				--sizeCopy;
			}
			
//			for(int k=0;k<ob.length;k++)
//			{
//			as.a[k]=ob[k];
//			}
			
			int j=0;
			for(int k=(ob.length-1);k>=0;k--)
			{
			as.a[j]=ob[k];
			j++;
			}
			
			as.size=sizeCopy1;
			return as;
		}
		
		public static void main(String[] args) {
			LinkedListStack2 lls=new LinkedListStack2();
			lls.push("KIWI");
			lls.push("PineApple");
			lls.push("Banana");
			lls.push("Orange");
			lls.push("Apple");
			lls.push("Guava");
			lls.push("Strawberry");
			lls.pop();
//			System.out.println(lls.peek());
//			System.out.println(lls.toString());
			ArrayStack toArr=lls.toArrayStack();
			int j=0;
			for(ArrayStack i=toArr;i.size!=0;i.size--) {				
				System.out.println(i.a[j]);j++;
			}
//			lls.print();
		}
}