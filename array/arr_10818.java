package array;

import java.util.Scanner;

public class arr_10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];

		int min_n = 1000000;
		int max_n = -1000000;
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			
			if (a[i] < min_n) {
				min_n = a[i];
			}
			if (a[i] > max_n) {
				max_n = a[i];
			}
		}
		
		System.out.println(min_n + " " + max_n);
	}
}
