package simhwa;

import java.util.Scanner;

public class sim_25206 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double sum = 0;
		double g = 0;
		double subject = 0;
		for (int i = 0; i < 20; i++) {
			String s = sc.nextLine();

			String[] k = s.split(" ");
			String grade = k[2];
			if (grade.equals("P") || grade.equals("F")) {
				subject -= Double.parseDouble(k[1]);
				g = 0;
			} else {
				switch (grade) {
				case "A+":
					g = 4.5;
					break;
				case "A0":
					g = 4.0;
					break;
				case "B+":
					g = 3.5;
					break;
				case "B0":
					g = 3.0;
					break;
				case "C+":
					g = 2.5;
					break;
				case "C0":
					g = 2.0;
					break;
				case "D+":
					g = 1.5;
					break;
				case "D0":
					g = 1.0;
					break;
				default:
					break;
				}
			}

			sum += (Double.parseDouble(k[1]) * g);
			subject += Double.parseDouble(k[1]);

		}
		if (sum == 0) {
			System.out.print("0.000000");
		} else {
			System.out.printf("%.6f", sum / subject);
		}
	}
}
