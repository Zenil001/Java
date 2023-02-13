package javaDemo1;

import java.util.Scanner;

public class j14leapornot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		int y;
		
		System.out.print("Enter Year=>");
		y=sc.nextInt();
		
		if (y%4==0) {
			System.out.println("It's  leap year" );	
		}
		else {
			System.out.println("It's not a leap year");
		}
	}

}
