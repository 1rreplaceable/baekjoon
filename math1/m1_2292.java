package math1;

import java.util.Scanner;

public class m1_2292 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int lastNum = 1;
		int answer = 1;
		int idx = 1;
		int i =0;
		while (lastNum < n) {
			lastNum += 6 * idx;
			answer++;
			idx++;
		}
		System.out.println(answer);

	}
}
