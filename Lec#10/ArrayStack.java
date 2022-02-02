public class ArrayStack implements Stack {
	private int size;
	private Object[] a;

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
		
		return a[--size];
	}


	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return a[--size];
	}

	public void resize() {
		int len=a.length;
		Object[] copy=new Object[len+1];
		for(int i=0;i<a.length;i++) {
			copy[i]=a[i];
		}
		a=copy;
	}
		
	public void printStack() {
		for(int i=0;i<a.length;i++) 
			System.out.println(a[i]);
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
//		System.out.println("Size of Array is: "+as.size());
//		System.out.println(as.peek());
		
	}
}
