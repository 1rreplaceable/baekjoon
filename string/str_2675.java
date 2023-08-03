package string;

import java.util.Scanner;

public class str_2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int r = sc.nextInt();
			String s = sc.next();

			for (int j = 0; j < s.length(); j++) {
				for (int q = 0; q < r; q++) {
					System.out.print(s.charAt(j));
				}
			}System.out.println();
		}
	}
}
