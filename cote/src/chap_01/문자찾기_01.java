package chap_01;

import java.util.Scanner;

public class 문자찾기_01 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toUpperCase();
        String s1 = scanner.nextLine().toUpperCase();

        int answer = 0;
        for (String string : s.split("")) {
            if (string.equals(s1)) answer++;
        }
        System.out.println(answer);
    }
}
