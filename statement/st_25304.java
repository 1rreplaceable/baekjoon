package statement;

import java.util.Scanner;

public class st_25304 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int total_price = sc.nextInt();
		int count = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < count; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			sum += (a * b);
		}
		
		if(sum == total_price) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
