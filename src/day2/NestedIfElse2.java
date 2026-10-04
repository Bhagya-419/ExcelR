package day2;

import java.util.Scanner;

public class NestedIfElse2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your monthlysalary: ");
		double salary = sc.nextDouble();
		if(salary>=75000) {
			System.out.println("Excellent");
		}
		else if(salary>=60000) {
			System.out.println("Very Good");
		}
		else if(salary>=50000) {
			System.out.println("Good");
		}
		else if(salary>=40000) {
			System.out.println("Ok");
		}
		else {
			System.out.println("Not Ok");
		}
		System.out.println("Thank you");
	}
}
