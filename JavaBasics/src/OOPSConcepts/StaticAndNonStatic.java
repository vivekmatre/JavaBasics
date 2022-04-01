package OOPSConcepts;

public class StaticAndNonStatic {
	
	//Global Vars : Scope will be available across all the Functions with Conditions
	// if it is Static we can access it directly 
	//for non static we need to create Object
	String name ="Vivek";
	static int age = 26;
	
	
	public static void main(String[] args) {
		// How to Call static methods and vars..?
		
		//1. Direct Calling
		System.out.println("Direct Calling Static Var");
		System.out.println(age);
		System.out.println("Direct Calling Static Method : ");
		sum();
		
		//2. Calling by Class reference
		
		System.out.println("Calling Var by Class reference : ");
		System.out.println(StaticAndNonStatic.age);
		System.out.println("Calling Static Method by Class ref: ");
		StaticAndNonStatic.sum();
		
		// To Call non Static Var or Methods we need to create Object of the Class
	}
	
	public static void sum() {
		
		
		int i=10;
		int j=20;
		int k=i+j;
		
		System.out.println(k);
	}

}
