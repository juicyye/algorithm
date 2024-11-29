package silver.week2;

import java.util.Scanner;

public class 삼의배수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int count = 0;
        while (s.length() > 1) {
            s = String.valueOf(s
                    .chars()
                    .map(i -> i - '0')
                    .sum());
            count++;
        }

        System.out.println(count);
        System.out.println(Integer.parseInt(s) % 3 == 0 ? "YES" : "NO");
    }
}
