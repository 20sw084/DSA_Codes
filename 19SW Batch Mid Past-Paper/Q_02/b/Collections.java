package collections;
	
public interface Collections {
	public boolean add(Object o);
	public void clear();
	public boolean contains(Object o);
	public boolean isEmpty();
	public Iterator iterator();
	public boolean remove(Object o);
	public int size();
}



/*
ArrayQueue aq1=new ArrayQueue();
aq1.push("BANANA");
aq1.push("Apple");
aq1.push("Orange");
aq1.push("Guava");
aq1.push("KIWI");
ArrayQueue as2=new ArrayQueue();
as2.push("Apricot");
as2.push("Walnut");
as2.push("Almond");
as2.push("Date");
as2.push("Cashewnuts");
ArrayQueue as3=new ArrayQueue();
as3.push("Pakola");
as3.push("SLICE");
as3.push("COla");
as3.push("Sting");
as3.push("Sprite");

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

ArrayQueue copy=as3;		// Keep the copy of Queue 3 so
 								that it doesnt becomes empty.
bag.remove(copy.pop());
bag.remove(copy.pop());
bag.remove(copy.pop());
bag.remove(copy.pop());
bag.remove(copy.pop());

 */