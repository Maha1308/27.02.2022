

package com.javaprogram;

import java.util.*;

public class example2 {

	public static void main(String[] args) {
		System.out.println("enter the number:");
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();   

		
		if(N%2!=0)
		{
			System.out.println("Weird");
		}
		else if(N>=2 && N<=5)
		{
			System.out.println("Not Weird");
		}
		else if (N>=6 && N<=20)
		{
			System.out.println("Weird");
		}
		else if(N>=20)
		{
			System.out.println("Not Weird");
		}
		
		scanner.close();
	}
	
}





