package chap_01;

import java.util.Scanner;

public class 중복문자제거_06 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == i) {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);

    }
}
