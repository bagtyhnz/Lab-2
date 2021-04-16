package Assignments.Lab2;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
/*
 * Write a program that will ask the user to enter the amount of a purchase.
 * The program should then compute the state and county tax sales tax.
 * Assume the state sales tax is 4 percent and the county sales tax is 2 percent.
 * The program should display the amount of the purchase, the state sales tax,
 * the county sales tax, the total sales tax, and the total of the sale
 * (which is the sum of the amount of purchase plus the total sales tax)
 */
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the amount of purchase: ");
		double price=scn.nextInt();
		
		System.out.println("amount of purchase: "+price);
		System.out.println("state tax: "+price*0.02);
		System.out.println("country tax: "+price*0.04);
		System.out.println("total tax: "+price*0.06);
		System.out.println("total of sale: "+(price+(price*0.06)));
		
		scn.close();
	}

}
