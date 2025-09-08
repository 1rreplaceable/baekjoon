package gold;

import java.util.Scanner;

public class G1043 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] graph = new int[n][m];


        int knowCnt = in.nextInt();
        int[] know = new int[knowCnt];
        for (int i = 0; i < knowCnt; i++) {
            know[i] = in.nextInt();
        }
        int partyCnt = in.nextInt();
        for (int i = 0; i < partyCnt; i++) {
            int a = in.nextInt();
            checkAndPush(a, know);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (check(i, know)) {
                    graph[j][i] = 1;
                } else {
                graph[j][i] = 0;
                }
            }
        }
        int result = m;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (graph[j][i] == 1) {
                    result--;
                    break;
                }
            }
        }
        System.out.println(result);
    }

    public static void checkAndPush(int i, int[] know) {
        for (int k : know) {
            if (k == i) return;
        }
        know[know.length] = i;
    }
    public static Boolean check(int i, int[] know) {
        for (int k : know) {
            if (k == i) return true;
        }
        return false;
    }
}
