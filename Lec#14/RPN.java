public class RPN {
	public RPN(String[] args) {
		ArraysStack stack=new ArraysStack(args.length);
		for(int i=0;i<args.length;i++) {
			String input=args[i];
		if(isAnOperator(input)) {
			double x=Double.parseDouble((String)stack.pop());
			double y=Double.parseDouble((String)stack.pop());
			double z=evaluate(x,y,input);
			System.out.println(z);
			stack.push(""+z);
		}
		else {
			stack.push(input);
		}
		}
	}
	public boolean isAnOperator(String str) {
		return (str.length()==1 && "+-*/".indexOf(str)>=0);
	}
	public double evaluate(double x, double y, String input) {
		double z=0.0;
		if(input.equals("+")) {
			z=x+y;
		}
		if(input.equals("-")) {
			z=x-y;
		}
		if(input.equals("*")) {
			z=x*y;
		}
		if(input.equals("/")) {
			z=x/y;
		}
		return z;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"2","3","+"};
		RPN rpn=new RPN(str);
	}
}