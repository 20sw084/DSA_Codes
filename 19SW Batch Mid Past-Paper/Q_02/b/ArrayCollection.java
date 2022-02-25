/*
 *** Purpose:
 * The Collection in Java is a framework that provides 
 * an architecture to store and manipulate the group of 
 * objects. Java Collections can achieve all the operations
 * that you perform on a data such as searching, sorting, 
 * insertion, manipulation, and deletion. Java Collection 
 * means a single unit of objects.
 *** Difference b/w Array and Linked List:
 * An array is a collection of elements of a similar data type.
 * A linked list is a collection of objects known as a node 
 * where node consists of two parts, i.e., data and address. 
 * Array elements store in a contiguous memory location. Linked 
 * list elements can be stored anywhere in the memory or randomly 
 * stored.
 *** Difference b/w Array and Collections:
 * Arrays are fixed in size i.e once the array with the specific 
 * size is declared then we can't alter its size afterward.	The 
 * collection is dynamic in size i.e based on requirement size 
 * could be get altered even after its declaration..
 * Arrays due to fast execution consumes more memory and has better 
 * performance.	Collections, on the other hand, consume less memory 
 * but also have low performance as compared to Arrays.
 * Arrays can hold the only the same type of data in its collection 
 * i.e only homogeneous data types elements are allowed in case of 
 * arrays.	Collection, on the other hand, can hold both homogeneous 
 * and heterogeneous elements.
 * Arrays can hold both object and primitive type data.	On the other 
 * hand, collection can hold only object types but not the primitive 
 * type of data.
 * Arrays due to its storage and internal implementation better in 
 * performance.	Collection on the other hand with respect to 
 * performance is not recommended to use.
 * 
 */

package collections;

public class ArrayCollection extends AbstractCollection{
	private final int initialLength=1;
	public int size;
	private Object[] data=new Object[initialLength-1];
	public int size() {
		return size;
	}
	public boolean add(Object obj) {
		if(size==data.length) {
			resize();
		}
		data[size++]=obj;
		return true;
	}
	public void resize() {
		Object[] copy=new Object[data.length+1];
		System.arraycopy(data,0,copy,0,this.size);
		this.data=copy;
	}
	public Iterator iterator() {
		
		return new Iterator() {
			private int i=0;
			private boolean okToRemove=false;
			public boolean hasNext() {
				return (i<size);
			}
			public Object next() {
				if(i==size) {
					throw new RuntimeException();
				}
				okToRemove=true;
				return data[i++];
			}
			public void remove() {
				if(!okToRemove) throw new IllegalStateException();
				data[--i]=data[--size];
				data[size]=null;
				okToRemove=false;
			}
		};
	}
	/*
	ArrayStack as1=new ArrayStack();
	as1.add("BANANA");
	as1.add("Apple");
	as1.add("Orange");
	as1.add("Guava");
	as1.add("KIWI");
	ArrayStack as2=new ArrayStack();
	as2.add("Apricot");
	as2.add("Walnut");
	as2.add("Almond");
	as2.add("Dates");
	as2.add("Cashewnuts");
	ArrayStack as3=new ArrayStack();
	as3.push("Ahsan");
	as3.push("FARHAN");
	as3.push("Ghansham");
	as3.push("Ahmed");
	as3.push("Naveed");
	ArrayColection bag=new ArrayCollection();
	bag.add(as1.pop());			
	bag.add(as1.pop());
	bag.add(as1.pop());
	bag.add(as1.pop());
	bag.add(as1.pop());
	
	bag.add(as2.pop());
	bag.add(as2.pop());
	bag.add(as2.pop());
	bag.add(as2.pop());
	bag.add(as2.pop());
	
	bag.add(as3.pop());
	bag.add(as3.pop());
	bag.add(as3.pop());
	bag.add(as3.pop());
	bag.add(as3.pop());
	
	bag.remove(as3.pop());
	bag.remove(as3.pop());
	bag.remove(as3.pop());
	bag.remove(as3.pop());
	bag.remove(as3.pop());
	*/
	
	public static void main(String[] args) {
		
		/*
ArrayQueue as1=new ArrayQueue();
as1.add("BANANA");
as1.add("Apple");
as1.add("Orange");
as1.add("Guava");
as1.add("KIWI");
ArrayQueue as2=new ArrayQueue();
as2.add("Apricot");
as2.add("Walnut");
as2.add("Almond");
as2.add("Date");
as2.add("Cashewnuts");
ArrayQueue as3=new ArrayQueue();
as3.add("Pakola");
as3.add("SLICE");
as3.add("COla");
as3.add("Sting");
as3.add("Sprite");

ArrayCollection bag=new ArrayCollection();
bag.add(as1);

bag.add(as2);

bag.add(as3);

ArrayQueue copy=as3;		// Keep the copy of Queue 3 so
 							//	that it doesnt becomes empty.
System.out.println(as3.first());

System.out.println(bag);
System.out.println(bag.remove(as3.remove()));
System.out.println(bag.remove(as3.remove()));
System.out.println(bag.remove(as3.remove()));
System.out.println(bag.remove(as3.remove()));
System.out.println(bag.remove(as3.remove()));
		
		*/
//		ArrayCollection bag=new ArrayCollection();
//		bag.add("One");
//		bag.add("Two");
//		bag.add("Three");
//		bag.add("Four");
//		bag.add("Five");
//		System.out.println(bag);
////		System.out.println(bag.size());
////		Iterator it=bag.iterator();
////		System.out.println(it.next());
////		System.out.println( bag.contains("To"));
////		it.remove();
////		it=bag.iterator();
////		it.next();
////		System.out.println(bag.remove("Three"));
//		bag.remove("Five");
////		System.out.println(bag.size());
//		System.out.println(bag);
	}
}