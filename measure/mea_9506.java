package measure;

import java.util.Scanner;

public class mea_9506 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = 0;

		while (true) {
			
			int answer = 0;
			int answer2 = 0;
			a = sc.nextInt();
			if(a==-1) {
				break;
			}
			System.out.print(a);
			for (int i = 1; i < a; i++) {
				if (a % i == 0) {
					answer += i;
				}
			}
			if (answer == a) {
				System.out.print(" = ");

				for (int i = 1; i < a; i++) {
					if (a % i == 0) {
						System.out.print(i);
						answer2 += i;
						if (answer2 != a) {
							System.out.print(" + ");
						}
					}
				}
			} else {
				System.out.print(" is NOT perfect.");
			}System.out.println();

		}

	}
}
