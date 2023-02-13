package javaDemo1;

import java.util.Scanner;

public class j15proorlos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		int a,b;
		System.out.print("Enter Buy=>");
		a=sc.nextInt();
			
		System.out.print("Enter Sell=>");
		b=sc.nextInt();
		
		if (a>b) {
			System.out.println("Loss");
		}
		else {
			System.out.println("Profit");
		}
	}

}
