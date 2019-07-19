package prime.number;

import java.util.Scanner;

/**
 * Date-14/07/2019
 * 
 * @author SANJAY
 *
 */
public class PrimeNumber {
	Scanner input = new Scanner(System.in);
	int num;
	int count = 0;

	/**
	 * input method which is use to take the input from the user
	 */
	public void input() {
		System.out.println("Enter the Number to check the Prime Number ");
		num = input.nextInt();
	}

	/**
	 * this method is use to implement the logic
	 */
	public void operation() {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
	}

	/**
	 * This method is use to display the result
	 */
	public void display() {
		if (count == 2) {
			System.out.println("Number is Prime ");
		}

		else {
			System.out.println("Number is Not Prime");
		}
	}

	/**
	 * is use to check the number is divisible by which factor
	 */
	public void numb() {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PrimeNumber ob = new PrimeNumber();
		ob.input();
		ob.operation();
		ob.display();
		ob.numb();
	}
}
