package JavaBasics;

import java.util.Scanner;

public class Loops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub//
		
		int a,b=0;
		for(a=1;a<=10;a++)
		{
			b += a;
		}
		System.out.println("Sum of the Numbers from 1 to 10 is "+b);
		
		
		int x,y=0,z;
		Scanner sum = new Scanner(System.in);
		System.out.println("Enter Number to Count Sum");
		z=sum.nextInt();
		
		for (x=1;x<=z;x++) {
			
			y +=x;
		}
		System.out.println("Sum of the Numbers from 1 to "+z+" is : "+y);
		
		
	/*	int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to Print Table : ");
		 i = sc.nextInt();
		 System.out.println("Table:");
		 for(j=1;j<=10;j++)
		 {
			 System.out.println(i*j);
		 }
	*/
		 
	}

}
