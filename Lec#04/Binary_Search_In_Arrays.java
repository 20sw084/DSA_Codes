/*  
* Prerequisites of Binary Search:
* 1. The array should be in sorted form.
* Benefits of Binary Search:
* 1. Less time-consuming.
* 2. No need to search all records like as in arrays.
*/

/* 
 * Write down a program of Binary Search from array. 
 * (In our case, we are going to double it.)
 */
package dsaCodes;

import java.util.*;

public class BinarySearch_In_Arrays {
	public static void main(String[] args) {
				
		int size=17;
		int[] arr=new int[size]; 
		for(int i=0;i<size;i++) {
			arr[i]=(int)(Math.random()*100);
		}
		Arrays.sort(arr);
		
		int index=binarySearch(arr, 45);
		
		if(index==-1) {
			System.out.println("NOT Found");
		}
		else {
			System.out.println("Found at index : "+index);
		}
	}
	
	public static int binarySearch(int[] a, int target) {
	// Go for binary search from now 
	
			int p=0;				// From first index of array
			int q=a.length-1;		// To Last Index
			while(p<=q) {
				int i=(p+q)/2;
				if(a[i]==target) {
					return i;
				}
				if(a[i]<target) {
					p=i+1;
				}
				else {
					q=i-1;
				}
			}
			return -1;
	}
}
