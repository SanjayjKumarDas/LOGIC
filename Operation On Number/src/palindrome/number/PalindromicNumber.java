package palindrome.number;

import java.util.Scanner;

public class PalindromicNumber {
	Scanner input = new Scanner(System.in);
	int number, rem, temp, rev = 0;

	public void input() {
		System.out.println("Enter The Number");
		number = input.nextInt();
		temp = number;
	}

	public void logic() {
		while (number > 0) {
			rem = number % 10;
			rev = rev * 10 + rem;
			number = number / 10;
		}
	}

	public void display() {
		number = temp;
		if (number == rev) {
			System.out.println("Number is Palindromic ");
		} else {
			System.out.println("Not Palindromic Number");
		}
	}

	public static void main(String[] args) {
		PalindromicNumber object = new PalindromicNumber();
		object.input();
		object.logic();
		object.display();
	}
}
