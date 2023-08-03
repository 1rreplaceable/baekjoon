package string;

import java.util.Scanner;

public class str_1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		String[] arr = s.trim().split(" ");
		if (s.trim().equals("")) {
			System.out.print("0");
		} else {
			System.out.print(arr.length);
		}
	}
}
