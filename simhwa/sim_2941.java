package simhwa;

import java.util.Scanner;

public class sim_2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		String[] si = s.split("");
		int len = si.length;
		for (int i = 1; i < si.length; i++) {

			if (si[i].equals("=")) {
				if (i > 1 && si[i - 1].equals("z") && si[i - 2].equals("d")) {
					len -= 2;
					continue;
				} else if (si[i - 1].equals("c") || si[i - 1].equals("z") || si[i - 1].equals("s")) {
					len--;
					continue;
				}
			} else if (si[i].equals("-")) {
				if (si[i - 1].equals("d") || si[i - 1].equals("c")) {
					len--;
					continue;
				}
			} else if (si[i].equals("j")) {
				if (si[i - 1].equals("l") || si[i - 1].equals("n")) {
					len--;
					continue;
				}
			} else {
				continue;
			}
		}
		System.out.println(len);
	}
}
