package assignment5;

import java.util.Scanner;

public class SumOf2Num {

	public static void main(String[] args) {
		int x, y, sum;  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the first number: ");  
		x = sc.nextInt();  
		System.out.print("Enter the second number: ");  
		y = sc.nextInt();  
		sum = x+y; 
		System.out.println("The sum of two numbers x and y is: " + sum);  

	}

}
