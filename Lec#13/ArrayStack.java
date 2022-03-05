public class ArrayStack implements Stack {
	int size;
	Object[] a;

	public ArrayStack() {
		size=0;
	}
	
	public ArrayStack(int size) {
		a=new Object[size+1];
	}

	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}


	@Override
	public void push(Object obj) {
		if(size==(a.length)) {
			resize();
		}
		a[size++]=obj;
	}


	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		if(size==0) {
			throw new IllegalArgumentException("Stack is Empty");
		}
		Object temp=a[size-1];
		a[--size]=null;
		return temp;
	}


	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		if(size==0) {
			throw new IllegalArgumentException("Stack is Empty");
		}
		return a[--size];
	}

	public void resize() {
		Object[] copy=new Object[a.length+1];
		System.arraycopy(this.a, 0, copy, 0, size);
		this.a=copy;
	}
	
	public List toLinkedList() {
		List list=new List(a[0]);
		List listCopy=list;
		for(int i=1;i<this.size;i++) {
			listCopy.next=new List(a[i]);
			listCopy=listCopy.next;
		}
		return list;
	}
	
	public LinkedListStack1 toLinkedStack() {
		LinkedListStack1 lts=new LinkedListStack1(this.a[0]);
		LinkedListStack1 ltsCopy=lts;
		for(int i=1;i<this.size;i++) {
			ltsCopy.next=new LinkedListStack1(a[i]);
			ltsCopy=ltsCopy.next;
		}
		return lts;
	}
	
	public String toString() {
		String str="Element 1:\t"+a[0];
		for(int i=1;i<size;i++) {
			str+="\nElement "+(i+1)+":\t"+a[i];
		}
		return str;
	}
	
	public void printStack() {
		for(int i=0;i<a.length;i++) 
			System.out.println(a[i]);
	}
	
	public boolean isEmpty() {
		return (size==0);
	}
	
	public boolean equals(Object obj) {
		for(int i=0;i<a.length;i++) {
			if(a[0]==obj) {
				return true;
			}
		}
		return false;
	}
	
	public Object bottomElement() {		
		return a[size-1];
	}
	
	public Object secondElement() {		
		return a[size-2];
	}
	
	public void removeBottomElement() 
	{
		if(size==0) 
		{
			throw new IllegalArgumentException("Stack is Empty");
		}
		int len=a.length;
		Object[] copy=new Object[len-1];
		size--;
		for(int i=0;i<(a.length-1);i++) 
		{
			copy[i]=a[i+1];
		}
		a=copy;
	}
	
	public void removeSecondElement() 
	{
		if(size==0) 
		{
			throw new IllegalArgumentException("Stack is Empty");
		}
		size--;
		for(int i=0;i<(a.length-1);i++) 
		{   
			if(i>0)
			a[i]=a[i+1];
		} 
		this.a[size] = null;
	}
	
	public static void main(String[] args) {
		ArrayStack as=new ArrayStack(5);
//		System.out.println(as.isEmpty());
		as.push("KIWI");
 		as.push("PineApple");
		as.push("Banana");
 		as.pop();
		as.push("Orange");
 		as.push("Apple");
		as.push("Guava");
		as.push("Strawberry");
		System.out.println("Size of Array is: "+as.size());
		System.out.println(as.peek());
		
		List list=as.toLinkedList();
			
		
		System.out.println(as.toLinkedStack());
		
		System.out.println(as.equals("KIW"));	
		System.out.println(as.bottomElement());	
		as.removeBottomElement();	
		System.out.println(as.secondElement());
        as.removeSecondElement();
		System.out.println(as.toString());	
		
	}
}
