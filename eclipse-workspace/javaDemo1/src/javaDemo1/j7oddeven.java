package javaDemo1;

import java.util.Scanner;

public class j7oddeven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n;
		
		System.out.print("Enter Number =>");
		n=sc.nextInt();

		if (n%2==0){
			System.out.println("Even");
		}else {
			System.out.println("odd");
	}
	}	

}
