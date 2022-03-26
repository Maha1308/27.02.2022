package com.javaprogram;


import java.util.Scanner;

public class solution3 {

	public static void main(String[] args) {
		System.out.println("enter the numbers,");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		System.out.println("enter the numbers,");
		double d= scan.nextDouble();
		System.out.println("enter the numbers,");
		scan.nextLine();

		String s= scan.nextLine();
	
		scan.close();
		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
		scan.close();
		

	}

}



