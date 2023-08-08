package bruteforce;

import java.util.Scanner;

public class bf_2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int answer = 0;
		for (int i = 1; i < n; i++) {
			int sum = 0;
			String si = i + "";
			int slen = si.length();
			String[] sarr = si.split("");
			int inum = Integer.parseInt(si);
			for (int j = 0; j < slen; j++) {
				sum += Integer.parseInt(sarr[j]);
			}
			if (inum + sum == n) {
				answer = inum;
				break;
			}
		}
		if (answer == 0) {
			System.out.println("0");
		} else {
			System.out.println(answer);
		}

	}
}
