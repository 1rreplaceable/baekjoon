package silver;

import java.util.Scanner;

public class S1124 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        if (m == n) {
            System.out.println(0);
            return;
        }
        int result = 0;
        for (int i = n; i <= m; i++) {
            result += primeFactorCount(i);
        }
        System.out.println(result);
    }

    public static int primeFactorCount(int a) {
        int count = 0;
        int result = 0;
        for (int i = 2; i <= a; i++) {
            while (a % i == 0) {
                count++;
                a /= i;
            }
        }
        int cnt = 0;
        for (int i = 2; i < count; i++) {
            if (count % i == 0) {
                cnt++;
            }
        }
        if (cnt == 1) result++;
        return result;
    }


}
