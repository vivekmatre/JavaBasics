package JavaBasics;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		int i=10;
		//int i =20; // Duplicate variable is not allowed in JAVA, However
		i = 20; //is allowed because it overrides previous value. now i has value 20
		int j = 30;
		System.out.println(i+j);
		
		double d1 = 10; // treats as 10.00
		double d2 = 10.01;;;;;// still prints d2 
		
		char c1 = 'a';
		char c2 = '1';
		//char c3 = 'aa'; // char allows to store only single digit value in single quote
		char c4 = 'k';;; // still prints c4 value
		
		boolean b1 = true;
		boolean b2 = false;
		
		/* Primitive Data Types : int,double, char and boolean */
		
		System.out.println(""+c4);
		System.out.println(""+d2);;;;
		;
		System.out.println(""+b1);
		
		String s1="ab";
		String s2="cd";
		String s3 = "";
		/* String is a class which refers to an object which hv a methods 
		  to perform operations and refered as Non-Primitive data type */
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
