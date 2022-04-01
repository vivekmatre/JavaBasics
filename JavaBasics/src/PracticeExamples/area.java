package PracticeExamples;

import java.util.Scanner;

abstract class Shape{
	int width;
	abstract void area();
	
}

class Square extends Shape{
	
	Square(int width){
		this.width=width;
	}
	
	void area() {
		int area = this.width * this.width;
		System.out.println(area);
		
	}
}

class Circle extends Shape{
	double pi=(double)Math.PI;
	Circle(int width){
		this.width=width;
	}
	void area(){
		double area = pi * this.width * this.width;
		System.out.println(area);
		
	}
	
}
abstract class area {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		Square a = new Square(x);
		Circle b = new Circle(y);
		
		a.area();
		b.area();

	}

}
