package math1;

import java.util.Scanner;

public class m1_2903 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int first = 2;
		int k = 1;
		for(int i =1; i <= n; i++) {
			k *= 2;
			first = k + 1;
		}
		System.out.println(first*first);
	}
}
