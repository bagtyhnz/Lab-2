package Assignments.Lab2;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter ur first number: ");
		int number=sc.nextInt();
		int question, biggest, smallest;
		biggest=number;
		smallest=number;
		
		
			
		do {
			System.out.println("enter ur next number: ");
			number=sc.nextInt();
			if (number>biggest) {
				biggest=number;
			}
			else if (number<smallest) {
				smallest=number;
			}
			
			System.out.println("do u want to enter another number? 0-No, 1-Yes");
			question=sc.nextInt();
			
		} while (question==1);
		System.out.println("the smallest number entered is " +smallest);
		System.out.println("the biggest number entered is "+biggest);
		
		
		sc.close();
		
	}

}
