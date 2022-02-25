import java.util.*;

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
			Node i=this.top;
			for( i=this.top;i!=null;i=i.next) {
				str+=i.data+".  ";
			}
			return str;
		}
		
		public boolean equals(Object obj) {
			boolean found=false;
			for(LinkedListStack2 i=this;i.top!=null;i.top=i.top.next) {
				System.out.print(899);
				if(i.top.data==obj) {
					found=true;
					break;
				}
			}
			return found;
		}
		
		public void removeSecondLastElement() {
			if(this.top == null)  throw new NoSuchElementException();
//			Node i=null;
//			Node iCopy=i;
//			size--;
//			for (i=this.top;i.next!=null;i=i.next) {
//				if(i.next.next==null) {
//					i=i.next;
//					break;
////					System.out.println(d);
//				}
//			}
//			this.top=iCopy;
////			this.top=reverse(this);
			size=0;
			LinkedListStack2 temp=new LinkedListStack2();
			for(Node i=this.top;i.next!=null;i=i.next) {
				if(i.next.next!=null) {
					temp.push(i.data);
					size++;
				}
				else if(i.next.next==null) {
					temp.push(i.next.data);
					size++;
					break;
				}
			}
			this.top=reverse(temp);
		}
		
		public Object secondLastElement() {
			if(this.top == null)  throw new NoSuchElementException();
			for (Node i=this.top;i.next!=null;i=i.next) {
				if(i.next.next==null) {
					return i.data;
//					System.out.println(d);
				}
			}
//			this.top=reverse(this);
			return this;
		}
		
		public Object bottomElement() {
			if(this.top == null)  throw new NoSuchElementException();
			for (Node i=this.top;i!=null;i=i.next) {
				if(i.next==null) {
					return i.data;
//					System.out.println(d);
				}
			}
			this.top=reverse(this);
			return this;
		}
		

		public void removeBottomElement() {
			if(size==0) {
				throw new IllegalArgumentException("Stack is Empty");
			}
			size=0;
			LinkedListStack2 temp=new LinkedListStack2();
			for(Node i=this.top;i!=null;i=i.next) {
				if(i.next!=null) {
					temp.push(i.data);
					size++;
				}
				else {
					
				}
			}
			this.top=reverse(temp);
		}
		
		public Node reverse(LinkedListStack2 lls) {
			LinkedListStack2 llsCopy=new LinkedListStack2();
			for(Node i=lls.top;i!=null;i=i.next) {
				llsCopy.push(i.data);
			}
			return llsCopy.top;
		}
		
		public Object secondElement() {
			return this.top.next.data;
		}
		
		public void removeSecondElement() {
			if(size==0) {
				throw new IllegalArgumentException("Stack is Empty");
			}
			this.top.next=this.top;
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
			// For Direct toArray in reverse form
//			for(int k=0;k<ob.length;k++)
//			{
//			as.a[k]=ob[k];
//			}
			//First reverse it to make direct toArray
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
//			System.out.println(lls.toString());
			
			lls.top=lls.reverse(lls);
//			System.out.println(lls.peek());
//			System.out.println(lls.bottomElement());
//			System.out.println(lls.secondLastElement());
//			lls.removeBottomElement();
//			lls.removeSecondLastElement();
//			ArrayStack toArr=lls.toArrayStack();
//			int j=0;
//			for(ArrayStack i=toArr;i.size!=0;i.size--) {				
//				System.out.println(i.a[j]);j++;
//			}
//			System.out.println(lls.equals("Apple"));
////			lls.print();
//			lls.removeBottomElement();
			lls.print();
//			System.out.println(lls.secondElement());
//			lls.removeSecondElement();
//			lls.print();
		}
}