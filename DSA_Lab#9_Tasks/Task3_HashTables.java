import java.util.Hashtable;

public class Task3_HashTables {
	public static void main(String args[]) {
		Hashtable<Integer,String> table=new Hashtable<Integer,String>();
		table.put(2, "Apple");
		table.put(4, "Banana");

		table.clear();
		
		table.put(6, "Orange");
		table.put(8, "StrawBerry");
		table.put(10, "Mango");
		table.put(12, "PineApple");
		
		System.out.println(table.contains("Orange"));
		
		System.out.println(table.get(8));
		
		System.out.println(table.remove(8));
		
		System.out.println(table.toString());
		
		System.out.println(table.size());
		
		System.out.println(table.values());		
	}
}