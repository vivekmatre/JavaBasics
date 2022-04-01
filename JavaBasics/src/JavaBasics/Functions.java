package JavaBasics;

public class Functions {

	//Execution Entry
	public static void main(String[] args) {
		
		Functions fn = new Functions();
		
		fn.voidMethod();
		
		fn.someOutput();// return value given to fn.someOutput
		System.out.println(fn.someOutput());
		
		int i = fn.inputOutput(25, 5);// return value given to fn.inputOutput
		System.out.println(i); //System.out.println(fn.inputOutput(25,5));
		
		
		
	}//Execution Exit

	
	
	//Non Static Methods
	
	// 1.return type = void : does not return any Value
	
	public void voidMethod() {
		
		System.out.println("Void Method does not return any Value");
	}
	
	//2.return type : no input some output
	
	public int someOutput() {
		
		System.out.println("No input Some output :");
		int a=10;
		int b=20;
		int c= a+b;
		
		return c;
	}
	
	//3.return type : Some input some output
	public int inputOutput(int a, int b) {
		System.out.println("Output with some Input : ");
		int d = a/b;
		
		return d;
	}
}
