package JavaBasics;

public class StaticArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array : To Store similar data type values in a single array variable
		//Lowest bound/index : 0
		//Upper bound/index : n-1 (where n is the size of the array)
		// One Dimensional Array
		
		/*Disadvantages
		 * Size is Fixed : Static Array
		 		:- To Overcome this we use :- Collections:- ArrayList, HashTable -- Dynamic Array
		 * Stores only similar data type values
		  		:- to Overcome this we use :- Object Array
		 * */
		
		int a[] = new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		System.out.println("Length of Int Array is : "+a.length);
		System.out.println(a[0]);
		
		char b[] = new char[2];
		b[0]='H';
		b[1]='i';
		System.out.println(b[0]);
		
		double c[] = new double[2];
		c[0]=12.25;
		c[1]=12.75;
		System.out.println(c[0]);
		
		boolean d[] = new boolean[3];
		d[0]=true;
		d[1]=true;
		d[2]=false;
		System.out.println(d[0]);
		
		String s[] = new String[2];
		s[0]="Hello";
		s[1]="World";
		
		System.out.println(s[0]);
		
		//Object Array
		Object obj[] = new Object[5];
		obj      [0]=27; //Space is allowed
		obj[1]="Vivek";
		obj[2]="Matre";
		obj[3]="07 Dec 1994";// String can be Empty
		obj[4]='M';
		//obj[4]=''; //Empty Char Constant Error
		
		System.out.println("Displaying Object Array");
		/*
		System.out.println(obj[0]);
		System.out.println(obj[1]);
		System.out.println(obj[2]);
		System.out.println(obj[3]);
		System.out.println(obj[4]); */
		
		for(int i=0;i<obj.length;i++) //always init 0 and use < lenght
			System.out.println(obj[i]);
		
		System.out.println("Length of object Array: "+obj.length);

	}

}
