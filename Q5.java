package Assignments.Lab2;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		/*
		 * Write a program that computes the tax and tip on a restaurant bill. The
		 * program should ask the user to enter the charge for the meal. The tax should
		 * be 6.75 percent of the meal charge. The tip should be 20 percent of the total
		 * after adding tax. Display the meal charge, tax amount, tip amount, and total
		 * bill on the screen.
		 */
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the charge for meal: ");

		double charge = scn.nextDouble();
		double tax = charge * 0.0675;
		double tip = (tax + charge) * 0.5;
		double totalBill = charge + tax + tip;

		System.out.println("the meal charge: " + charge + "\nthe tax: " + tax + "\nthe tip: " + tip + "\ntotal bill: "
				+ (float) totalBill);

		scn.close();
	}

}
