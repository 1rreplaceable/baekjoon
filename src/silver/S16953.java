package silver;

import java.util.Scanner;

public class S16953 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int a = S.nextInt();
        int b = S.nextInt();
        int count = 0;

        if (b <= a) {
            System.out.println(-1);
            return;
        }
        do {
            count++;
            if (b % 10 == 1) {
                b /= 10;
            } else if (b % 2 == 0) {
                b /= 2;
            } else {
                System.out.println(-1);
                return;
            }
            if (b < a) {
                System.out.println(-1);
                return;
            }
        } while (b != a);
        System.out.println(count+1);

    }
}
