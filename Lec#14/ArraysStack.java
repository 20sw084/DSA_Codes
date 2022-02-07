
public class ArraysStack {
	int size;
	Object[] obj;
	public ArraysStack() {
		size=0;
		obj=new Object[size];
	}
	public ArraysStack(int size) {
		this.size=size;
		obj=new Object[size];
	}
	
	public int size() {
		return this.size;
	}
	
	public void resize() {
		Object[] copy=new Object[obj.length+1];
		for(int i=0;i<obj.length;i++) {
			copy[i]=obj[i];
		}
		obj=new Object[copy.length];
		for(int i=0;i<copy.length;i++) {
			obj[i]=copy[i];
		}
	}
	
	public void push(Object ob) {
		if(size==obj.length) {
			resize();
		}
		obj[size]=ob;
		size++;
	}
	
	public Object pop() {
		if(size==0) {
			throw new IllegalArgumentException("Empty Stack.");
		}
		return obj[--size];
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public Object peek() {
		if(size==0) {
			throw new IllegalArgumentException("Empty Stack.");
		}
		return obj[0];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraysStack as = new ArraysStack();
		System.out.println(as.isEmpty());
		as.push("Jonny");
		as.push("Bhutto");
		System.out.println(as.size());
		System.out.println(as.pop());
		System.out.println(as.isEmpty());
		System.out.println(as.peek());
	}

}
