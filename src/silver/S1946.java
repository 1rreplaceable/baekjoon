package silver;

import java.util.*;

public class S1946 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        for (int i=0; i < a; i++) {
            int b = sc.nextInt();
            List<int[]> pairs = new ArrayList<>();
            for (int j=0; j<b; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                pairs.add(new int[]{x, y});
            }
            pairs.sort((p1, p2) -> p1[0] - p2[0]);
            int answer = 0;
            int minY = pairs.get(0)[1];

            for (int[] w: pairs) {
                if (w[1] <= minY) {
                    minY = w[1];
                    answer++;
                }
            }
            System.out.println(answer);
        }

    }
}
