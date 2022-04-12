import java.util.Scanner;   

public class Factorial{
public static long fact(long num) {
	if(num>=1)
	return num*fact(num-1);
	else
		return 1;
}
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number");
	long num=sc.nextLong();
	if(num>=0) {
		System.out.println("Factorial is: "+fact(num));
	}
	else
		System.out.println("Only Factorial of Positive Numbers are Allowed");
}
}
