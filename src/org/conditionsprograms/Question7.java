package org.conditionsprograms;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num =s.nextInt();
		
		int num1 = 1, num2=1;
		
		
		for (int i = 1; i>=num; i++) {

			int  sum = num1 + num2;
			System.out.println(num1);
			num1 = num2; 
			num2 = sum;


	}

}
}
