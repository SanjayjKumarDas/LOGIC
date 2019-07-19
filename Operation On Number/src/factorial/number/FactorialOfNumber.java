package factorial.number;

import java.util.Scanner;

/**
 * Date-14/07/2019
 * 
 * Factorial of Number
 * 
 * @author SANJAY
 *
 */
public class FactorialOfNumber {
	Scanner input = new Scanner(System.in);
	int number, fact = 1;

	/**
	 * Take input from the user
	 */
	public void input() {
		System.out.println("Enter the Number");
		number = input.nextInt();
	}

	/**
	 * Logic part
	 */
	public void logic() {
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
	}

	/**
	 * To Display the Output
	 */
	public void display() {
		System.out.println("Factorial of a number is:");
		System.out.println(fact);
	}

	public static void main(String[] args) {
		FactorialOfNumber obj = new FactorialOfNumber();
		obj.input();
		obj.logic();
		obj.display();
	}
}
