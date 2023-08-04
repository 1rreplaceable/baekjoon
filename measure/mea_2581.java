package measure;

import java.util.Scanner;

public class mea_2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		int minsosu = n;

		int sum = 0;
		int sosucnt = 0;
		for (int i = m; i <= n; i++) {
			int sosu = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					sosu++;
				}
			}
			if (sosu == 2) {
				sum += i;
				sosucnt++;
				if(minsosu > i) {
					minsosu = i;
				}
			}
		}
		if (sosucnt == 0) {
			System.out.println("-1");
		} else {
			System.out.println(sum);
			System.out.println(minsosu);
		}

	}
}
