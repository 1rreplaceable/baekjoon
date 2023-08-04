package measure;

import java.util.Scanner;

public class mea_11653 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int sosucnt = 0;
		int k = n;
		while (n!=1) {
			for (int j = 1; j <= n; j++) {
				if (n % j == 0) {
					sosucnt++;
				}
			}
			if (sosucnt == 2) {
				System.out.println(n);
				break;
			}
			for (int i = 2; i <= k / 2; i++) {

				if (n % i == 0) {
					n /= i;
					System.out.println(i);
					i--;
				}
			}
		}

	}
}
