package tableofanynumber;

import java.util.Scanner;

/**
 * Date-20/07/2019
 * 
 * Table Of Any Number
 * 
 * @author SANJAY
 *
 */
public class TableOfAnyNumber {
	Scanner input = new Scanner(System.in);
	int number, tem;;

	public void input() {
		System.out.println("Enter Any Number To Find Out Table Of That Nubmber");
		number = input.nextInt();
	}

	public void logic() {

		for (int i = 1; i <= 10; i++) {
			tem = number * i;
			System.out.println(number + "\t*" + i + "\t=" + tem);
		}
	}

	public static void main(String[] args) {
		TableOfAnyNumber ob = new TableOfAnyNumber();
		ob.input();
		ob.logic();
	}
}
