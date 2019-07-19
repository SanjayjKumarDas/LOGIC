package swapping.of.number;

import java.util.Scanner;

/**
 * @author SANJAY
 *
 */
public class SwappingOfNumber {
	Scanner input = new Scanner(System.in);
	int number1, number2;

	public void input() {
		System.out.println("Enter The Number");
		number1 = input.nextInt();
		number2 = input.nextInt();
	}

	public void logic() {
		int temp;
		temp = number1;
		number1 = number2;
		number2 = temp;
	}

	public void display() {
		System.out.println("Swapping Of Two Number is:");
		System.out.println(number1);
		System.out.println(number2);
	}

	public static void main(String[] args) {
		SwappingOfNumber ob = new SwappingOfNumber();
		ob.input();
		ob.logic();
		ob.display();
	}
}
