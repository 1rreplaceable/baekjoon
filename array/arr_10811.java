package array;

import java.util.Scanner;

public class arr_10811 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];

		for (int set_a = 0; set_a < n; set_a++) {
			a[set_a] = set_a + 1;
		}
		
		for (int q = 0; q < m; q++) {
			int i = sc.nextInt() - 1;
			int j = sc.nextInt() - 1;

			while (i < j) {
				int temp = a[i];
				a[i++] = a[j];
				a[j--] = temp;
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
