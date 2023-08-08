package bruteforce;

import java.util.Scanner;

public class bf_1018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] chess = new int[n][m];
		int[][] test1 = { { 0, 1, 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0, 1, 0 }, { 0, 1, 0, 1, 0, 1, 0, 1 },
				{ 1, 0, 1, 0, 1, 0, 1, 0 }, { 0, 1, 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0, 1, 0 },
				{ 0, 1, 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0, 1, 0 } };
		int[][] test2 = { { 1, 0, 1, 0, 1, 0, 1, 0 }, { 0, 1, 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0, 1, 0 },
				{ 0, 1, 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0, 1, 0 }, { 0, 1, 0, 1, 0, 1, 0, 1 },
				{ 1, 0, 1, 0, 1, 0, 1, 0 }, { 0, 1, 0, 1, 0, 1, 0, 1 }, };
		int count = 0;
		for (int i = 0; i < n; i++) {
			String k = sc.next();
			String[] karr = k.split("");
			for (int j = 0; j < m; j++) {
				switch (karr[j]) {
				case "B":
					chess[i][j] = 0;
					break;
				case "W":
					chess[i][j] = 1;
					break;
				default:
					break;
				}
			}
		}
		int countMax1 = 0;
		int countMax2 = 0;
		int x = 0;
		int y = 0;
		while(x+8==n && y+8==0) {
			int count1 = 0;
			int count2 = 0;
			for(int i =x; i < x+8; i++) {
				for(int j = y; j < y+8; j++) {
					if(test1[i][j] == chess[i][j]) {
						count1++;
					}
					if(test2[i][j] == chess[i][j]) {
						count2++;
					}
				}
			}
			if(countMax1 < count1) {
				countMax1 = count1;
			}
			if(countMax2 < count2) {
				countMax2 = count2;
			}
			count = countMax1 > countMax2 ? countMax1 : countMax2;
			x++;
			y++;
			System.out.println(64-count);
		}
		
		

	}
}
