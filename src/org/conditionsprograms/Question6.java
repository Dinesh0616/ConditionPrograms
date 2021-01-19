package org.conditionsprograms;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		System.out.println("Enter the number :");
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		
		int factorial = 1;
		
		for (int i = 1; i <=num; i++) {
	
			int  fact = factorial* i;
			System.out.println(fact );

	}

}
}
