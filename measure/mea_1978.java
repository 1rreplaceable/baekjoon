package measure;

import java.util.Scanner;

public class mea_1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int check=0;
		for(int i =0; i <a; i++) {
			int cnt = 0;
			int k = sc.nextInt();
			for(int j=1;j <=k; j++) {
				if(k % j ==0) {
					cnt++;
				}
			}
			if(cnt==2) {
				check++;
			}
		}
		System.out.println(check);
	}
}
