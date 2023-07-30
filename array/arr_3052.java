package array;

import java.util.Scanner;

public class arr_3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt = 0;
		// set nam[]
		int[] nam = new int[42];
		for (int i = 0; i < 10; i++) {
			int k = sc.nextInt();
			nam[k % 42]++;

		}
		for (int n = 0; n < 42; n++) {
			if (nam[n] > 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
