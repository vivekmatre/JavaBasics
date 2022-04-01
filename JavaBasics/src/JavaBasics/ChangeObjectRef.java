package JavaBasics;

public class ChangeObjectRef {
	
	String dept;
	int exp;
	int s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassandObjects c1 = new ClassandObjects();
		ClassandObjects c2 = new ClassandObjects();
		ClassandObjects c3 = new ClassandObjects();
		
		c1.dept="Java";
		c1.exp=5;
		
		c2.dept=".Net";
		c2.exp=3;
		
		c3.dept="SAP";
		c3.exp=4;
		
		System.out.println("Before Changing Reference");
		System.out.println("Department:"+c1.dept+", Experiance : "+c1.exp);
		System.out.println("Department:"+c2.dept+", Experiance : "+c2.exp);
		System.out.println("Department:"+c3.dept+", Experiance : "+c3.exp);
		
		c1=c2; //c1 is referring to c2
		c2=c3; // c2 is referring to c3
		c3=c1; // c3 is referring to c1 which is already referring c2.
				// i.e c1=c2 , c2=c3 and c3=c1=c2;
		
		System.out.println();
		System.out.println("After Changing Reference");
		System.out.println("Department:"+c1.dept+", Experiance : "+c1.exp);//prints c2
		System.out.println("Department:"+c2.dept+", Experiance : "+c2.exp);//c3
		System.out.println("Department:"+c3.dept+", Experiance : "+c3.exp);//prints c2
		
	}

}
