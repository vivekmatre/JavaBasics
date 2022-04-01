package JavaBasics;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,k;
		System.out.println("Printing 1 to 10 using While Loop");	
		// Print 1 to 10 While Loop//
	i=1;
		while(i<=10)
		{
		System.out.println(i);
		i++; //i = i+1; 
		
		//i=i++; :Gives Error as Value stays 1 and loop will never end
		}
		
		System.out.println("Using != Operator");
	 j=1;
		while (j!=11) {
			System.out.println(j);
			j++;
		}
		
		System.out.println("Printing 1 to 10 using For Loop");		

	  	for(k=1;k<=10;k++) {
	  		System.out.println(k);
	  	}
	  	
	  	System.out.println("Printing Even and Odd Numbers 1 to 100 Using While Loop");
	  	int a,b,c,d;
	  	a=2;c=0;
	  	System.out.println("Even Numbers :");
	  	while(a<=100) {
	  		System.out.println(a);
	  		a=a+2;
	  		c=c+1;
	  	}
	  	System.out.println("Count of Even numbers are : "+c);
	  	System.out.println("Odd Numbers :");
	  	b=1;
	  	d=0;
	  	while (b<=100) {
	  		System.out.println(b);
	  		b=b+2;
	  		d=d+1;
	  	}
	  	System.out.println("Count of Odd numbers are : "+d);
	 	}

}
