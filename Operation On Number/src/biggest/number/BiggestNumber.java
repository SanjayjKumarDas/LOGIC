package biggest.number;

import java.util.Scanner;

/**
 * @author SANJAY
 *
 */
public class BiggestNumber {
	Scanner input = new Scanner(System.in);
	int num1, num2, num3;

	public void input() {
		System.out.println("Enter The Numbers :");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
	}

	public void logic() {
		if (num1 > num2 && num1 > num3) {
			System.out.println("Num1 is Grater:" + num1);
		} else {
			if (num2 > num1 && num2 > num3) {
				System.out.println("Number 2 is Greater:" + num2);
			} else {
				System.out.println("Number 3 is Greater" + num3);
			}
		}
	}

	public static void main(String[] args) {
		BiggestNumber ob = new BiggestNumber();
		ob.input();
		ob.logic();
	}
}
