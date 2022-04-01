package ExceptionHandling;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	}
	public static void Division() {
		int a =10;
		try {
			int c = a/0;
			System.out.println("Inside try");
			System.out.println(c);
			throw new ArithmeticException();
		}
		
		catch(Exception e){
			System.out.println("Inside Catch");
			
		}
		
		finally {
			System.out.println("Inside Finally");
			int d = a/0;
			System.out.println(d);
		}
	}
}
