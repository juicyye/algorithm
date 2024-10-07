package chap_01;

import java.util.Scanner;

public class 회문문자열_07 {
    static String solution(String str) {
        String answer = "yes";
        str = str.toUpperCase();

        int len =str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return "no";
            }
        }

        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)) {
            return "yes";
        }
        return "no";
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("solution(s) = " + solution(s));

    }
}
