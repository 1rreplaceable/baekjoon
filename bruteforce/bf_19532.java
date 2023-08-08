package bruteforce;

import java.util.Scanner;

public class bf_19532 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		int answerX = 0;
		int answerY = 0;
		for (int x = -999; x < 1000; x++) {
			for (int y = -999; y < 1000; y++) {
				if (a * x + b * y == c) {
					if (d * x + e * y == f) {
						answerX = x;
						answerY = y;
					}
				}
			}
		}
		System.out.println(answerX + " " + answerY);

	}
}
