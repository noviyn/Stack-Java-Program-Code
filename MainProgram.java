public class MainProgram{
	public static void main (String args[]){
		Stack stack1 = new Stack();
		stack1.push(4);
		stack1.push(1);
		stack1.push(7);
		stack1.push(8);
		stack1.push(6);
		stack1.push(3);
		stack1.print();
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		stack1.print();	
	}

}