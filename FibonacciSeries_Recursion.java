import java.util.Scanner;

public class FibonacciSeries{
public static int fib(int num) {
	if(num<=1) {
		return num;
	}	
		return fib(num-1)+fib(num-2);
}
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number");
	int num=sc.nextInt();
	if(num>=0) {
			System.out.println(fib(num));
	}
	else
		System.out.println("Only Fibonacci Series of Positive Numbers are Allowed");
}
}
