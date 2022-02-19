public class ArrayQueue implements Queue{
	Object[] data;
	int size;
	public ArrayQueue(Object[] data,int size) {
		super();
		this.size=size;
		this.data = data;
	}

	public ArrayQueue() {
		super();
		// TODO Auto-generated constructor stub
		this.size=5;
		this.data=new Object[10];
	}

	public ArrayQueue(Object[] obj) {
		// TODO Auto-generated constructor stub
		this.data=obj;
		this.size=0;
	}
	
	public void resize() {
		Object[] copy=new Object[data.length];
		for(int i=0;i<copy.length;i++) {
			copy[i]=data[i];
		}
		data=new Object[copy.length*2];
		for(int i=0;i<copy.length;i++) {
			data[i]=copy[i];
		}
	}

	public void display() {
		for(int i=0;i<this.data.length;i++) {
			if(data[i]!=null)
			System.out.println(data[i]);
		}
	}
	
	@Override
	public void add(Object obj) {
		if(size<=data.length) {
			resize();
		}
		boolean added=false;
		if(size==0 || data[0]==null) {
			data[0]=obj;
			size++;
			added=true;
		}
		if(added==false) {
			for(int i=0;i<size;i++) {
				if(data[i+1]==null) {
					data[i+1]=obj;
					this.size++;
					break;
				}
			}
		}
	}

	@Override
	public Object first() {
		// TODO Auto-generated method stub
		return data[0];
	}

	@Override
	public Object remove() {
		// TODO Auto-generated method stub
		if(size==0) {
			throw new IllegalArgumentException();
		}
		Object res=data[0];
		for(int i=0;i<size ;i++) {
			data[i]=data[i+1];
		}
		size--;
		return res;
	}

	public String toString() {
		String str="";
		for(int i=0;i<size;i++) {
			str+=data[i]+".\t";
		}
		return str;
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	public boolean equals(Object o) {
		boolean res=false;
		for(int i=0;i<this.data.length;i++) {
			if(data[i]==o && data[i]!=null) {
				res= true;
			}
		}
		return res;
	}
	
	public ArrayQueue clone() {
		ArrayQueue cloned=new ArrayQueue();
		if(this.size==0) {
			throw new IllegalArgumentException();
		}
		else {
			cloned.size=1;
			for(int i=0;i<this.size;i++) {
				cloned.data[i]=data[i];
				if(data[i+1]!=null)
				cloned.size++;
			}
		}
		return cloned;
	}
	
	public void removeBottomElement() {
		for(int i=0;i<this.data.length;i++) {
			if(data[i+1]==null) {
				this.data[i]=null;
				this.size--;
				break;
			}
		}
	}
	
	public void reverse() {
		ArrayQueue aq=new ArrayQueue();
		aq.size=this.size;
		for(int i=0;i<this.size;i++) {
			aq.data[i]=this.data[i];
		}
		int index=0;
		for(int i=this.size-1;i>=0;i--) {
			this.data[index]=aq.data[i];
			index++;
		}
	}
	
	public ArrayStack toStack() {
		ArrayStack as=new ArrayStack();
		as.a=this.data;
		as.size=this.size;
		return as;
	}
	
	public LinkedListQueue toLinkedQueue() {
		LinkedListQueue llq=new LinkedListQueue();
		for(int i=0;i<this.data.length;i++) {
			if(data[i]!=null)
			llq.add(data[i]);
		}
		return llq;
	}
	
	public void deQueue(Object obj,String end) {
		if(end.equalsIgnoreCase("rear")) {
		if(size<=data.length) {
			resize();
		}
		boolean added=false;
		if(size==0 || data[0]==null) {
			data[0]=obj;
			size++;
			added=true;
		}
		if(added==false) {
			for(int i=0;i<size;i++) {
				if(data[i+1]==null) {
					data[i+1]=obj;
					this.size++;
					break;
				}
			}
		}
		}
		else if(end.equalsIgnoreCase("front")) {
			if(size<=data.length) {
				resize();
			}
			boolean added=false;
			if(size==0 || data[0]==null) {
				data[0]=obj;
				size++;
				added=true;
			}
			if(added==false) {
				ArrayQueue a=new ArrayQueue();
				a.add(obj);
				for(int i=0;i<size;i++) {
						a.add(data[i]);	
				}
				this.data=a.data;
				this.size++;
			}
		}
		else {
			System.out.println("In De-Queue, You can insert elements only on rear and front end.");
		}
	}
	
	public static void main(String[] args) {
		ArrayQueue aq=new ArrayQueue(new Object[1]);
		aq.add(15);
		aq.add(30);
		aq.add(45);
		aq.add(60);
		aq.add(75);
		aq.add(90);
		aq.remove();
		System.out.println("After remove() first element becomes:  "+aq.first());
		System.out.println("Size of Queue is:  "+aq.size());
		aq.add(84);
		System.out.println("Queue after adding element 84 is:  "+aq);
		System.out.println("Is Queue have Elemene 90??  "+aq.equals(90));
		aq.removeBottomElement();
		System.out.println("After Removing Bottom Element is:  "+aq);
		aq.reverse();
		System.out.println("After Reversing Queue is:  "+aq);
		System.out.println("Printing Array Queue:  ");
		aq.display();
		LinkedListQueue lq=aq.toLinkedQueue();
		System.out.println("To Linked Queue is:  "+lq.toString());
		aq.deQueue(10, "front");
		System.out.println("After deQueuing Element 10 on front is :  "+aq);
		ArrayStack as=aq.toStack();
		System.out.println("To Array Stack is :  "+as);
		System.out.println("Peek Element of Stack is :  "+as.peek());
		ArrayQueue a=aq.clone();
		System.out.println("Cloned Queue is :  "+a.toString());
	}	
}
