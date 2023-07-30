package array;

import java.util.Scanner;

public class arr_10810 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		for(int set_a = 0; set_a < n; set_a++) {
			a[set_a] = 0;
		}
		
		for (int q = 0; q < m; q++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();

			for (int start = i; start <= j; start++) {
				a[start-1] = k;
			}
		}
		for(int set_a = 0; set_a < n; set_a++) {
			System.out.print(a[set_a]+" ");
		}

	}
}
