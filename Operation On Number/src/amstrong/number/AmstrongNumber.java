package amstrong.number;

import java.util.Scanner;

/**
 * Date-19/07/2019
 * 
 * @author SANJAY
 *
 */
public class AmstrongNumber {
	Scanner input = new Scanner(System.in);
	int number, rem, temp, sum = 0, cube;

	public void input() {
		System.out.println("Enter The Number");
		number = input.nextInt();
		temp = number;
	}

	public void logic() {
		while (number > 0) {
			rem = number % 10;
			cube = rem * rem * rem;
			sum = sum + cube;
			number = number / 10;
		}
	}

	public void display() {
		number = temp;
		if (number == sum) {
			System.out.println("Number is Amstrong ");
		} else {
			System.out.println("Not Amstrong Number");
		}
	}

	public static void main(String[] args) {
		AmstrongNumber object = new AmstrongNumber();
		object.input();
		object.logic();
		object.display();
	}
}
