 * Write down a program of Resizing an array.
 * (In our case, we are going to double it.)
 */
package dsaCodes;

public class Resizing_In_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int size=17;
		int[] arr=new int[size]; 
		for(int i=0;i<size;i++) {
			arr[i]=i+1;
		}
		
		int[] newArr=resize(arr);
		
		for(int i=0;i<newArr.length;i++) {
			newArr[i]=i+1;
		}
		
		for(int i=0;i<newArr.length;i++) {
			System.out.println(newArr[i]);
		}

	}
	public static int[] resize(int[] a) {
		int size=a.length;
		int aa[]=new int[size*2];
		
		System.arraycopy(a, 0, aa, 0, size);
		
		return aa;
	}

}
