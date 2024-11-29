package basic.week2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 민균이의비밀번호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> set = new HashSet<>();
        String answer = "";

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            set.add(s);
            String reverse = new StringBuilder(s).reverse().toString();
            if (set.contains(reverse)) {
                answer = s;
                break;
            }


        }

        int length = answer.length();

        char middle = answer.charAt(length / 2);

        System.out.println(length + " " + middle);
    }
}
