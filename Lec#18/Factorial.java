public class Factorial {
	public static long fact(int num) {
		if(num<2)
			return 1;
		return num*fact(num-1);
	}
	public static void main(String[] args) {
		System.out.println(Factorial.fact(5));		
	}
}