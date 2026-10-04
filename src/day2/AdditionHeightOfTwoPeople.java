package day2;

import java.util.Scanner;

public class AdditionHeightOfTwoPeople {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter height of first person: ");
		double h1=sc.nextDouble();
		System.out.println("Enter height of second person: ");
		double h2=sc.nextDouble();
		double total_height=h1+h2;
		System.out.println("sum of height of two persons is: "+total_height);
				
	}
}
