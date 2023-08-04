package tda;

import java.util.Scanner;

public class tda_10798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] word = new String[5];
		int maxSizeWord = -1;

		String[] divWord = new String[5];
		for (int i = 0; i < 5; i++) {
			word[i] = sc.nextLine();
			if (word[i].length() > maxSizeWord) {
				maxSizeWord = word[i].length();
			}
		}
		String[][] words = new String[5][maxSizeWord];

		for (int i = 0; i < 5; i++) {
			String[] s = word[i].split("");
			for (int j = 0; j < word[i].length(); j++) {
				words[i][j] = s[j];
			}
		}

		for (int i = 0; i < maxSizeWord; i++) {
			for (int j = 0; j < 5; j++) {
				if (words[j][i] != null) {
					System.out.print(words[j][i]);
				}
			}
		}

	}
}
