package math1;

import java.util.Scanner;

public class m1_2720 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int quater = 0, dime =0, nickel = 0, penny = 0;
		int n = sc.nextInt();
		String[] arr = new String[n];
		for(int i =0; i <n; i++) {
			int q = sc.nextInt();
			quater = q / 25;
			dime = q%25 / 10;
			nickel = q % 25 % 10 / 5;
			penny = q % 5;
			System.out.println(quater+" "+ dime+" "+ nickel+" "+ penny);
		}
	}
}
