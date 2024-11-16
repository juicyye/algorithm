package basic.week1;

import java.util.Scanner;

public class 문자열반복 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int r = sc.nextInt();
            String s = sc.next();

            for (String string : s.split("")) {
                sb.append(string.repeat(r));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
