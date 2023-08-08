package rectri;

import java.util.Scanner;

public class rt_9063 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] xArr = new int[n];
		int[] yArr = new int[n];
		for (int i = 0; i < n; i++) {
			xArr[i] = sc.nextInt();
			yArr[i] = sc.nextInt();
		}
		int max_x = -10001;
		int max_y = -10001;
		int min_x = 10001;
		int min_y = 10001;
		for (int i = 0; i < n; i++) {

			if (max_x < xArr[i]) {
				max_x = xArr[i];
			}
			if (max_y < yArr[i]) {
				max_y = yArr[i];
			}
			if (min_x > xArr[i]) {
				min_x = xArr[i];
			}
			if (min_y > yArr[i]) {
				min_y = yArr[i];
			}
		}
		System.out.println((max_x - min_x) * (max_y - min_y));

	}
}
