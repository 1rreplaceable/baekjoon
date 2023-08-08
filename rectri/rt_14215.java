package rectri;

import java.util.Scanner;

public class rt_14215 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		int answer = 0;
		int max_side = 0;
		int small_side = 0;
		for (int i = 0; i < 3; i++) {
			if (max_side < arr[i]) {
				max_side = arr[i];
			}
		}
		if (max_side == arr[0]) {
			small_side = arr[1] + arr[2];
		} else if (max_side == arr[1]) {
			small_side = arr[0] + arr[2];
		} else if (max_side == arr[2]) {
			small_side = arr[0] + arr[1];
		}

		if (small_side > max_side) {
			answer = small_side + max_side;
		} else {
			answer = small_side + (small_side - 1);
		}

		System.out.println(answer);
	}
}
