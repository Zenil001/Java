package javaDemo1;

import java.util.Scanner;

public class j5uservaluetri {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		double h,b;
		
		System.out.print("Enter Hight =>");
		h=sc.nextDouble();

		System.out.print("Enter base =>");
		b=sc.nextDouble();
		
		System.out.println("Area of tringle is "+(h*b*0.5));
	}

}
