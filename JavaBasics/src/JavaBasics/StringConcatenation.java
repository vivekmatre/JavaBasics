package JavaBasics;

public class StringConcatenation {
	
	public static void main(String[] args){
		
		//+ is a concatenation operator
		
		int a = 10;
		int b = 20;
		String x = "Hello";
		String y ="World";
		double c = 12.50;
		double d = 8.50;
		
		System.out.println(a+b);
		System.out.println(x+" "+y);
		System.out.println(x+y);
		
		System.out.println();
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		
		System.out.println();
		System.out.println(a+b+x+y+a+b);
		
		System.out.print("Hello World");
		System.out.println("Hello Java");
		
		System.out.println("Addition of Double : "+(c+d));
		System.out.println("Value of a = "+a+" and b = "+b);
	}

}
