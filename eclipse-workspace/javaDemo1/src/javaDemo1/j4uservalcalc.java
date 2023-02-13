package javaDemo1;

import java.util.Scanner;

public class j4uservalcalc {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		int no1,no2;
		
		System.out.print("Enter number1 =>");
		no1=sc.nextInt();
		
		System.out.print("Enter number2 =>");
		no2=sc.nextInt();
		
		
		System.out.println("Add = " + (no1+no2));
		System.out.println("Sub = " + (no1-no2));
		System.out.println("Mul = " + (no1*no2));
		System.out.println("Div = " + (no1/no2));
		
		
		
	}

}
