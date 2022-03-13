
// Using Separate Chaining.

public class HashTable2 {
	private Entry entries[];
	private float loadFactor;
	private int size,used;
	private final Entry nullEntry=new Entry(null,null,null);
	public HashTable2(int capacity,float loadFactor) {
		this.loadFactor=loadFactor;
		entries=new Entry[capacity];
	}
	public HashTable2(int capacity) {
		this(capacity,0.75F);
	}
	public HashTable2()
	{
		this(92);
	}
	private class Entry{
		Object key,value;
		Entry next;
		Entry(Object key,Object value,Entry next){
			this.key=key;
			this.value=value;
			this.next=next;
		}
	}
	public Object get(Object key) {
		int h=hash(key);
		for(Entry e=entries[h];e!=null;e=e.next) {
			if(e.key.equals(key)) {
				return e.value;
			}
		}
		return null;
	}
	public int hash(Object key) {
		if(key==null) throw new IllegalArgumentException();
		return (key.hashCode() & 0x7FFFFFFF) % entries.length;
	}
	public int nextProbe(int hash,int count) {
		return (hash+count)%entries.length;
	}
	public Object put(Object key,Object value) {
		int h=hash(key);
		for(Entry e=entries[h];e!=null;e=e.next) {
			if(e.key.equals(key)) {
				Object oldValue=e.value;
				// This Below line is showing error now
//				entries[j].value=value;
				// That one used. So,
				e.value=value;
				return oldValue;
			}
		}
		entries[h]=new Entry(key,value,entries[h]);
		++size;
		if(size> loadFactor*entries.length) {
			rehash();
		}
		return null;
	}
	private void rehash() {
		// TODO Auto-generated method stub
		Entry[] oldEntries = entries;
		entries = new Entry[2*oldEntries.length+1];
		for(int k = 0; k < oldEntries.length; k++)
		{
			for(Entry old=oldEntries[k];old!=null;) {
				Entry e=old;
				old=old.next;
				int h=hash(e.key);
				e.next=entries[h];
				entries[h]=e;
			}
		}
	}
	public Object remove(Object key) {
		int h=hash(key);
		for(Entry i=entries[h],prev=null;i!=null;i=i.next) {
			if(i.key.equals(key))
			{
				Object oldValue=i.value;
				if(prev==null) {
				entries[h]=i.next;
				}
				else {
					prev.next=i.next;
				}
				--size;
				return oldValue;
			}
		}
		return null;
	}
	public static void main(String[] args) {
		HashTable2 table1=new HashTable2();
		table1.put(2, 92);
		table1.put(1, 84);
		table1.remove(1);
		System.out.println(table1.get(2));
	}
}