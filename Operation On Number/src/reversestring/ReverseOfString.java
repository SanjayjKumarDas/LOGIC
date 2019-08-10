package reversestring;

import java.util.Scanner;

/**
 * Date-11/08/2019
 * 
 * Reverse Of A String
 * 
 * @author SANJAY
 *
 */
public class ReverseOfString {
	String name, rev = "";

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String Value");
		name = sc.nextLine();
	}

	public void logic() {
		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		ReverseOfString ob = new ReverseOfString();
		ob.input();
		ob.logic();
	}
}
