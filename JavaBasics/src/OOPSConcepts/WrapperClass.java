package OOPSConcepts;

public class WrapperClass {

	/*Wrapper classes provide a way to use primitive 
	 * data types (int, boolean, etc..) as objects.
	 * 
	 * 
	 * 
	 * */
	
	// 11 Parse Date Methods https://codegym.cc/groups/posts/parse-methods-in-java 
	public static void main(String[] args) {
		
		String a = "100";
		String s1 ="Hello";
		String k = "True";
		
		/**String u = "100A";
		int v = Integer.parseInt(u); //NumberFormatException.forInputString
		System.out.println(v);*/
		
		System.out.println("String : "+a);
		
		int b = Integer.parseInt(a);
		System.out.println("Integer.parseInt(a) of String a : "+b);
		//System.out.println("Sum : "+(b+20));
		
		double d = Double.parseDouble(a);
		System.out.println("Double.parseDouble(a) of String a : "+d);
		
		boolean i = Boolean.parseBoolean(k);
		boolean j = Boolean.parseBoolean(a);
		System.out.println("Boolean.parseBoolean(a) of String a : "+j);
		System.out.println("Boolean.parseBoolean(k) of String k : "+i);
		
		
		System.out.println();
		char x = s1.charAt(0);
		System.out.println("First Character of String : "+x);
		//String to Char Conversion
		System.out.println("String Hello to Char Conversion :");
		
		for(int z=0;z<s1.length();z++)
		{
			char f = s1.charAt(z);
			System.out.println(""+f);
		}
		
		
		//int , char, double,boolean to String
		System.out.println();
		int p = 1000; 
		char q ='q'; 
		double r=10.00; 
		boolean s = true;
		
		String m = String.valueOf(p);
		System.out.println("String.valueOf(p) Int to String : "+m);
		
		String n = String.valueOf(q);
		System.out.println("String.valueOf(n) Char to String : "+n);
		
		String o = String.valueOf(r);
		System.out.println("String.valueOf(o) Double to String : "+o);
		
		String t = String.valueOf(s);
		System.out.println("String.valueOf(t)Boolean to String : "+t);
		
		
		
	}

}
