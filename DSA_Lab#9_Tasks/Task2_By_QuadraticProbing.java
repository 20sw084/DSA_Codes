
// Using Quadratic Probing(Closed Hashing).

public class Task2_By_QuadraticProbing {
	private Entry entries[];
	private float loadFactor;
	private int size,used;
	static int collisions;
	private final Entry nullEntry=new Entry(null,null);
	public Task2_By_QuadraticProbing(int capacity,float loadFactor) {
		this.loadFactor=loadFactor;
		entries=new Entry[capacity];
		collisions = 0;
	}
	public Task2_By_QuadraticProbing(int capacity) {
		this(capacity,0.75F);
	}
	public Task2_By_QuadraticProbing()
	{
		this(100);
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
			Entry entry=new Entry(key,value);
			if(entry==null) {
				entries[j]=new Entry(key,value);
				++size;
				++used;
				return null;
			}
			if(entry==nullEntry) {
				continue;
			}
			if(entry.key.equals(key)) {
				size++;
				Object oldValue=entry.value;
				// This Below line is showing error now
//				entries[j].value=value;
				// That one used. So,
				entries[j]=new Entry(key,value);
				return oldValue;
			}
		}
		return null;
	}
	private void rehash() {
		// TODO Auto-generated method stub
		Entry[] oldEntries = entries;
		for(int k = 0; k < oldEntries.length; k++)
		{
			// Quadratic Probing Condition
			// 2n+(i*i)
			entries = new Entry[ (2*oldEntries.length+(int)Math.sqrt(k))];
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
	public int size() {
		return size;
	}
	public static void main(String[] args) {
		Task2_By_QuadraticProbing table1=new Task2_By_QuadraticProbing();
//		table1.entries[1]=table1.new Entry(2,92);
//		table1.entries[2]=table1.new Entry(1,84);
		table1.put(1, 84);
		table1.put(23, 92);
		table1.put(13, 84);
		table1.put(22, 92);
		table1.put(12, 84);
		table1.put(21, 92);
		table1.put(41, 78);
		table1.put(20, 92);
		table1.put(30, 92);
		table1.put(30, 84);
		System.out.println(table1.get(2));
		System.out.println(table1.get(22));
		System.out.println(table1.get(41));
		System.out.println(table1.get(26));
		System.out.println(table1.get(22));
		System.out.println(table1.get(41));
		System.out.println(table1.get(26));

		System.out.println("Collisions in Quadratic Probing are: "+(Task2_By_QuadraticProbing.collisions-table1.size()));
		
		LinearProbing table2=new LinearProbing();
		table2.put(1, 84);
		table2.put(23, 92);
		table2.put(13, 84);
		table2.put(22, 92);
		table2.put(12, 84);
		table2.put(21, 92);
		table2.put(41, 78);
		table2.put(20, 92);
		table2.put(30, 92);
		table2.put(30, 84);
//		System.out.println(table2.get(22));
//		System.out.println(table2.get(41));
//		System.out.println(table2.get(26));
		System.out.println("Collisions in Linear Probing are: "+(LinearProbing.collisions-table2.size()));

	
	}
}