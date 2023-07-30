package array;

import java.util.Scanner;

public class arr_10813 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];

		int change = 0;

		for (int set_a = 0; set_a < n; set_a++) {
			a[set_a] = set_a + 1;
		}

		for (int q = 0; q < m; q++) {
			int i = sc.nextInt();
			int j = sc.nextInt();

			change = a[i - 1];
			a[i - 1] = a[j - 1];
			a[j - 1] = change;
		}
		for (int show_a = 0; show_a < n; show_a++) {
			System.out.print(a[show_a] + " ");
		}

	}
}
