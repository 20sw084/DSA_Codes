// Get index of second largest element from unsorted array.
package dsaCodes;

public class Task5 {

	public static void main(String[] args)
	{
		int[] arr= {1,5,2,3,0};
		System.out.print("Second Largest Element Index is: "+ getSecondLargestIndex(arr));
	}	
	public static int  getSecondLargestIndex(int[] arr) {
		int sLargest=0;
		int[] copiedArr=arr;
		for(int i=0;i<arr.length;i++) {
			for(int j=arr.length-1;j>=0;j--) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}		
		int index=0;
		for(int i=0;i<copiedArr.length;i++) {
			if(arr[2]==copiedArr[i]) {
				index=(i+1);
			}
		}
		return index;
	}
}
