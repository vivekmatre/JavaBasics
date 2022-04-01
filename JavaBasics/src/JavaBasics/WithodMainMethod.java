package JavaBasics;

public class WithodMainMethod {
	
	/*
Yes, we can execute a java program without a main method by using a static block. 

Static block in Java is a group of statements that gets executed 
only once when the class is loaded into the memory by Java ClassLoader,
It is also known as a static initialization block.
Static initialization block is going directly into the stack memory.

Example//
class StaticInitializationBlock{
   static{
      System.out.println("class without a main method");
      System.exit(0);
   }
}
In the above example, 
we can execute a java program without a main method (works until Java 1.6 version). 
Java 7 and newer versions don’t allow this because 
JVM checks the presence of the main method before initializing the class.


	 * 
	 */

	public static void main(String [] args) {
		System.out.println("Main Method Scope");
		
		WithodMainMethod wm = new WithodMainMethod();
		wm.nonMain();
		
	}
	//Static non main method inside Class
	public static void nonMain() {
		System.out.println("Static Non Main");
	}
	
	//can define static main with different parameter count
	//Method Overloading
	public static void main(int a) {
		System.out.println("Another Static main with 1 Parameter");
	}
}	

// Cannot define Duplicate main() Inside or Outside Class

/* Cannot define static method Outside Class body
public static void abc() {
	System.out.println("Static Method Outside Class");
}*/


