package measure;

import java.util.Scanner;

public class mea_5086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = -1;
		int b = -1;
		String answer = "";

		while (true) {
			
			a = sc.nextInt();
			b = sc.nextInt();
			if(a==0 && b==0) {
				break;
			}
			if (a % b == 0) {
				answer = "multiple";
			} else if (b % a == 0) {
				answer = "factor";
			} else {
				answer = "neither";
			}
			System.out.println(answer);
		}
	}
}
