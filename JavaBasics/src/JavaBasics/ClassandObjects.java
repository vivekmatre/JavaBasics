package JavaBasics;

public class ClassandObjects {
	
	String dept;
	int exp;
	

	public static void main(String[] args) {
		
		/* new ClassandObjects() :- This is is the Object of Class
		 * new keyword is used to create Object
		 * c1,c2,c3 are Object Reference Variables 
			*
		*/
		ClassandObjects c1 = new ClassandObjects();
		ClassandObjects c2 = new ClassandObjects();
		ClassandObjects c3 = new ClassandObjects();
		
		c1.dept="Java";
		c1.exp=5;
		
		c2.dept=".Net";
		c2.exp=3;
		
		c3.dept="SAP";
		c3.exp=4;
		
		System.out.println(c1.dept);
		System.out.println(c2.dept);
		System.out.println(c3.dept);

	}

}
