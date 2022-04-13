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
		Country c1=new Country("Pakistan","Urdu",881913,221);
		Country c2=new Country("Sri-Lanka","Tamil",65610,216);
		Country c3=new Country("United States","English",3531905,321);
		Country c4=new Country("United Kingdom","English",93628,67);
		Country c5=new Country("Portugal","Portugese",92090,10); 
		HashTable hash=new HashTable();
		hash.put("PK", c1);
		hash.put("SL", c2);
		hash.put("US", c3);
		hash.put("GB", c4);
		hash.put("PT", c5);
		
		System.out.println(hash.get("US"));
		System.out.println(hash.get("PK"));
		System.out.println(hash.get("SL"));
		System.out.println(hash.get("GB"));
		System.out.println(hash.get("PT"));
	}
}
