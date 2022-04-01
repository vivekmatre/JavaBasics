package PracticeExamples;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String text = sc.nextLine();
		char[] arr = text.toCharArray();
		
		for(int i=(arr.length-1);i>=0;i--)
			System.out.print(arr[i]);
		}

}
