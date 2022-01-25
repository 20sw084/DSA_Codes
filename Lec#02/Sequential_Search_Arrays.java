/* 
 * Write down a program of sequential searching of arrays.
 */
package dsaCodes;

import java.util.Scanner;

public class Sequential_Search_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int target=sc.nextInt();
		
		int size=17;
		int[] arr=new int[size]; 
		for(int i=0;i<size;i++) {
			arr[i]=i+1;
		}
		
		for(int j=0;j<size;j++) {
			if(arr[j]==target)
			System.out.println("Element "+arr[j]+" Found at Index: "+(j));
		}
		
	}

}
