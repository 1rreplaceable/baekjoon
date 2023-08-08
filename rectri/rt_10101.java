package rectri;

import java.util.Scanner;

public class rt_10101 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ang1 = sc.nextInt();
		int ang2 = sc.nextInt();
		int ang3 = sc.nextInt();
		int[] angle = new int[181];
		String answer = "";

		angle[ang1]++;
		angle[ang2]++;
		angle[ang3]++;
		for (int i = 0; i < angle.length; i++) {
			if (ang1 + ang2 + ang3 == 180) {
				answer = "Scalene";
				if (angle[i] == 2) {
					answer = "Isosceles";
					break;
				}
			} else {
				answer = "Error";
			}
		}

		if (ang1 == 60 && ang2 == 60 && ang3 == 60) {
			answer = "Equilateral";
		}

		System.out.println(answer);
	}
}
