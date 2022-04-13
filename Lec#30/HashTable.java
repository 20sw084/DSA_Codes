public class HashTable {
	private Entry[] entries=new Entry[11];
	private int size;
	private class Entry{
		Object key,value;
		Entry(Object key,Object value){
			this.key=key;
			this.value=value;
		}
	}
	private int hash(Object key) {
		return (key.hashCode() & 0x7FFFFFFF) % entries.length;
	}
	public int size() {
		return size;
	}
	public void put(Object key, Object value) {
		entries[hash(key)]=new Entry(key,value);
	}
	public Object get(Object key) {
		return entries[hash(key)].value;
	}
	public Object remove(Object key)
	{
		int h=hash(key);
		Object value=entries[h].value;
		entries[h]=null;
		--size;
		return value;
	}
	
	public static void main(String[] args) {
		HashTable hash=new HashTable();
		hash.put("PK", "Pakistan");
		hash.put("SL", "Sri-Lanka");
		hash.put("US", "United States");
		hash.put("GB", "United Kingdom");
		hash.put("PT", "Portugal");
		
		System.out.println(hash.get("US"));
		System.out.println(hash.get("PK"));
		System.out.println(hash.get("SL"));
		System.out.println(hash.get("GB"));
		System.out.println(hash.get("PT"));
	}
}
