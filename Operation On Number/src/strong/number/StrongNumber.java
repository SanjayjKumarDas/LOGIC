package strong.number;

import java.util.Scanner;

/**
 * Date-19/07/2019
 * 
 * @author SANJAY
 *
 *         Program to check The Strong Number
 */
public class StrongNumber {
	Scanner input = new Scanner(System.in);
	int number, fact, rem, temp, sum = 0;

	public void input() {
		System.out.println("Enter The Number");
		number = input.nextInt();
		temp = number;
	}

	public void logic() {
		while (number > 0) {
			rem = number % 10;
			fact = 1;
			for (int i = rem; i >= 1; i--) {
				fact = fact * i;
			}
			sum = sum + fact;
			number = number / 10;
		}

	}

	public void display() {
		number = temp;
		if (number == sum) {
			System.out.println("Strong Number");
		} else {
			System.out.println("Not A Strong Number");
		}
	}

	public static void main(String[] args) {
		StrongNumber object = new StrongNumber();
		object.input();
		object.logic();
		object.display();
	}
}
