package array;

import java.util.Scanner;

public class arr_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt = sc.nextInt();
		int[] sub = new int[cnt];
		
		double average_total = 0;
		for(int i = 0; i < cnt; i ++) {
			sub[i] = sc.nextInt();
		}
		
		int M = 0;
		
		for(int i =0; i < sub.length; i ++) {
			if(sub[i] > M) {
				M = sub[i];
			}
		}
		
		for(int i =0; i < sub.length; i ++) {
			average_total += (double)sub[i] / M * 100;
		}
		System.out.println(average_total / cnt);
	}
}
