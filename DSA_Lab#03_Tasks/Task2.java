package dsaCodes;

public class Task2 {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5,6,7,8,9};
		int[] arr2= arr1;
		if(arr1.equals(arr2)) {
			System.out.println("Its Equal");
		}
		else {
			System.out.println("Not Equal");
		}
	}
	
}
