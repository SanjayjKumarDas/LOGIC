package perfect.number;

import java.util.Scanner;

/**
 * Date-15/07/2019 Program for to check the Perfect Number
 * 
 * @author SANJAY
 *
 */
public class PerfectNumber {
	Scanner input = new Scanner(System.in);
	int number, sum = 0;

	/**
	 * input() is use to take the input from the User
	 */
	public void input() {
		System.out.println("Enter the Number To Check Perfect Number");
		number = input.nextInt();
	}

	/**
	 * logic() is contain the Logic
	 */
	public void logoic() {
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}
	}

	/**
	 * display() is use to to Display the Result
	 */
	public void display() {
		if (sum == number) {
			System.out.println("This is A Perfect Number");
		} else {
			System.out.println("This is A Not Perfect Number");
		}
	}

	public static void main(String[] args) {
		PerfectNumber ob = new PerfectNumber();
		ob.input();
		ob.logoic();
		ob.display();
	}
}
