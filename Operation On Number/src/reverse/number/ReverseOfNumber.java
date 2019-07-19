package reverse.number;

import java.util.Scanner;

/**
 * Date-14/07/2019
 * 
 * Reverse of a Number Program
 * 
 * @author SANJAY
 *
 */
public class ReverseOfNumber {
	Scanner input = new Scanner(System.in);
	int number;
	int rem, rev = 0;

	/**
	 * input() is use to take input from user
	 */
	public void input() {
		System.out.println("Enter the Number:");
		number = input.nextInt();
	}

	/**
	 * logic() method is contain the Logic of Prime Number
	 */
	public void logic() {
		while (number > 0) {
			rem = number % 10;
			rev = rev * 10 + rem;
			number = number / 10;
		}
	}

	/**
	 * display() method is use to Display the Output
	 */
	public void display() {
		System.out.println("Reverse Of a Number is:");
		System.out.println(rev);
	}

	/**
	 * main() here Java Program start execution
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ReverseOfNumber object = new ReverseOfNumber();
		object.input();
		object.logic();
		object.display();
	}
}
