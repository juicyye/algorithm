package chap_01;

import java.util.Scanner;

public class 팰린드룸_08 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().replaceAll("[^a-zA-Z]","").toUpperCase();

        int length = s.length();
        boolean result = true;
        for (int i = 0; i < length; i++) {
            if(s.charAt(i) != s.charAt(length - i - 1)) {
                result = false;
                break;
            }
        }
        System.out.println(result ? "YES" : "NO");


    }
}
