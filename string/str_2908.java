package string;

import java.util.Scanner;

public class str_2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();
		char a1;
		char a2;
		char a3;
		char b1;
		char b2;
		char b3;
		String changeA = "";
		String changeB = "";
		int answer = 0;

		for (int i = 0; i < 3; i++) {
			a1 = a.charAt(0);
			a2 = a.charAt(1);
			a3 = a.charAt(2);
			changeA = a3 + "" + a2 + "" + a1;

			b1 = b.charAt(0);
			b2 = b.charAt(1);
			b3 = b.charAt(2);
			changeB = b3 + "" + b2 + "" + b1;
		}
		answer = Integer.parseInt(changeA) > Integer.parseInt(changeB) ? Integer.parseInt(changeA)
				: Integer.parseInt(changeB);
		System.out.print(answer);
	}
}
