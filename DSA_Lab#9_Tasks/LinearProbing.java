
// Using Linear Probing(Closed Hashing).

public class LinearProbing {
	private Entry entries[];
	private float loadFactor;
	private int size,used;
	public static int collisions;
	private final Entry nullEntry=new Entry(null,null);
	public LinearProbing(int capacity,float loadFactor) {
		this.loadFactor=loadFactor;
		entries=new Entry[capacity];
		collisions=0;
	}
	public LinearProbing(int capacity) {
		this(capacity,0.75F);
	}
	public LinearProbing()
	{
		this(92);
	}
	private class Entry{
		Object key,value;
		Entry(Object key,Object value){
			this.key=key;
			this.value=value;
		}
	}
	public Object get(Object key) {
		int h=hash(key);
		for(int i=0;i<entries.length;i++) {
			int j=nextProbe(h,i);
			Entry entry=entries[j];
			if(entry==null) break;
			if(entry==nullEntry) continue;
			if(entry.key.equals(key)) {
				return entry.value;
			}
		}
		return null;
	}
	public int hash(Object key) {
		if(key==null) throw new IllegalArgumentException();
		return (key.hashCode() & 0x7FFFFFFF) % entries.length;
	}
	public int nextProbe(int hash,int count) {
		collisions++;
		return (hash+count)%entries.length;
	}
	public Object put(Object key,Object value) {
		if(used>loadFactor*entries.length) {
			rehash();
		}
		int h=hash(key);
		for(int i=0;i<entries.length;i++) {
			int j=nextProbe(h,i);
			Entry entry=entries[j];
			if(entry==null) {
				entries[j]=new Entry(key,value);
				++size;
				++used;
				collisions+=i;
				return null;
			}
			else if(entry==nullEntry) {
				collisions+=i;
				continue;
			}
			else if(entry.key.equals(key)) {
				size++;
				collisions+=i;
				Object oldValue=entry.value;
				// This Below line is showing error now
				entries[j].value=value;
				// That one used. So,
//				entries[j]=new Entry(key,value);
				return oldValue;
			}
//			else
//				collisions++;
		}
		return null;
	}
	private void rehash() {
		// TODO Auto-generated method stub
		Entry[] oldEntries = entries;
		entries = new Entry[2*oldEntries.length+1];
		for(int k = 0; k < oldEntries.length; k++)
		{
			Entry entry = oldEntries[k];
			if(entry == null || entry == nullEntry) continue;
			int h = hash(entry.key);
			for(int i = 0; i<entries.length; i++)
			{
				int j = nextProbe(h,i);
				if(entries[j]==null)
				{
					entries[j] = entry;
					break;
				}
			}
		}
		used = size;
	}
	public Object remove(Object key) {
		int h=hash(key);
		for(int i=0;i<entries.length;i++) {
			int j=nextProbe(h,i);
			Entry entry	= entries[j];
			if(entry==null) {
				break;
			}
			if(entry==nullEntry) {
				continue;
			}
			if(entry.key.equals(key))
			{
				Object oldValue=entry.value;
				entries[j]=nullEntry;
				--size;
				return oldValue;
			}
		}
		return null;
	}
	public static void main(String[] args) {
		LinearProbing table1=new LinearProbing();
//		table1.entries[1]=table1.new Entry(2,92);
//		table1.entries[2]=table1.new Entry(1,84);
		table1.put(2, 92);
		table1.put(1, 84);
		table1.put(23, 92);
		table1.put(13, 84);
		table1.put(22, 92);
		table1.put(12, 84);
		table1.put(21, 92);
		table1.put(41, 78);
		table1.put(20, 92);
		table1.put(10, 84);
		table1.put(29, 92);
		table1.put(19, 84);
		table1.put(28, 92);
		table1.put(18, 84);
		table1.put(27, 92);
		table1.put(17, 84);
		table1.put(26, 92);
		table1.put(16, 84);
		table1.put(25, 92);
		table1.put(15, 84);
		table1.put(24, 92);
		table1.put(14, 84);
		table1.put(30, 92);
		System.out.println(table1.put(30, 84));
//		table1.remove(1);/
//		System.out.println(table1.get(2));
		System.out.println("Collisions in Linear Probing are: "+(collisions-table1.size()));

	}
	int size() {
		// TODO Auto-generated method stub
		return size;
	}
}