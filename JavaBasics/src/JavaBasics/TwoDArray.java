package JavaBasics;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub//
		
		String a[][]=new String[3][3]; // we can use int, char, double or boolean
		
		a[0][0]="A1";
		a[0][1]="A2";
		a[0][2]="A3";
		
		a[1][0]="B1";
		a[1][1]="B2";
		a[1][2]="B3";
		
		
		a[2][0]="C1";
		a[2][1]="C2";
		a[2][2]="C3";
		
		for(int i=0;i<a.length;i++) { //.length default prints row count and [0].length
										// prints count of columns in 0th row
			for(int j=0;j<a[0].length;j++) {
				System.out.println(a[i][j]);
			}
		}
		
	}

}
