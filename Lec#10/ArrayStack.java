
public class ArrayStack implements Stack {
	private int size;
	private Object[] a;

	public ArrayStack(int size) {
		a=new Object[size];
	}

	@Override
	public void push(Object obj) {
		// TODO Auto-generated method stub
		a[size++]=obj;
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		if(size==0) {
			throw new IllegalArgumentException("Stack is Empty.");
		}
		Object obj=a[--size];
		a[size]=null;
		return obj;
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		if(size==0)
			throw new IllegalArgumentException("Stack is Empty");
		return a[size-1];
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
//	public ArrayStack resize(ArrayStack as) {
//		int size=as.size;
//		Object[] copy=new Object[as.size];
//		for(int i=0;i<size;i++) {
//			copy[i]=a[i];
//		}
//		a=new Object[2*(size)];
//		for(int i=0;i<size;i++) {
//			a[i]=copy[i];
//		}
//		return as;
//	}
	
	public void resize(ArrayStack as) {
		int size=a.length;
		Object[] copy=new Object[size];
		for(int i=0;i<size;i++) {
			copy[i]=a[i];
		}
		as=new ArrayStack(2*(size));
		for(int i=0;i<size;i++) {
			a[i]=copy[i];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStack as=new ArrayStack(11);
		as.push("KIWI");
 		as.push("PineApple");		
		as.push("Banana");
 		as.pop();
// 		System.out.println(as.peek());
		as.push("Orange");
 		as.push("Apple");
		as.push("Guava");
		as.push("Strawberry");
//		System.out.println(as.size());
		as.resize(as);
		System.out.println(as.peek());
		System.out.println(as.size());		
	}
}