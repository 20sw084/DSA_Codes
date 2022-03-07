
public class Array_Sorting {
	public static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void insertionSort(int[] arr) {
		// Traverse the whole array from 2nd element
		for(int i=1;i<arr.length;i++) {
			// Keep changing the key in order to compare 
//			only 2 elements at a time.
			int key=arr[i];
			// compares it with previous element
			int j=i-1;
			// In order to avoid IndexOutOfBounds exception j>=0
			for(;j>=0 && arr[j]<key;j--) {
				// 2nd element will be assigned to 1st element
				arr[j+1]=arr[j];
			}
			//  
			arr[j+1]=key;
		}
	}
	public static void selectionSort(int[] arr) {
//		Do this in three steps:
//		1. Selection:
//					Selects the minimum element.
//		2. Sort:
//				Change the element.
//		3. Changing the Counter:
//								Counter should be changed.
		for(int i=0;i<arr.length-1;i++) {
			// For checks for smallest index among the whole array
			int smallIndex=i;
			//Compares j with every element if its small change min index
			for (int j = i+1; j < arr.length; j++) {
				// If there is smallest index
			if(arr[smallIndex]>arr[j]) {
				// Store the smallest index element
				smallIndex=j;
			}
			// Simple sorting will be used in loop to sort every element
			int temp=arr[smallIndex];
			arr[smallIndex]=arr[i];
			arr[i]=temp;
			}
		}
		
	}
	public static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,2,6,1,5,6,7,4};
//		bubbleSort(arr);
//		insertionSort(arr);
		selectionSort(arr);
		print(arr);
	}
}