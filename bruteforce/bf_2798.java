package bruteforce;

import java.util.Scanner;

public class bf_2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		int idxNum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int o = j + 1; o < n; o++) {
					if ((arr[i] + arr[j] + arr[o]) > idxNum && (arr[i] + arr[j] + arr[o]) <= m) {
						idxNum = (arr[i] + arr[j] + arr[o]);
					}
				}
			}
		}

		System.out.println(idxNum);
	}
}
