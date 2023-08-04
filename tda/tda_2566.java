package tda;

import java.util.Scanner;

public class tda_2566 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int idx_i = 0, idx_j = 0;
		int[][] num = new int[9][9];
		int max_num = -1;
		for(int i =0; i <9;i++) {
			for(int j =0; j <9; j ++) {
				num[i][j] = sc.nextInt();
				if(max_num<num[i][j]) {
					max_num = num[i][j];
					idx_i = i+1;
					idx_j = j+1;
				}
			}
		}
		System.out.println(max_num);
		System.out.println(idx_i+" "+idx_j);

	}
}
