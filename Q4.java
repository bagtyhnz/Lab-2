package Assignments.Lab2;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
/*
 * Write a program that asks user for the number of males and the number of females in class.
 * The program should display the percentage of males and females in the class.
 */

		Scanner scn=new Scanner(System.in);
		
		System.out.println("enter the number of females in class: ");
		int females=scn.nextInt();
		
		System.out.println("enter the number of males in class: ");
		int males=scn.nextInt();
		
		System.out.println("percentage of females in class is "+(females*100/(females+males)));
		System.out.println("percentage of males in class is "+(males*100/(females+males)));
		
		scn.close();
		
	}

}
