package dsaCodes;

import java.util.Scanner;

public class Task3 {

	public static void main(String args[]) {
		String[] arr1=new String[1];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=((new Scanner(System.in)).next());
		}
		String[] arr2=arr1;
		if(arr1.equals(arr2)) {
			System.out.println("Its Equal");
		}
		else {
			System.out.println("Not Equal");
		}
		
		}
	
}
