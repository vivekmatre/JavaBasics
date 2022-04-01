package PracticeExamples;

import java.util.Scanner;

public class BinaryConversion {
	static int x=0;
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		x= sc.nextInt();
		
		System.out.println(toBinary(x));
	/*	
		while(x>0) {
			binary = (x%2)+binary;
			x/=2;
		}
		System.out.println(binary);*/
		
		
		
	
	}
	public static String toBinary(int num) {
		String bin="";

		while(num>0) {
			bin = (num%2)+bin;
			num/=2;
		}
		
		return bin;
	} 
	

	

}
