package array;

import java.util.Scanner;

public class arr_5597 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] student = new int[30];
		int[] check_student = new int[28];
		int q = 0;
		for (int i = 0; i < 28; i++) {
			check_student[i] = sc.nextInt();
		}

		for (int j = 1; j <= 30; j++) {
			for (int i = 0; i < 28; i++) {
				if (check_student[i] == j) {
					student[j-1]++;
				}
			}
		}
		for (int i = 0; i < 30; i++) {

			if (student[i] == 0) {
				System.out.println(i+1);
			}
		}

	}
}
