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
		this.size=data.length+1;
	}
	
	public void resize() {
		Object[] copy=new Object[data.length];
		for(int i=0;i<copy.length;i++) {
			copy[i]=data[i];
		}
		Object[] data=new Object[copy.length*2];
		for(int i=0;i<copy.length;i++) {
			data[i]=copy[i];
		}
	}

	@Override
	public void add(Object obj) {
		if(size==data.length) {
			resize();
		}
		if(size==0) {
			data[0]=obj;
		}
			for(int i=0;i<size;i++) {
				System.out.println(i);
				if(data[i+1]==null) {
					data[i+1]=obj;
					this.size++;
					break;
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
		Object res=data[0];
		for(int i=0;i<data.length;i++) {
			data[i]=data[i+1];
		}
		return res;
	}

	public String toString() {
		String str="";
		for(int i=0;i<this.size;i++) {
			str+=data[i]+".\t";
		}
		return str;
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	public static void main(String[] args) {
		Object obj[]=new Object[10];
//		obj[0]=15;
//		obj[1]=30;
//		obj[2]=45;
//		obj[3]=60;
//		obj[4]=75;
		ArrayQueue aq=new ArrayQueue(obj,5);
		aq.add(15);
		aq.add(30);
		aq.add(45);
		aq.add(60);
		aq.add(75);
		
//		aq.size=5;
//		aq.add(84);
		System.out.println(aq);
	}
	
}
