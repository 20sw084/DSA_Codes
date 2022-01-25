 * Write down a program of Swapping function which swaps elements 
 * of given indexes of given array and return that array.
 */
package dsaCodes;


public class Swapping_In_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int size=17;
		int[] arr=new int[size]; 
		for(int i=0;i<size;i++) {
			arr[i]=i+1;
		}
		
		int[] newArr=swap(arr,2,7);
		
		for(int j=0;j<newArr.length;j++) {
			System.out.println(arr[j]);
		}
		
	}
	public static int[] swap(int[] a, int first, int second) {
		int temp=a[first];
		a[first]=a[second];
		a[second]=temp;
		return a;
	}

}
