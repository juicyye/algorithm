package chap_01;

import java.util.Scanner;

public class 팰린드룸_08 {
    static String solution(String str) {
        String answer = "No";
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)) {
            return "yes";
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("solution(s) = " + solution(s));

    }
}
