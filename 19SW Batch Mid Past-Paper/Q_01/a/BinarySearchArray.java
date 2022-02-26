/*  
Binary Search:
	      Binary Search is an efficient way to search data from a data structure.
Some Pre-Requisites for Binary Search must be available before searching in a data structure.
1. Data stored should be in sorted form.
Algorithmic Steps:
1. Get the start and end point of given data structure.
2. Get the mid point of start and end point.
3. Check Whether its equal to data youre going to search. 
4. If greater than data you are searching, decrement from end point.
5. If smaller than data you are searching, increment the start point.
6. Repeat Steps 2-5, untill start is greater or equal to zero.
7. Return the Yes/No when found/not-found respectively.
*/

public class BinarySearchArray {
	public static boolean search(int[] data,int num) {
		int f=0,l=data.length-1;
		boolean found=false;
		while(f<=l) {
			int index=f+l;
			index/=2;
			if(data[index]==num) {
				found=true;
				break;
			}
			if(data[index]<num) {
				f=index+1;
			}
			if(data[index]>num) {
				l=index-1;
			}
		}
		return found;
	}
	public static void main(String[] args) {
		int[] data = {1,15,33,42,43,45,67,73,75,77,89,95};
		System.out.println(search(data,95));
		System.out.println(search(data,47));
	}
}
