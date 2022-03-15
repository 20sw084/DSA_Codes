import java.util.Scanner;

public class Fibonacci_Series {
	public static long fib(int n) {
		if(n==0) {
			return 0;
		}
		if(n<3) {
			return 1;
		}
		return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
			for(int i=1;i<num;i++) {
				System.out.println(fib(i));
			}
		}
}