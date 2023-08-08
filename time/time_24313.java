package time;

import java.util.Scanner;

public class time_24313 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a1 = sc.nextInt();
			int a0 = sc.nextInt();
			int c = sc.nextInt();
			int n0 = sc.nextInt();
			int count = 0;
			for(int n =n0; n <=100; n++ ) {
				int fn = a1 * n + a0;
				int gn = n;
				
				if(fn > c * gn) {
					System.out.println("0");
					break;
				}else {
					count++;
				}
			}
			
			if(count == 100-n0+1) {
				System.out.println("1");
			}
			
		}
}
