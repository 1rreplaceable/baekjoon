package simhwa;

import java.util.Scanner;

public class sim_1157 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] alpha = new int[26];
		String s = sc.next();

		String[] si = s.split("");

		for (int i = 0; i < si.length; i++) {
			char c = si[i].toLowerCase().charAt(0);
			alpha[(int) c - 97]++;
		}
		int max_char = 0;
		int idx = 0;
		int maxcnt = 0;
		for (int i = 0; i < 26; i++) {
			if (alpha[i] > idx) {
				max_char = i;
				idx = alpha[i];
			}
		}
		for (int i = 0; i < 26; i++) {
			if (alpha[i] == idx) {
				maxcnt++;
			}
		}
		if (maxcnt > 1) {
			System.out.println("?");
		} else {
			int k = max_char + 65;
			char ch = (char) k;
			System.out.println(ch);

		}

	}
}
