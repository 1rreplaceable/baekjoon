package simhwa;

import java.util.Scanner;

public class sim_10988 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		String[] si = s.split("");
		int repeat = si.length / 2;
		int count = 0;
		
		for(int i = 0; i <repeat; i++) {
			if(si[i].equals(si[si.length-1-i])) {
				count++;
			}
		}
		if(count==repeat) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
	}
}
