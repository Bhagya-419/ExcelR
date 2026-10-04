package day2;

import java.util.Scanner;

public class AdditionTwoAges {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number1: ");
		int n1=sc.nextInt();
		System.out.println("Please enter number2: ");
		int n2=sc.nextInt();
		int sum=n1+n2;
		System.out.println("The sum is "+sum);
	}
}
