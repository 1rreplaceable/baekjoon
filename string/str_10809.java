package string;

import java.util.Scanner;

public class str_10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] alpha = new int[26];

		String s = sc.next();

		for (int i = 0; i < alpha.length; i++) {
			alpha[i] = -1;
		}

		for (int i = 0; i < s.length(); i++) {
			if (alpha[(int) s.charAt(i) - 97] == -1) {
				alpha[(int) s.charAt(i) - 97] = i;
			}
		}

		for (int i = 0; i < alpha.length; i++) {
			System.out.print(alpha[i] + " ");
		}

	}
}
