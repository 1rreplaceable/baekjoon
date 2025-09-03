package silver;

import java.util.Scanner;

public class S1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.contains("-")) {
            String[] minusParts = input.split("-");
            String firstPart = minusParts[0];
            String[] plusParts = firstPart.split("\\+");
            int result = 0;
            for (String part : plusParts) {
                result += Integer.parseInt(part);
            }
            for (int i = 1; i < minusParts.length; i++) {
                String part = minusParts[i];
                plusParts = part.split("\\+");
                int sum = 0;
                for (String p : plusParts) {
                    sum += Integer.parseInt(p);
                }
                result -= sum;
            }
            System.out.println(result);

        } else {
            String[] plusParts = input.split("\\+");
            int sum = 0;
            for (String part : plusParts) {
                sum += Integer.parseInt(part);
            }
            System.out.println(sum);
        }
    }
}
