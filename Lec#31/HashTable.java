public class HashTable {
	private static final HashTable.Entry NIL = null;
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
		int h=hash(key);
		for(int i=0;i<entries.length;i++){
			int j=(h+1)%entries.length;
			Entry entry=entries[j];
			if(entry==null || entries[j]==NIL) {
				entries[j]=new Entry(key,value);
				++size;
			}
		}
	}
	public Object get(Object key) {
		int h=hash(key);
		for(int i=0;i<entries.length;i++) {
			int j=(h+i)%entries.length;
			Entry entry=entries[j];
			if(entry==null) break;
			if(entry==NIL) continue;
			if(entry.key.equals(key)) {
				return entry.value;
			}
		}	
		return null;
	}
	public Object remove(Object key)
	{
		int h=hash(key);
		if(size>0.75*entries.length) {
			rehash();
		}
		for(int i=0;i<entries.length;i++) {
		int j=(h+i)%entries.length;
		if(entries[j]==null) break;
		if(entries[j].key.equals(key)) {
			Object value=entries[j].value;
			entries[j]=NIL;
			--size;
			return value;
		}
		}
		return null;
	}
	private void rehash() {
		Entry[] oldEntries=entries;
		entries=new Entry[2*oldEntries.length+1];
		for(int k=0;k<oldEntries.length;k++) {
			Entry entry=oldEntries[k];
			if(entry==null || entry==NIL) {
				continue;
			}
			int h=hash(entry.key);
			for(int i=0;i<entries.length;i++) {
				int j=(h+i)%entries.length;
				if(entries[j]==null) {
					entries[j]=entry;
					break;
				}
			}
		}
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