import java.util.Stack;
public class useStack {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack1=new Stack<String>();
		System.out.println("Is Stack is Empty??\t\t"+stack1.isEmpty());
		stack1.push("Black");
		stack1.pop();
		stack1.push("Blue");
		System.out.println("Peek of Stack is??\t\t"+stack1.peek());
		stack1.push("White");
		System.out.println("Size of Stack is??\t\t"+stack1.size());
		System.out.println("All Elements in Stack is??\t"+stack1);
	}
}