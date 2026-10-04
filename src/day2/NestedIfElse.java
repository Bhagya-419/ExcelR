package day2;

import java.util.Scanner;

public class NestedIfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your percentage: ");
		double percentage=sc.nextDouble();
		if(percentage>=75) {
			System.out.println("Distinction");
		}
		else if(percentage>=60) {
			System.out.println("First Class");
		}
		else if(percentage>=50) {
			System.out.println("Second class");
		}
		else if(percentage>=40) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Not Pass");
		}
		System.out.println("Thank You");
	}
}
