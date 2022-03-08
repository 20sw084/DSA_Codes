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
	public static long fib1(int n) {
		if(n==0) {
			return 0;
		}
		if(n<3) {
			return 1;
		}
		int f0=1;int f1=1;int f2=1;
		for(int i=2;i<n;i++) {
			f0=f1;
			f1=f2;
			f2=f0+f1;
		}
		return f2;
	}
	public static void main(String[] args) {
		for(int i=31;i<41;i++) {
			long To=System.currentTimeMillis();
			long m=fib(i);
		long t1=System.currentTimeMillis();
		System.out.println("Fibonacci of "+i+" is "+m
				+" in time "+	(t1-To));
	}
	}
}
