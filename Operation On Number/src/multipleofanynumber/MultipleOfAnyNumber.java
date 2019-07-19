package multipleofanynumber;

import java.util.Scanner;

/**
 * Date-19/07/2019
 * 
 * @author SANJAY
 *
 */
public class MultipleOfAnyNumber {
	Scanner input = new Scanner(System.in);
	int number;

	public void input() {
		System.out.println("Enter The Number-");
		number = input.nextInt();
	}

	public void logic() {
		System.out.println("Multiple Of Number are:-");
		for (int i = 1; i <= number; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		MultipleOfAnyNumber object = new MultipleOfAnyNumber();
		object.input();
		object.logic();
	}
}
