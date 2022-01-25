/* 
 * Write down a program of Searching function which search element 
 * of given index of given array and return that index.
 */
package dsaCodes;

public class Searching_In_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int size=17;
		int[] arr=new int[size]; 
		for(int i=0;i<size;i++) {
			arr[i]=i+1;
		}
		
		int index=search(arr,5);
		if(index>-1)
			System.out.println("Target Found at index : "+index);
		else
			System.out.println("Target Not Found");
	}
	public static int search(int[] a, int target) {
		if(target<0	) {
			return -1;
		}		
		else {
			int found=0;
			for(int i=0;i<a.length;i++) {
				if(target==a[i]) {
					found=i;
					break;
				}
				else {
					found=-1;
				}
			}
			return found;
		}
	}

}
