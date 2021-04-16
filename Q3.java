package Assignments.Lab2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		/*
		 * Write a program that asks the user for a positive nonzero integer value. The
		 * program should use a loop to get the sum of all the integers from 1 up to the
		 * number entered.
		 */
		Scanner scn = new Scanner(System.in);
		System.out.print("enter a positive nonzero number: ");

		int number = scn.nextInt();
		int sum = 0;

		for (int i = 1; i < number; i++) {
			sum = sum + i;
		}
		System.out.println("the sum of integers up until " + number + " is " + sum);

		scn.close();
	}

}
