package simhwa;

import java.util.Scanner;

public class sim_1316 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int check = n;
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			int same = 0;
			String s = sc.next();
			String[] arr = s.split("");

			for (int j = 0; j < arr.length; j++) {
				for (int q = j + 1; q < arr.length; q++) {
					if (arr[j].equals(arr[q])) {
						for (int start = q; j < start; start--) {
							if (arr[start].equals(arr[j])) {
								count++;
							}
						}
						if (count != q - j) {
							check--;
							same++;
							if(same>1) {
								check++;
							}
							
							break;
						}
					}
				}
			}

		}
		System.out.println(check);
	}
}
