package array;

import java.util.Scanner;

public class arr_2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[9];
		int idx = 0;
		int max_n = -1;
		
		for (int i = 0; i < 9; i++) {
			a[i] = sc.nextInt();
			
			if (a[i] > max_n) {
				max_n = a[i];
				idx = i + 1;
			}
		}
		
		System.out.println(max_n);
		System.out.println(idx);
	}
}
