package rectri;

import java.util.Scanner;

public class rt_5073 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int side1 = sc.nextInt();
			int side2 = sc.nextInt();
			int side3 = sc.nextInt();
			if(side1 == 0 && side2==0 && side3==0) {
				break;
			}
			int[] side = new int[3];
			String answer = "";
			side[0] = side1;
			side[1] = side2;
			side[2] = side3;
			int max = 0;
			for(int i =0; i <3; i++) {
				if(max < side[i]) {
					max = side[i];
				}
			}
			
			if(side[0]==side[1]&& side[1]==side[2]) {
				answer="Equilateral ";
			}else if(side[0]==side[1] || side[0]== side[2]||side[1]==side[2]) {
				answer="Isosceles";
			}else {
				answer="Scalene";
			}
			if(max*2 >= (side[0]+side[1]+side[2])) {
				answer="Invalid";
			}
			System.out.println(answer);
		}

	}
}
