package Assignments.Lab2;

import java.util.Scanner;

public class Q2 {
	/* A bag of cookies holds 40 cookies.
	 * there are 10 serving in the bag and that 1 serving equals 300 calories. 
	 * write a program that lets the user enter the number of cookies he or she actually ate 
	 * and then reports the number of total calories consumed.*/
	public static void main(String[] args) {

		
		Scanner scn=new Scanner(System.in);
		System.out.print("how may cookies u ate? ");
		int cookiesEaten=scn.nextInt();
		
		//if 4 cookies=300 cal, 1 cookie=75 cal
		System.out.println("number of caloies consumed is "+cookiesEaten*75);
		
		scn.close();
		
	}

}
