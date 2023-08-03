package string;

import java.util.Scanner;

public class str_5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		String[] si = s.split("");
		int answer = 0;
		int plusNum = 0;
		for (int i = 0; i < si.length; i++) {
			switch (si[i]) {
			case "A":
			case "B":
			case "C":
				plusNum = 3;
				break;
			case "D":
			case "E":
			case "F":
				plusNum = 4;
				break;
			case "G":
			case "H":
			case "I":
				plusNum = 5;
				break;
			case "J":
			case "K":
			case "L":
				plusNum = 6;
				break;
			case "M":
			case "N":
			case "O":
				plusNum = 7;
				break;
			case "P":
			case "Q":
			case "R":
			case "S":
				plusNum = 8;
				break;
			case "T":
			case "U":
			case "V":
				plusNum = 9;
				break;
			case "W":
			case "X":
			case "Y":
			case "Z":
				plusNum = 10;
				break;
			default:
				break;
			}
			answer += plusNum;
		}
		System.out.println(answer);
	}
}
