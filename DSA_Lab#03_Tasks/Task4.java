package dsaCodes;

public class Task4 {
	public static void main(String args[]) {
		int[] arr= {1,2,3,4,5};
		System.out.println("Average is: "+getAverage(arr));
	}
	public static float getAverage(int[] arr) {
		float avg=0;
		for(int i=0;i<arr.length;i++) {
			avg+=arr[i];
		}
		int size=arr.length;
		avg=avg/size;
		return avg;
	}
}
