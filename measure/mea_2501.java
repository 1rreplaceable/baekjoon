package measure;

import java.util.Scanner;

public class mea_2501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int answer = 0;
		int count = 0;
		for (int i = 1; i <= a; i++) {
			if(a % i ==0) {
				count++;
				if(count == b) {
					answer = i;
				}
			}
		}
		System.out.println(answer);
	}
}
