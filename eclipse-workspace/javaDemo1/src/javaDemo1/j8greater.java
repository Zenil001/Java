package javaDemo1;

import java.util.Scanner;

public class j8greater {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		int n1,n2;
		
		System.out.print("Enter Number1 =>");
		n1=sc.nextInt();
		
		System.out.print("Enter Number2 =>");
		n2=sc.nextInt();
		
		if (n1<n2) {
			System.out.println("Number 2 is greater");
		}else {
			System.out.println("Number 1 is greater");
		}
	}

}
