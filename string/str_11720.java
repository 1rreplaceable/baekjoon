package string;

import java.util.Scanner;

public class str_11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int sum = 0;

		String s = sc.next();

		for (int i = 0; i < n; i++) {
			sum += (int)s.charAt(i)-48;
		}
		System.out.println(sum);
	}
}
