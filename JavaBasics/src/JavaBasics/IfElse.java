package JavaBasics;

public class IfElse {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 20;
		int b = 20;
		
		/* Comparison Operators are
		 	< > == <= >= !=
		  */
		
		if (a>b)
			System.out.println("a is Greater.");
		else
			System.out.println("b is Greater.");
		
		int x,y,z;
		x=100;y=100;z=200;
		
		/* & AND , | OR*/
		
		if(x==y & y==z & x==z)
			System.out.println("All Values are Equal");
		else if(x>y & x>z)
			System.out.println("X is Greater.");
		else if (y>z)
			System.out.println("Y is greater");
		else
			System.out.println("Z is Greater");
	}

}
